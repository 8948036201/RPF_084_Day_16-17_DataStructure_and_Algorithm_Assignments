package com.bridgelabz.datastructure_orderedlist;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OrderedListMain {
	
	public static void main(String[] args) throws IOException {
		OrderedList<Integer> orderedList = new OrderedList<Integer>();
		try {
		FileReader file = new FileReader("E:/BridgeLabz/Fellowship/BridgeLabzFellowshipEclipseWorkspace/"
					+ "Day_16&17_DataStructureandAlgorithm_Assignment_Programms/"
					+ "src/com/bridgelabz/datastructure_orderedlist/Ordered.txt");
		int i =0;
		String sb = "";
		while((i=file.read())!=-1) {
			sb = sb+(char) i ;
		}
		System.out.println(sb);
		String arrr[] = sb.split(" ");
		int arr[] = new int[arrr.length];
		 for(int j = 0 ; j<arrr.length;j++) {
			 arr[j] = Integer.parseInt(arrr[j]);
		 }
		 for(int k : arr) {
			orderedList.add(k);
		 }
		 System.out.println("Enter the number to search");
		int num = OrderedList.scanInt();
		if(orderedList.search(num)) {
			System.out.println("removed: "+ num);
		orderedList.remove(num);
		}else {
			System.out.println("added: "+ num);
			orderedList.add(num);
		}
		FileWriter filee  = new FileWriter("E:/BridgeLabz/Fellowship/BridgeLabzFellowshipEclipseWorkspace/"
					+ "Day_16&17_DataStructureandAlgorithm_Assignment_Programms/"
					+ "src/com/bridgelabz/datastructure_orderedlist/Ordered.txt");
		int size = orderedList.size();
		orderedList.disp();
		for(int o = 0 ; o<=size ; o++) {
			filee.write(orderedList.pop(0)+" ");
		}
		filee.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
