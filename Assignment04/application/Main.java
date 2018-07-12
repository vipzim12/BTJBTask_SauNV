package application;

import database.AppConnectDb;
import java.sql.SQLException;

public class Main {
  /**
   * Main.
   * 
   * @param args
   *          .
   * @throws ClassNotFoundException
   *           .
   * @throws SQLException
   *           .
   */
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    AppConnectDb appConnectDb = new AppConnectDb();
    HandleInput handleInput = new HandleInput();
    User user = handleInput.enterInfoUser();

    if (appConnectDb.isExistUserInDb(user)) {
      appConnectDb.updateUserToDb(user);
      System.out.println("Update success!");
    } else {
      System.out.println("Creating new user...");
      appConnectDb.addUserInDb(user);
    }
    System.out.println("List Information Of Users");
    appConnectDb.showListProfile();
  }

}
