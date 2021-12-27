package com.bridgelabz.datastructure_orderedlist;

import java.util.Scanner;

public class ScanInt<T extends Comparable<? super T>> {
	static Scanner scan = new Scanner();
	public static int scanInt()
	{
		try {
		return scan.nextInt();
		}catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
}
