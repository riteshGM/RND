package com.appname.impprogs;

import java.util.Scanner;
/**
 * A Char is called vowel if it is either of 'a' 'e' 'i' 'o' 'u' otherwise it is consonent
   Do not worry about special chars here
 * @author Ritesh Mansukhani
 *
 */
public class StringPuzzle_CheckVowelOrConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		input = input.toLowerCase();
		input = input.replace(" ", "");
		System.out.println(input);
		int stringLength = input.length()-1;
		System.out.println("Total Length of Stirng is"+stringLength);
		int countV = 0;
		int countC = 0;
		for (int index =0 ; index<input.length()-1;index++) {
			char c = input.charAt(index);
			if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
				countV++;
			}else {
				countC++;
			}
		}
		System.out.println("Total Vowels Found " + countV);
		System.out.println("Total Consonents Found " + countC);
	}

}
