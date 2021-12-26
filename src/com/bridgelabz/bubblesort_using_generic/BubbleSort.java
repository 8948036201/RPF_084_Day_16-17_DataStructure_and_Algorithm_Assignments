package com.bridgelabz.bubblesort_using_generic;

import java.util.Scanner;

public class BubbleSort<T> {

	static Scanner scanner = new Scanner(System.in);

	public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
		int i, j;
		int length = array.length;
		for (i = 0; i < length; i++) {
			for (j = 1; j < length - i; j++) {
				if ((array[j - 1]).compareTo(array[j]) > 0) {
					T temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
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
