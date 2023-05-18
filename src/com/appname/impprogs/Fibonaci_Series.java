package com.appname.impprogs;

/**
 * Write a Program to Print Fibonacci Series Using Java
 * @author Ritesh Mansukhani
 *
 */
public class Fibonaci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =10;
		int num1=0;
		int num2=1;
		for(int i = 1; i<=input ; i++) {
			System.out.print(num1+" ");
			int sum = num1 +num2;
			num1=num2;
			num2=sum;
		}
	}

}
