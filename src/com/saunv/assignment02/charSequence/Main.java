package com.saunv.assignment02.charSequence;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ReverseString reverseString = new ReverseString();
    Scanner sc = new Scanner(System.in);
    System.out.println("Input string to reverseString: ");
    String str = sc.nextLine();
    System.out.println(reverseString.reverseString(str).toString());
    sc.close();
  }
}
