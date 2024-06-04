package com.appname.stringprograms;

import java.util.regex.Pattern;

public class CheckUsernameValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Username should start with Alphabet only
		 * can have any letters inbetween
		 * should not be more than 10 in total length
		 * e.g. ritesh@GM
		 */
		
		String regex = "^[a-zA-Z]\\w{2,9}$";
		
		//String input = "apq12mansma"; //False due to length more than 10
		//String input = "1aksl"; //false due to username starts with numeric
		//String input = "a12ws@"; // invalid since we have special char here @
		//String input = "abcRam"; //valid
		//String input = "abc123qwsc1";// Invalid due to length 10 if we leave first char
		String input = "aa"; //should have 2 or more chars after first char in String -- Invalid
		
		System.out.println(input+ " Matched "+Pattern.matches(regex,input));
	}

}
