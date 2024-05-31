package com.appname.stringprograms;

public class StringFirstRepeatedChar_WithoutUsingIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Ritesh Mansukhanii";
		input = input.toLowerCase();
		input = input.replaceAll(" ", "");
		char array[] = input.toCharArray();
		boolean firstDuplicateFound = false;
		for (int outer = 0; outer < array.length; outer++) {
			// Outer Loop
			if (outer == array.length - 1) {
				System.out.println("Reached last Element In Outer Loop");
				break;
			}
			for (int index = outer + 1; index < array.length; index++) {
				
				if (array[outer] == array[index]) {
					System.out.println("First repeated Char found as " + array[index] + " at index " + index);
					firstDuplicateFound = true;
					break;
				} else {
					// Do Nothing
				}
			}
			if (firstDuplicateFound) {
				break;
			}
		}

	}

}
