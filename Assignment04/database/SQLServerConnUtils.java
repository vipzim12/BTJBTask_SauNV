package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils {
	public static Connection getSQLServerConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";
		String sqlInstanceName = "SQLEXPRESS";
		String database = "ManageAccount";
		String username = "sau";
		String password = "123";

		return getSQLServerConnection(hostName, sqlInstanceName, database, username, password);
	}

	public static Connection getSQLServerConnection(String hostName, String sqlInstanceName, String database,
			String username, String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionURL = "jdbc:sqlserver://" + hostName + ":60722" + ";instance=" + sqlInstanceName
				+ ";databaseName=" + database;
		Connection conn = DriverManager.getConnection(connectionURL, username, password);
		return conn;
	}
}
