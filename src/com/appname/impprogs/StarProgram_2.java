package com.appname.impprogs;

import java.util.Scanner;

public class StarProgram_2 {
	
	/**
	 * 
	 * 
	 * 
			************* Print OUtput as below ******************
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
			***********
			************
			*************
			**************
			***************
			****************
			*****************
			******************
			*******************
			********************

	 * 
	 * 
	 * @param args
	 */
		
		public static void main(String args[]) {
			
			System.out.println("Enter n Value");
			
			Scanner scan = new Scanner(System.in);
			int n = Integer.parseInt(scan.nextLine());
			
			System.out.println();

			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
