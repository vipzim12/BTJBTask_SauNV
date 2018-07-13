package com.saunv.assignment01.exercises2_Interface;

public class SelectionSort extends DaySo implements Sort {

	public SelectionSort() {
		super();
	}

	public void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	@Override
	public void Sort() {
		selectionSort(getArr());
	}

}
