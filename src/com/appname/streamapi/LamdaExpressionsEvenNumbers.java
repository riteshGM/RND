package com.appname.streamapi;

import java.util.ArrayList;

public class LamdaExpressionsEvenNumbers {

	public static void main(String[] args) {
		// Create an empty ArrayList of Integers
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		// Add elements to the ArrayList
		arrList.add(9568);
		arrList.add(7129);
		arrList.add(5645);
		arrList.add(4521);
		arrList.add(2586);
		// Check if it is divisible by 2 or not
		arrList.forEach(n -> {if (n % 2 == 0) System.out.println(n);});
	}
}
