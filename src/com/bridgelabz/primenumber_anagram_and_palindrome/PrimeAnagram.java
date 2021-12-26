package com.bridgelabz.primenumber_anagram_and_palindrome;

import java.util.Arrays;

public class PrimeAnagram {
	
	public String prime(int lowerLimit, int upperLimit) {
		System.out.println("Prime numbers between " + lowerLimit + "-" + upperLimit);

		String primeNumber = null;
		for (int i = lowerLimit; i <= upperLimit; i++) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				primeNumber = "" + i;
				String[] anagram = primeNumber.split(" ", +i);
				System.out.println(primeNumber);
				for (String a : anagram)
					System.out.println(a);
			}
		}
		return primeNumber;
	}

	public static boolean anagramDetection(String anagram1, String anagram2) {

		char char1[] = anagram1.toCharArray();
		char char2[] = anagram2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		String string1 = String.valueOf(char1);
		String string2 = String.valueOf(char2);

		if (!string1.equals(string2))
			return false;

		return true;
	}

	public static void palindromeNumber(String[] anagramNumber) {
		int[] numbers = new int[anagramNumber.length];
		for (int i = 0; i < anagramNumber.length; i++) {
			numbers[i] = Integer.parseInt(anagramNumber[i]);
		}
		int temp, reverse_num, rem = 0, i = 0, num = 0;
		while (i < numbers.length) {
			temp = numbers[i];
			num = temp;
			reverse_num = 0;
			while (temp != 0) {
				rem = temp % 10;
				temp = temp / 10;
				reverse_num = reverse_num * 10 + rem;
			}
			i++;
			if (num == reverse_num)
				System.out.print(" " + num);
		}
	}
}
