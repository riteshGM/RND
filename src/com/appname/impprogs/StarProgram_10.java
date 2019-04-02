package com.appname.impprogs;

import java.util.Scanner;
/**
 * 
	// Print OUtput as below
	  Enter the String Please
		Ritesh
		
		Ritesh
		Rites
		Rite
		Rit
		Ri
		R
 * @author RiteshMansukhani
 *
 */

public class StarProgram_10 {


	public static void main(String args[]) {

		System.out.println("Enter the String Please");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String stream = scan.nextLine().trim();
		int n = stream.length();
		System.out.println("Length of String is "+n);
		System.out.println();
		
		
		//First Logic
		//Loop for each Line
		for(int i=(n-1); i>=0; i--) {
			for (int star=0; star<=i; star++){
				System.out.print(stream.charAt(star));
			}
			System.out.println();
		}
		System.out.println();
		// OR Logic
		//Loop for each Line
		for(int i=n-1; i>=0; i--) {
			System.out.println(stream.substring(0,i+1));
		}
	}
}
