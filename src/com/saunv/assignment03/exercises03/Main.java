package com.saunv.assignment03.exercises03;

import java.util.Scanner;

public class Main {
  public static double binhPhuong(int x) {
    return x * x;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    do {
      System.out.println("Nhap vao so phan tu: ");
      n = sc.nextInt();
    } while (n < 0);
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }
    System.out.println("Mang cac phan tu da nhap: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + "\t");
    }
    int max = 0;
    int min = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
        System.out.println(min);
      }
    }
    System.out.println("\nBinh phuong cua phan tu lon nhat: " + binhPhuong(max));
    System.out.println("Binh phuong cua phan tu nho nhat: " + binhPhuong(min));
    sc.close();
  }

}
