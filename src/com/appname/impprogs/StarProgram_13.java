package com.appname.impprogs;

import java.util.Scanner;
/**
 * 
	// Print OUtput as below
	Enter n Value
	5
	
	7 6 5 4 3 2 1
	6 5 4 3 2 1
	5 4 3 2 1
	4 3 2 1
	3 2 1
	2 1
	1  
 * @author RiteshMansukhani
 *
 */

public class StarProgram_13 {


	public static void main(String args[]) {

		System.out.println("Enter n Value");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		System.out.println();
		//Loop for each Line
		for(int i=n; i>=1; i--) {
			for(int j=i ; j>=1; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
