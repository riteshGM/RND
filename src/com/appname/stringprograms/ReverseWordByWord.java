package com.appname.stringprograms;

public class ReverseWordByWord {

	public static void main(String[] args) {

		String given = "Learning oops concepts in Java";

		String reversed = "";
/*
		// Create words Array
		String[] words = given.split(" ");
		for (int k = 0; k < words.length; k++) {
			String wordsArray = "";
			wordsArray = wordsArray + words[k] + " ";

			// For each word Create characters Array
			char[] chArray = wordsArray.toCharArray();

			// Print the characters of each word from last to first
			for (int j = chArray.length - 1; j >= 0; j--) {
				reversed = reversed + chArray[j];
			}
		}
		
	*/	
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
		
		return input.substring(input.length()-1)+
				reverse(input.substring(0,input.length()-1));
	}
	
	
}
