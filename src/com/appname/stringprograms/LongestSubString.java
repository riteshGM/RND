package com.appname.stringprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	
	public static int check(String s) {
		Set<Character> set = new HashSet<>();
		String longestSubstring = "";
		int left =0;
		int max =0;
		for(int right = 0; right < s.length() ; right++ ) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			//max = Math.max(max, right-left+1);
			
			if(right-left+1 >max) {
				max = right-left+1;
				longestSubstring = s.substring(left,right+1);
			}
			
		}
		System.out.println("Longest SubString is "+longestSubstring);
		return max;
 	}

	public static void main(String[] args) {
		
		
		System.out.println("Max Longest Substring length "+LongestSubString.check("abccabcdaaea"));
	}

}
