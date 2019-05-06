package com.appname.impprogs;

public class FindIfStringHasAllUniqueChars {
	
	public static void main(String args[]){
		//String input = "Ritesh Mansukhani";
		String input = "Rteh@ 3";
		boolean isRepeated = false;
		for(char eachChar : input.toCharArray()){
			if(!(input.indexOf(eachChar)==input.lastIndexOf(eachChar))){
				System.out.println("Repeated Char Found ["+eachChar+"]");
				isRepeated = true;
				break;
			}
		}
		if(isRepeated)
		System.out.println("String ["+input+"] contains Repeated Chars");
		else
			System.out.println("String ["+input+"] dont contain Repeated Chars");	
	}

}
