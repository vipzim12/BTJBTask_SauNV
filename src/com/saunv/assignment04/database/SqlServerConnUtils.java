package com.saunv.assignment04.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlServerConnUtils {
  /**
   * Constructor connect to database.
   * 
   * @return Connection.
   * @throws SQLException
   *           Get error.
   * @throws ClassNotFoundException
   *           Get error.
   */
  public static Connection getSqlServerConnection() throws SQLException, ClassNotFoundException {
    String hostName = "localhost";
    String sqlInstanceName = "SQLEXPRESS";
    String database = "ManageAccount";
    String username = "sau";
    String password = "123";

    return getSqlServerConnection(hostName, sqlInstanceName, database, username, password);
  }

  /**
   * Get connection.
   * 
   * @param hostName
   *          Localhost.
   * @param sqlInstanceName
   *          Type Express
   * @param database
   *          Table in database.
   * @param username
   *          Password of account connect to Sql server.
   * @param password
   *          Password of account connect to Sql server.
   * @return Connection.

   * @throws SQLException
   *           Get error Connect.
   */
  public static Connection getSqlServerConnection(String hostName, String sqlInstanceName,
      String database, String username, String password)
      throws ClassNotFoundException, SQLException {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String connectionUrl = "jdbc:sqlserver://" + hostName + ":28202" + ";instance="
        + sqlInstanceName + ";databaseName=" + database;
    Connection conn = DriverManager.getConnection(connectionUrl, username, password);
    return conn;
  }
}
