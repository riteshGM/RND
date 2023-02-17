package com.appname.impprogs;

import java.util.Scanner;

public class ArmstrongNumber_Simple {

	public static void main(String[] args) {
		int armstrong_sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number You want to check");
		int input=sc.nextInt();
		int temp=input;
		System.out.println(input);
		while((temp!=0)) {
			int last_digit = temp%10;
			System.out.println(last_digit);
			armstrong_sum = armstrong_sum+(last_digit*last_digit*last_digit);
			temp = temp/10;
			System.out.println(temp);
		}
		if(armstrong_sum==input) {
			System.out.println("Number :"+input+" is Armstrong");
		}else {
			System.out.println("Number :"+input+" is not Armstrong");
		}
		
	}

}
