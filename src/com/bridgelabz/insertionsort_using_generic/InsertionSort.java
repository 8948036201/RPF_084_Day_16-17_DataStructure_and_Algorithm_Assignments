package com.bridgelabz.insertionsort_using_generic;

import java.util.Scanner;

public class InsertionSort<T> {

	static Scanner scanner = new Scanner(System.in);

	public static <T extends Comparable<T>> T[] insertionSort(T[] array) {

		int i, temporary;
		for (i = 1; i < array.length; i++) {
			T key = array[i];
			temporary = i;

			while (temporary > 0 && array[temporary - 1].compareTo(key) > 0) {
				array[temporary] = array[temporary - 1];
				temporary--;
			}
			array[temporary] = key;
		}
		return array;
	}

	public static <T> void printArray(T[] array) {
		System.out.println("\n" + "Sorted list :");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " " + "\n");

	}

	public static int getInteger() {
		return scanner.nextInt();

	}
}
