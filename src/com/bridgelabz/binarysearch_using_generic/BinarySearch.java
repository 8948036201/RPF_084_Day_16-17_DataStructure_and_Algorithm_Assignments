package com.bridgelabz.binarysearch_using_generic;

import java.util.Scanner;

public class BinarySearch<T> {
	static Scanner scanner = new Scanner(System.in);
	public static <T extends Comparable<T>> int binarySearch(T[] array, T key, int left, int right) {

		if (left > right)
			return 0;

		int mid = (left + right) / 2;

		if (array[mid].equals(key))
			return 1;
		else if ((array[mid]).compareTo(key) > 0)
			return binarySearch(array, key, left, mid - 1);
		else
			return binarySearch(array, key, mid + 1, right);
	}

	public static <T> void printArray(T[] array) {
		System.out.println("\n" + "Sorted list :");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " " + "\n");

	}
	
	public static int getInteger() {
		return scanner.nextInt();
	}
	
	public static String getString() {
		return scanner.next();
	}
}
