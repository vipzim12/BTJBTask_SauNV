package com.saunv.assignment01.exercises2_Interface;

import java.util.Scanner;

public class DaySo {
	Scanner sc = new Scanner(System.in);
	int arr[];

	public DaySo() {
		Nhap();
		System.out.println("The elements of array: ");
		printf();
	}

	public void Nhap() {
		System.out.println("Enter the number of elements of array: ");
		int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the array...  ");
		int temp = 0;
		int value;
		while (temp < n) {
			System.out.println("Enter the elements " + (temp + 1) + ": ");
			value = sc.nextInt();
			arr[temp] = value;
			temp++;
		}
	}

	public void printf() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("  " + arr[i]);
		}
		System.out.println();
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

}
