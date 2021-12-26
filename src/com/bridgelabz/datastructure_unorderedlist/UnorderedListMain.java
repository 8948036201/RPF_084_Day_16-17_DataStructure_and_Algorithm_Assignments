package com.bridgelabz.datastructure_unorderedlist;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class UnorderedListMain {

	public static void main(String[] args) {
		UnorderedList<String> unOrderedList = new UnorderedList<String>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		try {
			@SuppressWarnings("resource")
			FileReader file = new FileReader("E:/BridgeLabz/Fellowship/BridgeLabzFellowshipEclipseWorkspace/"
					+ "Day_16&17_DataStructureandAlgorithm_Assignment_Programms/"
					+ "src/com/bridgelabz/datastructure_unorderedlist/Unordered.txt");

			int i = 0;
			String sb = "";
			while ((i = file.read()) != -1) {

				sb = sb + (char) i;
			}
			String arr[] = sb.split(" ");
			for (int j = 0; j <= arr.length - 1; j++) {

				unOrderedList.add(arr[j]);
			}

			System.out.println("ENETR A WORD TO SEARCH");
			String word = scan.nextLine();
			if (unOrderedList.search(word)) {
				unOrderedList.remove(word);
				System.out.println("word removed form list");
			} else {
				unOrderedList.add(word);
				System.out.println("word added to the list");
			}
			unOrderedList.disp();
			int size = unOrderedList.size();
			FileWriter filee = new FileWriter("E:/BridgeLabz/Fellowship/BridgeLabzFellowshipEclipseWorkspace/"
					+ "Day_16&17_DataStructureandAlgorithm_Assignment_Programms/"
					+ "src/com/bridgelabz/datastructure_unorderedlist/Unordered.txt");
			for (int h = 0; h <= size - 1; h++) {
				filee.write(unOrderedList.pop(0) + " ");
			}
			filee.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
