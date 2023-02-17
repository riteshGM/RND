package com.appname.impprogs;

import java.util.Scanner;

public class PalindromeUsingCharAt {

	public static void main(String[] args) {
		//For repeat condition of Do-While Loop
		boolean repeat =false;
		do {
			System.out.println("Enter String you want to check");
			Scanner sc = new Scanner (System.in);
			String input = sc.nextLine();
			String reverse = "";
			for (int i = input.length()-1; i>=0; i--) {
				reverse = reverse+input.charAt(i);
			}
			System.out.println("Original: "+input);
			System.out.println("Reversed: "+reverse);
			if(input.toLowerCase().equals(reverse.toLowerCase())) {
				System.out.println("String :"+input+" is Palindrome");
			}else {
				System.out.println("String :"+input+" is not Palindrome");
			}
		
			System.out.println("Do you want to continue? y or n");
			if(sc.nextLine().toLowerCase().equals("y") || sc.nextLine().toLowerCase().equals("yes")) {
				repeat = true;
			}else {
				repeat = false;
			}
			sc.close();
		}while(repeat);
		
	System.out.println("Program Completed");			
	}

}
