package com.appname.stringprograms;


import java.util.Scanner;

public class PalindromeCharString {
	public static void main(String[] args) {

		// Reading string from user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to check palindrome:");
		String inputByUser = sc.nextLine();
		
		// Closing input scanner 
		sc.close();
		
		// converting string in to char array
		char[] stringInChar = inputByUser.toCharArray();
		
		System.out.println(stringInChar.length);
        // Declaring an empty string variable to store reverse string
        String reverseInput = "";
        
       
       
        // reading char by char from end of array till first and forming a string
		for (int i= (stringInChar.length-1); i>=0; i--) {
			reverseInput = reverseInput + stringInChar[i];
		}

        // Printing both actual and reversed string
		System.out.println("Inout string:" + inputByUser);
		System.out.println("Reverse String:" + reverseInput);

        // Checking if given string is plaindrome
		if (inputByUser.equalsIgnoreCase(reverseInput))
			System.out.println("Entered string is palindrome.");
		else
			System.out.println("Entered string is not palindrome.");
	}
}
