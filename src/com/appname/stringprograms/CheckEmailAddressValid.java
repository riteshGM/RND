package com.appname.stringprograms;

/**
 * Write a Java Program to check if given email address is as per
 * expected format or not
 */

import java.util.regex.Pattern;

public class CheckEmailAddressValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//here (.+) represents any thing is acceptable any number of items
		//String input = "1@#$**&@gmail.com"; //true
		//String input = "@gmail.com"; //false since zero letter before @
		//String input = "1@1.com";	 //false since numberic value after @	
		String input = "qqhjhdguiguidb%$%^&%@gmail.com"; //true
		
		String regex = "(.+)@[a-zA-Z]+\\.com$";
		Boolean matched = Pattern.matches(regex, input);
		System.out.println("Email Address "+input+" Matched "+matched);
	}

}
