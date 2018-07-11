package Exercises2_Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int select;
		while (flag) {
			System.out.println("\n------Select the sort, please...------");
			System.out.println("1. QuickSort");
			System.out.println("2. SelectionSort");
			System.out.println("3. InsertSort");
			System.out.println("4. Exit");
			select = sc.nextInt();
			switch (select) {
			case 1:
				QuickSort quickSort = new QuickSort();
				System.out.println("\nProcessing QuickSort...");
				quickSort.Sort();
				System.out.println("Array Sorted: ");
				quickSort.printf();
				break;
			case 2:
				SelectionSort selectionSort = new SelectionSort();
				System.out.println("\nProcessing SelectionSort...");
				selectionSort.Sort();
				System.out.println("Array Sorted: ");
				selectionSort.printf();
				break;
			case 3:
				InsertSort insertSort = new InsertSort();
				System.out.println("\nProcessing InsertSort...");
				insertSort.Sort();
				System.out.println("Array Sorted: ");
				insertSort.printf();
			case 4:
				System.out.println("Exited Program...");
				return ;
			default :
				System.out.println("You must enter a number from 1 to 4...");
				break;
			}
		}
	}

}
