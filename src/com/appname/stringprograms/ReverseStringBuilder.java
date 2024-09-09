package com.appname.stringprograms;

public class ReverseStringBuilder {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Java World");
		System.out.println("Given String :" + str);
		
		System.out.println();

		//Reversed
		StringBuilder reverseStr = str.reverse();
		System.out.println("Reversed String :" +reverseStr);
		

	}

}
