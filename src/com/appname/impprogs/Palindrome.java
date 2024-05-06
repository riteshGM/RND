package com.appname.impprogs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
        System.out.println("Enter the string to be reversed");
        Scanner in = new Scanner(System.in);
        original = in.nextLine();
        int length = original.length();
        for(int i=length-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
        }
        System.out.println(reverse);
        
        if(original.equals(reverse)) {
        	System.out.println("palindrome");
        }else {
        	System.out.println("Not a palindrome");
        }
        
	}

}
