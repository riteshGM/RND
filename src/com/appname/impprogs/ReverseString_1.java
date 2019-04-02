package com.appname.impprogs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 * 
 * Ritesh Mansukhani is a Hello World Prakash , Good Man
 * Man Good Prakash World Hello a is , Mansukhani Ritesh
 * 
 * 
 * @author RiteshMansukhani
 *
 */
public class ReverseString_1 {
	public static void main(String args[]){
/*		Scanner scan = new Scanner (System.in);
		String text =scan.nextLine();
*/		String text = "Ritesh Mansukhani is a Hello World Prakash , Good Man";
		System.out.println("Original String is :"+text);
		String [] array=text.split(" ");
		int commaPosition = -1;
	
		
		//Find Comma Position
		for (int i = array.length-1;i>=0;i--){
			if(array[i].equals(",")){
				commaPosition=i;
				System.out.println("Comma Position is "+commaPosition);
				break;
			}
		}
		
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
		
		System.out.println("Printing As we wanted :"+builderReversed);
		
	}
}
