package com.bridgelabz.binarysearch_using_generic;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchMain<T> {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the size of list:");
		int size = BinarySearch.getInteger();
		Integer[] array = new Integer[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] = BinarySearch.getInteger();
		}
		Arrays.sort(array);
		System.out.println("Enter the Key Element to Search..");
		int key1 = BinarySearch.getInteger();

		if (BinarySearch.binarySearch(array, key1, 0, array.length - 1) != 0)
			System.out.println("Element Found..");
		else
			System.out.println("Element not Found..");

		System.out.println("Enter the size of a string:");
		int sizeString = BinarySearch.getInteger();
		String[] arrayString = new String[sizeString];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < arrayString.length; i++) {
			arrayString[i] = BinarySearch.getString();
		}
		Arrays.sort(arrayString);
		System.out.println("Sorted array is:" + Arrays.toString(arrayString));

		System.out.println("Enter the Key Element to Search..");
		String key2 = BinarySearch.getString();
		if (BinarySearch.binarySearch(arrayString, key2, 0, arrayString.length - 1) != 0)
			System.out.println("Element Found..");
		else
			System.out.println("Element not Found..");
	}
}
