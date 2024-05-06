package com.appname.impprogs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean result =isAnagram("LISten", "SiLeNt");
		System.out.println("Both Strings are Anagram :  "+result);
	}
	
	public static boolean isAnagram(String first,String second) {
		//convert string to lower case
		first=first.replaceAll("\\s", "").toLowerCase();
		second=second.replaceAll("\\s", "").toLowerCase();
		
		if(first.length()!=second.length())
			return false;
		
		char[] firstarr=first.toCharArray();
		char[] secondarr=second.toCharArray();
		
		Arrays.sort(firstarr);
		Arrays.sort(secondarr);
		
		return Arrays.equals(firstarr, secondarr);
		
	}

}
