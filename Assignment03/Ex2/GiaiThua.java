package Ex2;

import java.util.Scanner;

public class GiaiThua {
	public static double giaiThua(int n) {
		double fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number, please...");
		int n= sc.nextInt();
		System.out.println("Giai thua cua "+n+" la: "+giaiThua(n));
	}
}
