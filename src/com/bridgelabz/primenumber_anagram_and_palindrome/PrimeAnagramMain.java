package com.bridgelabz.primenumber_anagram_and_palindrome;

public class PrimeAnagramMain {
	
	static PrimeAnagramPalindrome primeAnagramPalindrome = new PrimeAnagramPalindrome();

	public static void main(String[] args) {

		PrimeAnagramPalindrome primeAnagramPalindrome = new PrimeAnagramPalindrome();	//	utility object
		String[] primeNumbers = primeAnagramPalindrome.prime(1000);
		
		System.out.println("Anagram and prime numbers are:");
		for(int i = 0; i < primeNumbers.length; i++) {
			for(int j = i + 1; j < primeNumbers.length; j++) {
				if(primeAnagramPalindrome.anagram(primeNumbers[i], primeNumbers[j])) {
					System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
				}
			}
		}

		System.out.println("\nPalindrome and prime numbers are:");
		for(int i = 0; i < primeNumbers.length; i++) {
			if(primeAnagramPalindrome.palindrome(primeNumbers[i])) {
				System.out.println(primeNumbers[i]);
			}
		}
	}
}
