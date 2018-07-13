package com.saunv.assignment03.exercises04;

public class Contact {
	private String nameContact;
	private String telephoneNumber;

	public Contact(String nameContact, String telephoneNumber) {
		this.nameContact = nameContact;
		this.telephoneNumber = telephoneNumber;
	}

	public String getNameContact() {
		return nameContact;
	}

	public void setNameContact(String nameContact) {
		this.nameContact = nameContact;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String toString() {
		return nameContact + " " + telephoneNumber;
	}
}
