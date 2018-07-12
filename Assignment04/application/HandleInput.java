package application;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HandleInput {
  Scanner sc = new Scanner(System.in);

  /**
   * Enter info of User.
   * 
   * @return Object user.
   */
  public User enterInfoUser() {
    System.out.println("Please Enter infomation: ");
    System.out.print("Enter your First Name: ");
    String firstName = sc.nextLine();
    while (true) {
      if (firstName.isEmpty()) {
        System.out.println("First Name not empty, Please enter again!");
        System.out.print("Enter your First Name: ");
        firstName = sc.nextLine();
      } else {
        break;
      }
    }
    System.out.print("Enter your Last Name: ");
    String lastName = sc.nextLine();
    while (true) {
      if (lastName.isEmpty()) {
        System.out.println("Last Name not empty, Please enter again!");
        System.out.print("Enter your Last Name: ");
        lastName = sc.nextLine();
      } else {
        break;
      }
    }
    System.out.print("Enter your Account: ");
    String account = sc.nextLine();
    while (true) {
      if (account.isEmpty()) {
        System.out.println("Account not empty, Please enter again!");
        System.out.print("Enter your Account: ");
        account = sc.nextLine();
      } else {
        break;
      }
    }
    System.out.println("Enter your Email: ");
    String email = sc.nextLine();
    while (true) {
      if (email.isEmpty() || !isValidEmail(email)) {
        System.out.println("Email is not a vaild Email, Please enter again(Ex: abc@xyz.com)!");
        System.out.print("Enter your Email: ");
        email = sc.nextLine();
      } else {
        break;
      }
    }
    return new User(firstName, lastName, account, email);
  }

  /**
   * Check fomat input email.
   * 
   * @param email
   *          email of user.
   * @return true if email valid.
   */
  public boolean isValidEmail(String email) {
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
        + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
    Pattern pat = Pattern.compile(emailRegex);
    if (email == null) {
      return false;
    }
    return pat.matcher(email).matches();
  }
}
