package com.appname.impprogs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Method-1
		/*char[] ch=str.toCharArray();
		 * String str="This is selenium";
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}*/
		
		
		//Method-2
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		
		String str=sc.nextLine();
		
		String[] token=str.split("");
		
		
		for(int i=token.length-1;i>=0;i--) {
			System.out.print(token[i]+ "");
		}*/
		
		//Method-3
		
		
		 /*String original, reverse = "";
	        System.out.println("Enter the string to be reversed");
	        Scanner in = new Scanner(System.in);
	        original = in.nextLine();
	        int length = original.length();
	        for(int i=length-1; i>=0; i--) {
	            reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
	        }
	        System.out.println(reverse);*/
		
		//Method-4
		
		String str="Automation Testing";
		
		StringBuilder builder=new StringBuilder();
		builder.append(str);
		builder.reverse();
		System.out.println(builder);
		
		

	}

}
