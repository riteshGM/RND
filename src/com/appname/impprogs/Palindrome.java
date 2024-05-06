package com.appname.impprogs;

public class Palindrome {
	public static void main(String[] args) {
		String givenword = "Saippuakivikauppias";
		String str = givenword.toLowerCase();
		int lengthofStr = str.length();
		String strReversed = "";
		// Reverse the string
		char[] strArray = str.toCharArray();
		for (int i = lengthofStr - 1; i >= 0; i--) {
			strReversed = strReversed + strArray[i];
		}
		System.out.println("strReversed :" + strReversed);
		System.out.println("str :" + str);
		// Check if the given string matches reversed String
		if (strReversed.matches(str)) {
			System.out.println(" It is palindrome");
		} else {
			System.out.println(" It is not palindrome");
		}
	}
}
