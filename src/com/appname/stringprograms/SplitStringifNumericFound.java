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

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;

public class SplitStringifNumericFound {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		//String input = scanner.nextLine();
		
		String input = "aacha1ahsndh4hhhahdgdhh0kkdjdk23asda";
		System.out.println("Original String "+input);
		while(!input.isEmpty()) {
			for(int i = 0 ; i< input.length(); i++) {
				if(Character.isDigit(input.charAt(i)) | i==input.length()-1) {
					System.out.println("["+input.substring(0,i)+"]");
					//Reset Input to further remaining String
					input = input.substring(i+1);
					//System.out.println("Remaining String "+input);
					break; // this terminates current for loop
				}
			}
		}
		
	}
}
