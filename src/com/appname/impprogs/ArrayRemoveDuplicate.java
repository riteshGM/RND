package com.appname.impprogs;

public class ArrayRemoveDuplicate {

	public static void main(String[] args) {
		/**
		 * Asked at BNY Melon InterView 17-02-2023
		 * Write a java program to remove duplicate elements from the array. 
		 * Example array { 1, 1, 2, 2, 2, 3, 3, 3, 3 } and expected output {1 2 3}
		 */

		int input [] = { 1, 1, 2, 2, 2, 3, 3, 3, 3 };
		int uniqArray [] = new int[3];
		int counter=0;
		//String uniqueElements = "";
		for (int eachInt : input) {
			System.out.println("Inside Main Looop Each Int="+eachInt);
			boolean duplicate = false;
			for(int i=0; i<uniqArray.length ; i++) {
				System.out.println("Inside Duplicate Check Loop");
				System.out.println("Each Int = "+eachInt );
				System.out.println(uniqArray[i]);
				//Check if We already have it identified uniquely
				if(eachInt==uniqArray[i]){
					System.out.println("Inside Duplicate Found "+eachInt);
					duplicate=true;
					System.out.println("Breaking Current Loop");
					//Duplicate Found Break the For Loop
					break;
				}
			}
			if(!duplicate) {
				System.out.println("Inside Creation of Unique Array"+eachInt);
				uniqArray[counter]=eachInt;
				counter++;
			}
			System.out.println("Printing Unique Array");
			for (int eachInt1 : uniqArray) {
				System.out.println(eachInt1);
			}	
		}
		//At Last Print The Unique Array
		for (int eachInt : uniqArray) {
			System.out.print(eachInt +" ");
		}
	}
}
