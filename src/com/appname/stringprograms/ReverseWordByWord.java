package com.appname.stringprograms;

public class ReverseWordByWord {

	public static void main(String[] args) {

		String given = "Learning oops concepts in Java";

		String reversed = "";	
		String[] inputArr = given.split(" ");
		
		for(int k=inputArr.length-1;k>=0;k-- ) {
			String eachString = inputArr[k];
			reversed = reversed+ReverseWordByWord.reverse(eachString)+" ";
		}
		
		System.out.println(reversed);
	}
	
	public static String reverse(String input) {
		if(input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length()-1)+
				reverse(input.substring(0,input.length()-1));
	}
	
}
