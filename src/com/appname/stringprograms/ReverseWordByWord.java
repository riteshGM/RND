package com.appname.stringprograms;

public class ReverseWordByWord {

	public static void main(String[] args) {

		String given = "Learning oops concepts in Java";

		String reversed = "";

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
		System.out.println(reversed);
	}
}
