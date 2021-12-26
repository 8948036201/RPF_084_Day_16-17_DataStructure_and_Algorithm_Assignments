package com.bridgelabz.insertionsort_using_generic;

import java.util.Scanner;

public class InsertionSortMain<T> {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of list:");
		int size = InsertionSort.getInteger();
		Integer[] array = new Integer[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = InsertionSort.getInteger();
		}
		InsertionSort.insertionSort(array);
		InsertionSort.printArray(array);

		String[] arrayString = new String[size];
		int length = array.length;
	}
}
