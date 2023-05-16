package com.appname.impprogs;

/**
 * 
 * Reverse String without Using Loops or any In-Built String reverse Function
 * 
 * 
 * @author RiteshMansukhani
 *
 */
public class ReverseString_5WithoutUsingLoop_InBuildFunctions {
	public String reverse(String input) {
		if (input.isEmpty()) {
			return input;
		}
		return input.substring(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}
	public static void main(String args[]) {
		ReverseString_5WithoutUsingLoop_InBuildFunctions obj = new ReverseString_5WithoutUsingLoop_InBuildFunctions();
		String input = "Ritesh is My Name";
		System.out.println(obj.reverse(input));
	}
}
