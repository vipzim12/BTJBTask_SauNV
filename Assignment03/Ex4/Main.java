package Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ContactData contactData = new ContactData();
		Scanner sc = new Scanner(System.in);
		int selection;
		contactData.showListContact();
		while (true) {
			System.out.println("----------Contact Data----------");
			System.out.println("Enter the selection...");
			System.out.println("1. Search a contact");
			System.out.println("2. Add a contact");
			System.out.println("3. Delete a contact");
			System.out.println("4. Prinft list contact");
			System.out.println("5. Exit");
			selection = sc.nextInt();
			sc.nextLine();
			switch (selection) {
			case 1:
				System.out.println("-----------SEARCH A CONTACT----------");
				System.out.println("Enter name or telephone numbers of contact, please:");
				String name = sc.nextLine();
				System.out.print("Result:  ");
				contactData.searchContact(name);
				break;
			case 2:
				System.out.println("-----------ADD A CONTACT----------");
				System.out.println("Enter name and telephone numbers of contact, please:");
				System.out.print("Enter name: ");
				String newContact = sc.nextLine();
				System.out.print("Enter the telephone numbers: ");
				String newTelephoneNumber = sc.nextLine();
				contactData.addContact(newContact, newTelephoneNumber);
				System.out.println("Add contact success!");
				break;
			case 3:
				System.out.println("-----------DELETE A CONTACT----------");
				System.out.println("Enter name or telephone numbers to delete, please:");
				System.out.print("Enter name: ");
				String strDelete = sc.nextLine();
				System.out.println("Do you want to delete contact? Y/N");
				contactData.searchContact(strDelete);
				String strTemp = sc.nextLine();
				if (strTemp.equalsIgnoreCase("Y")) {
					contactData.deleteContact(strDelete);
					System.out.println("Deteled contact success!");
				} else {
					System.out.println("Canceled to delete contact");
				}
			case 4:
				System.out.println("-----------PRINT LIST CONTACT----------");
				System.out.println("List contact: ");
				contactData.showListContact();
				break;
			case 5:
				System.out.println("-----------EXITED PROGRAM----------");
				System.exit(1);
			default:
				System.out.println("You must enter number from 1 to 5...");
				break;
			}
		}
	}
}
