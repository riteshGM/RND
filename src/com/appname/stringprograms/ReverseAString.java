package com.appname.stringprograms;

public class ReverseAString {
	public static void main(String[] args) {
		String myWord = "Learn Java";
		String given = " ";
		char[] myArray = myWord.toCharArray();
		String reversedString = " ";
// print myArray
		for (int i = 0; i < myArray.length; i++) {
			given = given + myArray[i];
		}
		System.out.println("Given String : " + given);
// print myReversed Array
		for (int i = myArray.length - 1; i >= 0; i--) {
			reversedString = reversedString + myArray[i];
		}
		System.out.println("ReversedString : " + reversedString);
	}
}