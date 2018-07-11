package application;

import java.sql.SQLException;
import java.util.Scanner;

import database.AppConnectDB;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AppConnectDB appConnectDB = new AppConnectDB();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter infomation: ");
		System.out.print("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter your Account: ");
		String account = sc.nextLine();
		System.out.println("Enter your Email: ");
		String email = sc.nextLine();
		User user = new User(firstName, lastName, account, email);

		if (appConnectDB.isExistUserInDB(user)) {
			appConnectDB.updateUserToDB(user);
			System.out.println("Update success!");
		} else {
			System.out.println("Creating new user...");
			appConnectDB.addUserInDB(user);
			System.out.println("Update Success!");
		}
		System.out.println("List Information Of Users");
		appConnectDB.showListProfile();
	}

}
