package com.appname.impprogs;

public class FactorialOfANumber {

	public static void main(String[] args) {
		int number = 12;
		// Initializes the variable `fact` to 1
		long fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}

}
