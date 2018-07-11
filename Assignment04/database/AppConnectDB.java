package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import application.User;

public class AppConnectDB {
	private Connection mConnection;
	private Statement mStatement;
	List<User> mListAccount;
	PreparedStatement preparedStatement;
	ResultSet resultSet = null;

	public AppConnectDB() throws ClassNotFoundException, SQLException {
		mConnection = SQLServerConnUtils.getSQLServerConnection();
		mListAccount = new ArrayList<>();
		if (mConnection != null) {
			try {
				mStatement = mConnection.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<User> getListAccount() {
		String query = "Select * from " + StructureDB.TABLE_USER;
		try {
			resultSet = mStatement.executeQuery(query);
			while (resultSet.next()) {
				mListAccount.add(new User(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(query);
		}
		return mListAccount;
	}

	public void addUserInDB(User user) {
		String sql = "INSERT INTO " + StructureDB.TABLE_USER + "(" + StructureDB.FIRSTNAME + ", " + StructureDB.LASTNAME
				+ ", " + StructureDB.ACCOUNT + ", " + StructureDB.EMAIL + ") VALUES(?,?,?,?)";

		try {
			preparedStatement = mConnection.prepareStatement(sql);
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getAccount());
			preparedStatement.setString(4, user.getEmail());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean isExistUserInDB(User user) {
		String query = "Select " + StructureDB.ACCOUNT + " from " + StructureDB.TABLE_USER;
		boolean result = false;
		try {
			resultSet = mStatement.executeQuery(query);
			while (resultSet.next()) {
				if (user.getAccount().equalsIgnoreCase(resultSet.getString("Account"))) {
					result = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(query);
		}
		return result;
	}

	public void updateUserToDB(User user) {
		String sql = "UPDATE " + StructureDB.TABLE_USER + " SET " + StructureDB.FIRSTNAME + "= ?,"
				+ StructureDB.LASTNAME + "= ?," + StructureDB.EMAIL + "= ? WHERE " + StructureDB.ACCOUNT + "= ?";
		try {
			preparedStatement = mConnection.prepareStatement(sql);
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(4, user.getAccount());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void showListProfile() {
		mListAccount = getListAccount();
		for (int i = 0; i < mListAccount.size(); i++) {
			System.out.println(mListAccount.get(i).toString());
		}
	}
}
