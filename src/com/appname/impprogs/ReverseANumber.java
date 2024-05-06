package com.appname.impprogs;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 223;
		int reversedNum = 0;

		System.out.println("Given Number : " + num);
		while (num != 0) {
			int reminder = num % 10;
			reversedNum = reminder + reversedNum * 10;
			num = num / 10;
		}
		System.out.println("Reversed Number : " + reversedNum);
	}
}
