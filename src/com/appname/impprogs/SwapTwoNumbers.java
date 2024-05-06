package com.appname.impprogs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int num1 = 879;
		int num2 = 325;

		System.out.println("Before swaping");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
        
		//Logic for swapping two numbers
		num1 = num1 - num2;
		num2 = num2 + num1;
		num1 = num2 - num1;
     
		System.out.println("After swaping");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}

}
