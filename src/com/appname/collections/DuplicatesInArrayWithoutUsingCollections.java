package com.appname.collections;

import java.util.Arrays;

public class DuplicatesInArrayWithoutUsingCollections {

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
		for (int i = 0; i < array.length;) {
			System.out.println("Checking for " + array[i] + "from index" + i);

			if (frequency == 0 && i == array.length - 1) {
				System.out.println("Saved " + array[i] + "Since Last Char found at" + i + "with zero frequency");
				output = output + array[i];
				break;
			}
			for (pointer = i + 1; pointer < array.length; pointer++) {
				System.out.println("Inside 2nd for loop for " + array[i]);
				if (array[i] == array[pointer]) {
					//Duplicate Found
					if (frequency == 0) {
						output = output + array[i];
						System.out.println("Saved" + array[i] + "found at index " + pointer);
					}
					
					frequency++;
				} else if (frequency == 0) {
					//Single Occurrence Element - Add it to your output and break
					System.out.println("Saved " + array[i] + "Since Only Iteration found at" + i);
					output = output + array[i];
					break;
				} else {
					//Its time to Look for next Element
					System.out.println("Next Element Found at index " + pointer);
					System.out.println("Element " + array[pointer]);
					frequency = 0;
					break;
				}
			}
			// Reset index to the pointer to start from position already traversed
			i = pointer;
		}
		System.out.println(output);
	}

}
