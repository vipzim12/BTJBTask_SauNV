package com.saunv.assignment03.exercises01;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ImlLuyThua imlLuyThua = new ImlLuyThua();
    System.out.println("Enter input number:");
    int n = sc.nextInt();
    System.out.println("Gia tri binh phuong cua " + n + " la: " + imlLuyThua.binhPhuong(n));
    System.out.println("Gia tri lua thua 3 cua " + n + " la: " + imlLuyThua.luyThua3(n));
    sc.close();
  }
}
