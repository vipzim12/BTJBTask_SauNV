package com.saunv.assignment03.exercises04;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactData {
	List<String> crunchifyList;
	ArrayList<Contact> mListContact = new ArrayList<>();
	int sttCont;
	String urlFile = "C:\\Users\\SauNV\\workspace\\BTJBTask\\Assignment03\\Ex4\\dataFile.txt";

	public ContactData() {
		crunchifyReadFile(urlFile);
	}

	public void crunchifyReadFile(String crunchifyFile) {
		crunchifyList = new ArrayList<>();
		String[] strTemp;
		int sizeList;
		BufferedReader crunchifyBufferReader = null;
		try {
			crunchifyBufferReader = Files.newBufferedReader(Paths.get(crunchifyFile));

		} catch (IOException e) {
			e.printStackTrace();
		}
		crunchifyList = crunchifyBufferReader.lines().collect(Collectors.toList());

		sizeList = crunchifyList.size();
		for (int i = 0; i < sizeList; i++) {
			if (crunchifyList.get(i) != null) {
				strTemp = crunchifyList.get(i).split(" ");
				mListContact.add(new Contact(strTemp[0], strTemp[1]));
			}
		}
	}

	public void writeData(String fileName, List<Contact> mcontact) throws IOException {
		FileWriter fileWriter = new FileWriter(fileName);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		for (int i = 0; i < mcontact.size(); i++) {
			printWriter.println(mcontact.get(i).toString());
		}

		printWriter.close();
	}

	public void showListContact() {
		mListContact.forEach(System.out::println);
	}

	public void addContact(String name, String telephoneNumber) {
		mListContact.add(new Contact(name, telephoneNumber));
		try {
			writeData(urlFile, mListContact);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean isExistContact(String nameContact) {
		boolean isExitContact = false;
		int sizeList = mListContact.size();
		for (int i = 0; i < sizeList; i++) {
			if (nameContact.equalsIgnoreCase(mListContact.get(i).getNameContact())
					|| nameContact.equals(mListContact.get(i).getTelephoneNumber())) {
				isExitContact = true;
				sttCont = i;
			}
		}
		return isExitContact;
	}

	public void searchContact(String nameContact) {
		if (isExistContact(nameContact) == true) {
			System.out.println(mListContact.get(sttCont).toString());
		} else {
			System.out.println("Can't search for " + nameContact);
		}
	}

	public void deleteContact(String strDeleteContact) {
		if (isExistContact(strDeleteContact)) {
			mListContact.remove(sttCont);
			try {
				writeData(urlFile, mListContact);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Deleted contact " + strDeleteContact + "...");
		}

	}
}
