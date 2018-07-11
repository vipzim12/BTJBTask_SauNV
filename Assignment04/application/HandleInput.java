package application;

import java.util.Scanner;

public class HandleInput {
	Scanner sc = new Scanner(System.in);

	public User enterInfoUser() {
		System.out.println("Please Enter infomation: ");
		System.out.print("Enter First Name: ");
		String firstName;
		do {
			firstName = sc.nextLine();
		} while (checkInfoName(firstName));

		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter your Account: ");
		String account = sc.nextLine();
		System.out.println("Enter your Email: ");
		String email = sc.nextLine();
		return new User(firstName, lastName, account, email);
	}

	public boolean checkInfoName(String str) {
		boolean result = str.isEmpty();
		return result;
	}
}
