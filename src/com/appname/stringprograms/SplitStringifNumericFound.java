package com.appname.stringprograms;

/**
 * Write a Program to Split String if Digit Appeared
 * 
Sample 1:
Input="aacha1ahsndh4hhhahdgdhh0kkdjdk23";
O/P: 
aacha
1ahsndh
4hhhahdgdhh
0kkdjdk
2
3
 */

import java.util.Scanner;

public class SplitStringifNumericFound {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		//String input = scanner.nextLine();
		
		String input = "aacha1ahsndh4hhhahdgdhh0kkdjdk23";
		char[] array = input.toCharArray();
		String temp="";
		for(int index = 0 ; index < array.length ; index++) {
			
			//Check if Char is Digit
			if(Character.isDigit(array[index])) {
				System.out.println(temp); //Print Current Cache
				temp=""; //Reset Temp
				temp=temp+array[index];
			}else {
				temp=temp+array[index];
			}
			
			if(index==array.length-1) {
				System.out.println(temp);
			}
		}
		
	}
}
