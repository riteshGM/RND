package com.appname.impprogs;

import java.util.Scanner;

/**
 * 
 * 
	Int Value Reverse Order
	
	Enter the number : 
	123456789
	
	The Reversed Order is : 
	987654321
 * @author RiteshMansukhani
 *
 */

public class ReverseInt {
	
		 
		int number, sum = 0;
		
		void getVal() {
			
			System.out.println("Int Value Reverse Order");
			
			System.out.println("\nEnter the number : ");
			Scanner scan = new Scanner(System.in);
			
			number = Integer.parseInt(scan.nextLine());
		}
		
		void reverseOrder() {
			
			int temp = number;
			int mod;
			
			while(temp != 0) {
				
				mod = temp % 10;
				sum = sum * 10 + mod;
				temp = temp / 10;
			}
			
			System.out.println("\nThe Reversed Order is : \n" + sum);
		}
	
		
		public static void main(String args[]) {
			
			ReverseInt obj = new ReverseInt();
			
			obj.getVal();
			obj.reverseOrder();
		}
	
}

