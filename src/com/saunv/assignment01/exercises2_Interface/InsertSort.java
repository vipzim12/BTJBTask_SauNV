package com.saunv.assignment01.exercises2_Interface;

public class InsertSort extends DaySo implements Sort {

	public InsertSort() {
		super();
	}

	public void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	@Override
	public void Sort() {
		insertionSort(getArr());
	}

}
