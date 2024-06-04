package com.appname.stringprograms;

import java.util.regex.Pattern;

/**
 * 
 Given a password, the task is to validate the password with the help of Regular Expression. 
 A password is considered valid if all the following constraints are satisfied:

It contains at least 8 characters and at most 20 characters.
It contains at least one digit.
It contains at least one upper case alphabet.
It contains at least one lower case alphabet.
It contains at least one special character which includes !@#$%&*()-+=^.
It doesn’t contain any white space.
 * 
 */

public class CheckPasswordValid {

	public static void main(String[] args) {
		Pattern ATLEAST_ONE_DIGIT = Pattern.compile("(?=.*\\d)");
		Pattern ATLEAST_ONE_LOWER = Pattern.compile("(?=.*[a-z])");
		Pattern ATLEAST_ONE_UPPER = Pattern.compile("(?=.*[A-Z])");
		Pattern ATLEAST_ONE_SPECIAL_CHAR = Pattern.compile("(?=.*[!~@#$%^&*_+=])");
		Pattern NO_WHITE_SPACE_CHAR = Pattern.compile("(?=\\S+$)");
		Pattern MIN_EIGHT_MAX_TWELVE_LENGTH = Pattern.compile("(^.{8,12}$)");
		
				
		//String pwd = "Qsc@112"; //Invalid due to length less than 8
		//String pwd = "1Qa@112121251"; //Invalid More than 12 Length
		//String pwd = "Special@8"; //Valid
		//String pwd = "Special8"; //Invalid no Special Char
		//String pwd = "SpecialE"; //Invalid no Numeric
		//String pwd = "SPECIAL@8"; //Invalid No lower case char
		//String pwd = "special@8";  //Invalid No Upper Letter
		String pwd = "Special@8 "; //Invalid Has one white space
		
		if(
				ATLEAST_ONE_DIGIT.matcher(pwd).find() 
				 && ATLEAST_ONE_LOWER.matcher(pwd).find()
				 && ATLEAST_ONE_UPPER.matcher(pwd).find()
				 && MIN_EIGHT_MAX_TWELVE_LENGTH.matcher(pwd).find()
				 && ATLEAST_ONE_SPECIAL_CHAR.matcher(pwd).find()
				 && NO_WHITE_SPACE_CHAR.matcher(pwd).find()
				// && MAX_TWELVE_LENGTH.matcher(pwd).find()
				) {
			System.out.println("Password "+pwd+" is Valid");
		}else {
			System.out.println("Password "+pwd+" is InValid");
		}
	}

}
