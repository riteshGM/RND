package com.appname.impprogs;

public class RemoveJunk {

	public static void main(String[] args) {
		
		//Remove special characters
		String str= "This#string%contains^special*characters&.";   
		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(str); 
		
		
		//Remove numbers from String program
		String str2="abrar446";
		
		String result="";
		char[] ch=str2.toCharArray();
		
		for(char c:ch) {
			
			if(!Character.isDigit(c)) {
				result=result+c;
			}
		}
		
		System.out.println(result);

	}

}
