package com.bridgelabz.bubblesort_descendingorder;

public class BubbleSortDesc {

	public int[] bubbleSortDescending(int[] intArray) {

		int n = intArray.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - 1 - i); j++) {
				if (intArray[j] < intArray[j + 1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
				}
			}
		}
		return intArray;
	}
}
