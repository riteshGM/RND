
package com.appname.stringprograms;


/**
 * 
 * @author RiteshMansukhani
 *	if String is treetAaer
 *	O/P should be A
 *	 since A is first non repeated char traced
 *
 *
 */
public class FindFirstNonRepeatedCharInString {
	
	public static void main(String args []){
		//String input ="teeter";
		
		String input ="treetAaer";
		input.length();
		
		for(char i :input.toCharArray()){
		if(input.indexOf(i)==input.lastIndexOf(i)){
		System.out.println(i);
		break;
		}
		}
	}

}
