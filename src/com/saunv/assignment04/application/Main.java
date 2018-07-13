package com.saunv.assignment04.application;

import java.sql.SQLException;

import com.saunv.assignment04.database.AppConnectDb;

public class Main {
  /**
   * Main.
   * 
   * @param args
   *          .
   * @throws ClassNotFoundException
   *           Get error not found class.
   * @throws SQLException
   *           Get error Sql.
   */
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    AppConnectDb appConnectDb = new AppConnectDb();
    HandleInput handleInput = new HandleInput();
    User user = handleInput.enterInfoUser();

    if (appConnectDb.isExistUserInDb(user)) {
      appConnectDb.updateUserToDb(user);
      System.out.println("Update info of user success!");
    } else {
      System.out.println("Creating new user...");
      appConnectDb.addUserInDb(user);
    }
    System.out.println("----------Lists User-----------");
    appConnectDb.showListProfile();
  }

}
