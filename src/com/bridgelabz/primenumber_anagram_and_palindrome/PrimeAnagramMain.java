package com.bridgelabz.primenumber_anagram_and_palindrome;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class PrimeAnagramMain {
	
	static PrimeAnagram primeAnagram = new PrimeAnagram();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lower limit :");
		int lowerLimit = scanner.nextInt();
		System.out.println("Enter the upper limit :");
		int upperLimit = scanner.nextInt();

		//PrimeAnagram primeAnagram = new PrimeAnagram();
		String primeNumber = primeAnagram.prime(lowerLimit, upperLimit);
		System.out.println("" + primeNumber);

		String[] anagram = primeNumber.split(" ");
		System.out.println(primeNumber);

		int[] numbers = new int[anagram.length];
		for (int i = 0; i < anagram.length; i++)
			numbers[i] = Integer.parseInt(anagram[i]);
		LinkedHashSet<String> linkedHash = new LinkedHashSet<String>();
		System.out.println("The Anagram numbers are:");
		for (int i = 0; i < anagram.length; i++) {
			for (int j = i + 1; j < anagram.length; j++) {
				if (PrimeAnagram.anagramDetection(anagram[i], anagram[j])) {
					linkedHash.add(anagram[i]);
					linkedHash.add(anagram[j]);
				}
			}
		}
		System.out.println(linkedHash);
		System.out.println("Palindrome Numbers are:");
		String[] anagramNumber = new String[linkedHash.size()];

		linkedHash.toArray(anagramNumber);
		PrimeAnagram.palindromeNumber(anagramNumber);
		scanner.close();

	}
}
