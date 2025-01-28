package com.appname.stringprograms;

public class StringImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		/**
		 * Important Point to Note here is == checkes for Reference
		 * .equals checks for Content
		 */
		System.out.println("Check#1");
		if(str1==str2) {
			System.out.println("Both Strings are pointing to same reference");
			System.out.println("Str1 "+str1);
			System.out.println("Str2 "+str2);
		}else {
			System.out.println("Both Strings are not pointing to same reference");
		}
		System.out.println("Check#2");
		//This time it is 
		if(str1==str3) {
			System.out.println("Both Strings are pointing to same reference");
			System.out.println("Str1 "+str1);
			System.out.println("Str2 "+str3);
		}else {
			System.out.println("Both Strings are not pointing to same reference");
			
		}
		
		System.out.println("Check#3");
		//This time it is 
		if(str1.equals(str3)) {
			System.out.println("Both Strings are Same");
			System.out.println("Str1 "+str1);
			System.out.println("Str2 "+str3);
		}else {
			System.out.println("Both Strings are not Same");
			
		}

		str2 = str2+"Edition";
		System.out.println("Check#4");
		if(str1==str2) {
			System.out.println("Both Strings are pointing to same reference");
			System.out.println("Str1 "+str1);
			System.out.println("Str2 "+str2);
		}else {
			System.out.println("Both Strings are not pointing to same reference");
		}
	}

}
