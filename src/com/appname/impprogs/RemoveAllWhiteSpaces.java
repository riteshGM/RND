package com.appname.impprogs;

/**
 * 
 * @author rites
 *
 */
public class RemoveAllWhiteSpaces {
	
	public static void main (String args[]) {
		String input = "Ritesh Mansukhani is my Name";
		String withoutSpace = input.replace(" ", "");
		System.out.println(withoutSpace);
	}

}
