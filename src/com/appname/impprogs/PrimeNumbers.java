package com.appname.impprogs;

public class PrimeNumbers {

	public static void main(String[] args) {
		int givenNumber = 347;
		int count = 0;

		if (givenNumber > 1) {
			for (int i = 1; i <= givenNumber; i++) {
				if (givenNumber % i == 0)
					count++;
			}
		if (count == 2)
		System.out.println(givenNumber +" is a prime number");
		else
		System.out.println(givenNumber +" is not a prime number");
		}
	}
}
