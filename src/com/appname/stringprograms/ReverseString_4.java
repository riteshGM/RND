package com.appname.stringprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * 
 * Ritesh Mansukhani is a Hello World Prakash , Good Man
 * naM dooG hsakarP dlroW olleH a si , inahkusnaM hsetiR
 * 
 * 
 * @author RiteshMansukhani
 *
 */
public class ReverseString_4 {
	public static void main(String args[]){
/*		Scanner scan = new Scanner (System.in);
		String text =scan.nextLine();
*/		
		
		
		
		
		String text = "Ritesh Mansukhani is a Hello World Prakash , Good Man";
	
		System.out.println("Original String is :"+text);
		String [] array=text.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i =0 ;i<array.length;i++){
			builder.append(array[i]).append(" ");
		}
		System.out.println("Printing Builder Vlaue using reverse() "+builder.reverse());
		builder =builder.reverse();
		
		
		String reversed=builder.toString();
		String []reversedWordsArray = reversed.split(" ");
		int commaPosition = -1;
		ArrayList<String> reverse = new ArrayList<String>();
		
		for (int i = array.length-1;i>=0;i--){
			if(i==commaPosition){
				continue;
			}
			reverse.add(array[i]);
		}
		
		reverse.add(commaPosition,",");
		
		StringBuilder builderReversed = new StringBuilder();
		Iterator itr =reverse.iterator();
		while(itr.hasNext()){
			builderReversed.append(itr.next()).append(" ");
		}
		
		System.out.println("Builder again"+builderReversed);
	
	}
}
