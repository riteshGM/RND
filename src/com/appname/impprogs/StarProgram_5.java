package com.appname.impprogs;

import java.util.Scanner;
/**
 * 
	// Print OUtput as below
	Enter n Value
	5
	
	***** 
	***** ***** 
	***** ***** ***** 
	***** ***** ***** ***** 
	***** ***** ***** ***** ***** 
	***** ***** ***** ***** 
	***** ***** ***** 
	***** ***** 
	*****  
 * @author RiteshMansukhani
 *
 */

public class StarProgram_5 {
	
		
		public static void main(String args[]) {
			
			System.out.println("Enter n Value");
			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int n = Integer.parseInt(scan.nextLine());
			
			System.out.println();
			// Print in increasing sequence
			//Loop for each Line
			for(int i=1; i<=n; i++) {
				//Loop for each Column
				for(int j=1; j<=i; j++) {
					//Loop for printing 5 STARS
					for(int k=1; k<=5; k++) {
						System.out.print("*");
					}
					System.out.print(" ");		
				}
				System.out.println();
			}
			
			// Print in decreasing sequence
			//Loop for each Line
			for(int i=n; i>=1; i--) {
				if(i==n){
					continue;
				}
				//Loop for each Column
				for(int j=i; j>=1; j--) {
					//Loop for printing 5 STARS
					for(int k=1; k<=5; k++) {
						System.out.print("*");
					}
					System.out.print(" ");		
				}
				System.out.println();
			}
			
		}
}
