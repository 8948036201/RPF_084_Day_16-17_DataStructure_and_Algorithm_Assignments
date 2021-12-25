package com.bridgelabz.bubblesort_descendingorder;

import java.util.Scanner;

public class BubbleSortDescMain {

	static BubbleSortDesc bubbleSortDesc = new BubbleSortDesc();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of integers to sort: ");
		int count = scanner.nextInt();

		int[] array = new int[count];

		System.out.print("Enter integers to sort: ");
		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}

		array = bubbleSortDesc.bubbleSortDescending(array);

		for (int element : array) {
			System.out.println(element);
		}
		scanner.close();
	}
}
