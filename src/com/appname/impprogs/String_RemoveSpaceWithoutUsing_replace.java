package com.appname.impprogs;

/**
 * Program to remove white spaces from a Sentence without using replace()
 * @author Ritesh Mansukhani
 *
 */

public class String_RemoveSpaceWithoutUsing_replace {
	public static void main(String[] args) {
		String input = "Ritesh is my Name";
		char [] array = input.toCharArray();
		String output = "";
		for(int i =0 ; i< array.length ; i++) {
			if(array[i]!= ' ') {
				output = output+array[i];
			}
		}
		System.out.println("Output String after removing spaces "+output);
	}
}
