package com.appname.arrays;

public class Array_GetIndexOfElementsWithSumAs7 {

	public static void main(String args[]) {
		int input[] = { 1, 2, 5, 3, 1, 6, 1, 1 };
		for (int i = 0; i < input.length; i++) {
			if (i == input.length - 1) {
				// Do Nothing this is last Element
			} else if (input[i] + input[i + 1] == 7) {
				System.out.println("Sum Found as 7 for Element " + input[i] + " at index " + i + " and " + input[i + 1]
						+ " at index " + (i + 1));
			} else {
				// Do Nothing
			}
		}

	}

}
