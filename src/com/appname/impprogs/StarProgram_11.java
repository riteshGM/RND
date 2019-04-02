package com.appname.impprogs;

import java.util.Scanner;
/**
 * 
	// Print OUtput as below
	Enter n Value
	5
	
	1 
	2 2
	3 3 3 
	4 4 4 4 
	5 5 5 5 5   
 * @author RiteshMansukhani
 *
 */

public class StarProgram_11 {


	public static void main(String args[]) {

		System.out.println("Enter n Value");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		System.out.println();
		//Loop for each Line
		for(int i=1; i<=n; i++) {
			for(int j=1 ; j<=i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
