package com.appname.impprogs;

import java.util.Scanner;
/**
 * 
	// Print OUtput as below
	Enter n Value
	5
	
 		 * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * *   
 * @author RiteshMansukhani
 *
 */

public class StarProgram_7 {


	public static void main(String args[]) {

		System.out.println("Enter n Value");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int temp = n;
		System.out.println();
		//Loop for each Line
		for(int i=1; i<=n; i++) {
			for(int spaces=1; spaces<=temp; spaces++) {
				System.out.print(" ");
			}
			for (int star=1; star<=i; star++){
				System.out.print("* ");
			}
			temp=temp-1;
			System.out.println();
		}
	}
}
