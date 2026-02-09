package com.appname.stringprograms;

public class AnagramCheck {
	
	
	public static boolean checkAnagram(String s1, String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		int[] count = new int [256]; //considering all lower case
		
		for(int i =0 ; i<s1.length() ; i++) {
			System.out.println("Before Counting");
			System.out.println(s1.charAt(i));
			System.out.println(count[s1.charAt(i)]);
			System.out.println("After Counting");
			count[s1.charAt(i)] = count[s1.charAt(i)] +1;
			System.out.println(s1.charAt(i));
			System.out.println(count[s1.charAt(i)]);
			System.out.println("Before Counting");
			System.out.println(s2.charAt(i));
			System.out.println(count[s2.charAt(i)]);
			System.out.println("After Counting");
			count[s2.charAt(i)] = count[s2.charAt(i)] -1;
			System.out.println(s2.charAt(i));
			System.out.println(count[s2.charAt(i)]);
		}
		
		for(int each:count) {
			if(each!=0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main (String args[]) {
		
		String s1 = "Silent";
		String s2 = "listen";
		System.out.println("Given string "+s1+" and "+s2+" are Anagram:"+AnagramCheck.checkAnagram(s1, s2));
	}
	
	

}
