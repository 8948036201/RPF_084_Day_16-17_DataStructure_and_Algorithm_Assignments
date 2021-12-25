package com.bridgelabz.insertionsort;

public class InsertionSort {

	public static <T extends Comparable<T>> T[] insertSort(T[] array) {

		int i, temp;
		for (i = 1; i < array.length; i++) {
			T key = array[i];
			temp = i;

			while (temp > 0 && array[temp - 1].compareTo(key) > 0) {
				array[temp] = array[temp - 1];
				temp--;
			}
			array[temp] = key;
		}
		return array;
	}

	public static <T> void printArray(T[] array) {
		System.out.println("\n" + "Sorted list :");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " " + "\n");
	}
}
