package application;

public class User {
	private String lastName;
	private String firstName;
	private String account;
	private String email;

	public User(String firstName, String lastName, String account, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
		this.email = email;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String toString() {
		return "FullName: " + firstName + " " + lastName + "     Account: " + account + "     Email: " + email;
	}
}
