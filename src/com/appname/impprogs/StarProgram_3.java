package com.appname.impprogs;

import java.util.Scanner;
/**
 * 
	// Print OUtput as below
		*
		**
		***
		****
		*****
		******
		*******
		********
		*********
		**********
		*********
		********
		*******
		******
		*****
		****
		***
		**
		*
 * @author RiteshMansukhani
 *
 */

public class StarProgram_3 {
	
		
		public static void main(String args[]) {
			
			System.out.println("Enter n Value");
			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			int n = Integer.parseInt(scan.nextLine());
			
			System.out.println();
			// Print in increasing sequence
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			//Print in decreasing sequence
			for(int i=n; i>=1; i--) {
				if(i==n){
					//Skip the double line at boundary and print others
					continue;
				}
				for(int j=i; j>=1; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
}
