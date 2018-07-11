package Ex5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input telephone numbers as fomat (xx) yy-zzzz, please...");
		StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine(), "()-");
		System.out.println("The telephone numbers: ");
		String countryCode = stringTokenizer.nextToken();
		String areaCode = stringTokenizer.nextToken();
		String telephoneNumber = stringTokenizer.nextToken();
		System.out.println("Country Code: " + countryCode);
		System.out.println("Area Code: " + areaCode);
		System.out.println("Telephone Number: " + telephoneNumber);

	}

}
