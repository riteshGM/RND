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
		number = scan.nextInt();
		scan.close();
	}
	void reverseOrder() {
		int temp = number;
		int mod;
		while(temp != 0) {
			System.out.println("temp is "+temp);
			mod = temp % 10;
			System.out.println("mod is "+mod);
			sum = sum * 10 + mod;
			System.out.println("sum is "+sum);
			temp = temp / 10;
			System.out.println("temp is at end"+temp);
		}
		System.out.println("\nThe Reversed Order is : \n" + sum);
	}
	public static void main(String args[]) {
		ReverseInt obj = new ReverseInt();
		System.out.println("1%10 is "+1%10);
		System.out.println("1/10 is "+1/10);
		obj.getVal();
		obj.reverseOrder();
	}

}

