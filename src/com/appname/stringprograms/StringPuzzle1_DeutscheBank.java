package com.appname.stringprograms;

/**
 * Write A Program to get char followed by count - maintain the insertion order
 * e.g. aabbbccdaaaa should o/p a2b3c2d1a4
 * Asked in Deutsche Bank Online Test
 * @author rites
 *
 */

public class StringPuzzle1_DeutscheBank {

	public static void main(String[] args) {
		String input = "aananansnnanansnnnnsnnsnsnsssss";
		System.out.println(input);
		int counter = 0;
		for (int index = 0; index < input.length(); index++) {
			counter++;
			if (index == input.length() - 1) {
				// Special handling for Last Char
				System.out.print(input.charAt(index) + ""+counter);
			} else {
				//Not Last Char
				if (input.charAt(index) != input.charAt(index + 1)) {
					//Print Condition and Flush Counter
					System.out.print(input.charAt(index) + ""+counter);
					counter = 0;
				} 
			}
		}
	}
}
