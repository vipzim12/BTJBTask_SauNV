package com.saunv.assignment04.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.saunv.assignment04.application.User;

/**
 * Class Connect to Database.
 * 
 * @author SauNV
 *
 */
public class AppConnectDb {
  private Connection myConnection;
  private Statement myStatement;
  List<User> listAccount;
  PreparedStatement preparedStatement;
  ResultSet resultSet = null;

  /**
   * Constructor connect to database.
   * 
   * @throws ClassNotFoundException
   *           Get error connect.
   * @throws SQLException
   *           Get error connect.
   */
  public AppConnectDb() throws ClassNotFoundException, SQLException {
    myConnection = SqlServerConnUtils.getSqlServerConnection();
    listAccount = new ArrayList<>();
    if (myConnection != null) {
      try {
        myStatement = myConnection.createStatement();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * Get list Account.
   * 
   * @return List
   */
  public List<User> getListAccount() {
    String query = "Select * from " + StructureDb.TABLE_USER;
    try {
      resultSet = myStatement.executeQuery(query);
      while (resultSet.next()) {
        listAccount.add(new User(resultSet.getString(1), resultSet.getString(2),
            resultSet.getString(3), resultSet.getString(4)));
      }
    } catch (SQLException e) {
      e.printStackTrace();
      System.out.println(query);
    }
    return listAccount;
  }

  /**
   * Add a user to database.
   * 
   * @param user
   *          Object user.
   */
  public void addUserInDb(User user) {
    String sql = "INSERT INTO " + StructureDb.TABLE_USER + "(" + StructureDb.FIRSTNAME + ", "
        + StructureDb.LASTNAME + ", " + StructureDb.ACCOUNT + ", " + StructureDb.EMAIL
        + ") VALUES(?,?,?,?)";

    try {
      preparedStatement = myConnection.prepareStatement(sql);
      preparedStatement.setString(1, user.getFirstName());
      preparedStatement.setString(2, user.getLastName());
      preparedStatement.setString(3, user.getAccount());
      preparedStatement.setString(4, user.getEmail());
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Search in database to look user exist.
   * 
   * @param user
   *          Object user.
   * @return If true is exist.
   */
  public boolean isExistUserInDb(User user) {
    String query = "Select " + StructureDb.ACCOUNT + " from " + StructureDb.TABLE_USER;
    boolean result = false;
    try {
      resultSet = myStatement.executeQuery(query);
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

  /**
   * Update info user to database.
   * 
   * @param user
   *          Object user.
   */
  public void updateUserToDb(User user) {
    String sql = "UPDATE " + StructureDb.TABLE_USER + " SET " + StructureDb.FIRSTNAME + "= ?,"
        + StructureDb.LASTNAME + "= ?," + StructureDb.EMAIL + "= ? WHERE " + StructureDb.ACCOUNT
        + "= ?";
    try {
      preparedStatement = myConnection.prepareStatement(sql);
      preparedStatement.setString(1, user.getFirstName());
      preparedStatement.setString(2, user.getLastName());
      preparedStatement.setString(4, user.getAccount());
      preparedStatement.setString(3, user.getEmail());
      preparedStatement.execute();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * Print list user from database.
   */
  public void showListProfile() {
    listAccount = getListAccount();
    for (int i = 0; i < listAccount.size(); i++) {
      System.out.println("The user "+(i+1)+" : ");
      System.out.println(listAccount.get(i).toString());
      System.out.println("------------------------------------");
    }
  }
}
