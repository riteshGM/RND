package com.appname.stringprograms;

public class ReverseStringWithoutUsing_BuilInMethods {
	
	
	public String reverseString(String input) {
		if(input.isEmpty()) {
			return input;
		}
		return reverseString(input.substring(1))+input.charAt(0);
	}
	public static void main(String[] args) {
		
		String input = "ritesh";
		
		System.out.println(input.substring(1));
		
		

	}

}
