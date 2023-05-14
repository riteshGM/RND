package com.appname.collections;

import java.util.Arrays;

public class DuplicatesInArrayWithoutUsingCollectionsSingleLoop {

	public static void main(String args[]) {
		// int [] array = {1,2,3,1,2,1,2,3,1,3,2};
		//int[] array = { 1, 2, 3, 2, 2, 2 };
		int[]array = {1,2,3,3,3,1};

		Arrays.sort(array);

		System.out.println("Sorted Array input is");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

		// Pointer for Second Iterator
		int pointer = 0;
		// Output as String since we cannot initialize int[] without knowing size
		String output = "";

		int frequency = 0;
		for (int i = 0; i < array.length;i++) {
			System.out.println("Checking for " + array[i] + "from index" + i);
			//Check if Last Element in Array (We cannot compare with Index+1 - will give indexOutOfBound)
			if(i == array.length - 1) {
					if(frequency==0) {
						System.out.println("Saved " + array[i] + "Since Last Char found at" + i + "with zero frequency");
						output = output + array[i];
					}
			}else if (frequency ==0) {
				// New Element Make Entry				
				output = output+array[i];
				if(array[i]==array[i+1]) {
					frequency++;
				}
			}else if (array[i]==array[i+1]) {
				frequency ++;
			}else if (array[i]!=array[i+1]){
				frequency=0;
			}
		}
		System.out.println(output);
	}

}
