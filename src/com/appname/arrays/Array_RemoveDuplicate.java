package com.appname.arrays;

import org.bouncycastle.util.Arrays;

public class Array_RemoveDuplicate {

	public static void main(String[] args) {
		/**
		 * Asked at BNY Melon InterView 17-02-2023
		 * Write a java program to remove duplicate elements from the array. 
		 * Example array { 1, 1, 2, 2, 2, 3, 3, 3, 3 } and expected output {1 2 3}
		 */

		int i [] = {1,1,2,2,3,3}; 
		System.out.println("Length "+i.length);
		int j[] = new int[i.length];
		int counter=0;
		
		for (int index = 0 ; index<i.length ; index++) {
			System.out.println("Checking for "+i[index]);
			if(index+1<i.length && i[index]==i[index+1]) {
				System.out.println("Duplicate Found");
				j[counter]=i[index];
				counter++;
			}	
		}
		
		for (int index = 0 ; index<j.length ; index++) {
			System.out.println(j[index]);
		}
		
		int final_done[] = Arrays.copyOf(j, counter);
		
		for(int each : final_done) {
			System.out.println(each);
		}
	}
}
