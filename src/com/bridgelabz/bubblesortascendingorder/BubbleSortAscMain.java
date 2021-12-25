package com.bridgelabz.bubblesortascendingorder;

import java.util.Scanner;

public class BubbleSortAscMain {

	static BubbleSortAsc bubbleSortAsc = new BubbleSortAsc();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of integers to sort: ");
		int count = scanner.nextInt();

		int[] array = new int[count];

		System.out.print("Enter integers to sort: ");
		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}

		array = bubbleSortAsc.bubbleSortAscending(array);

		for (int element : array) {
			System.out.println(element);
		}
		scanner.close();
	}
}
