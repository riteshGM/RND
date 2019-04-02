package com.appname.impprogs;

import java.util.Scanner;
/**
 * 
	// Print OUtput as below
	Enter your name :
	Balaji
	
	B
	Ba
	Bal
	Bala
	Balaj
	Balaji
 * @author RiteshMansukhani
 *
 */

public class StarProgram_9 {


	public static void main(String args[]) {

		System.out.println("Enter the String Please");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String stream = scan.nextLine().trim();
		int n = stream.length();
		System.out.println();
		
		
		//First Logic
		//Loop for each Line
		for(int i=0; i<n; i++) {
			for (int star=0; star<=i; star++){
				System.out.print(stream.charAt(star));
			}
			System.out.println();
		}
		System.out.println();
		// OR Logic
		//Loop for each Line
				for(int i=0; i<n; i++) {
					System.out.println(stream.substring(0,i+1));
				}
	}
}
