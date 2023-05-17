package com.appname.stringprograms;

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
		 ArrayList<String> reversedWordsList = new ArrayList<String>();
		 String revserseString ="";
		 for (String eachString : array) {
			 //ArrayList<String> reverseEachWordCharList = new ArrayList<String>();
			// char[] eachWordArray = eachString.toCharArray()
			/*	
			 (int i = eachWordArray.length-1; i>=0 ;i--)
			 {
				 reverseEachWordCharList.add(eachWordArray[i]);
			 }
			 String temp = "";
			 for (String eachChar : reverseEachWordCharList) {
				 temp = temp+"eachChar";
			 }
			 reversedWordsList.add(temp);	
		 }
		 StringBuilder builder = new StringBuilder();
		 for(String eachString : reversedWordsList) {
			 builder.append(eachString).append(" ");
			 */
			 System.out.println(eachString);
			 char[] eachWordChar = eachString.toCharArray();
			 ArrayList<Character> reversed = new ArrayList<Character>();
			 for (int i = eachWordChar.length-1 ; i>=0 ; i--) {
				 reversed.add(eachWordChar[i]);
			 }
			 revserseString = revserseString + " "+reversed.toString();
			  
		 }
	
		// System.out.println(builder);
	}
}
