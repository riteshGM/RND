package com.appname.stringprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * 
 * Ritesh Mansukhani is a Hello World Prakash , Good Man
 * naM dooG , hsakarP dlroW olleH a si inahkusnaM hsetiR
 * 
 * 
 * @author RiteshMansukhani
 *
 */
public class ReverseString_3 {
	public static void main(String args[]){
/*		Scanner scan = new Scanner (System.in);
		String text =scan.nextLine();
*/		String text = "Ritesh Mansukhani is a Hello World Prakash , Good Man";
		System.out.println("Original String is :"+text);
		String [] array=text.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i =0 ;i<array.length;i++){
			builder.append(array[i]).append(" ");
		}
		System.out.println("Printing Builder Vlaue using reverse() "+builder.reverse());
		
		
		
		
		
	}
}
