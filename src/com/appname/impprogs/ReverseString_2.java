package com.appname.impprogs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * 
 * Ritesh Mansukhani is a Hello World Prakash , Good Man
 * hsetiR inahkusnaM si a olleH dlroW hsakarP , dooG naM
 * 
 * 
 * @author RiteshMansukhani
 *
 */
public class ReverseString_2 {
	public static void main(String args[]){
/*		Scanner scan = new Scanner (System.in);
		String text =scan.nextLine();
*/		String text = "Ritesh Mansukhani is a Hello World Prakash , Good Man";
		System.out.println("Original String is :"+text);
		String [] array=text.split(" ");
		int commaPosition = -1;
	
		
		StringBuilder builder = new StringBuilder();
		
		
		for (int i = array.length-1;i>=0;i--){
		
			if(array[i].equals(",")){
				commaPosition=i;
				System.out.println("Comma Position is "+commaPosition);
			}
				
			builder.append(array[i]).append(" ");
		}
		
		System.out.println("Printing Builder Vlaue without reverse() "+builder);
		System.out.println("Printing Builder Vlaue using reverse() "+builder.reverse());
		
	}
}
