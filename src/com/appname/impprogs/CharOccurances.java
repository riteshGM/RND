package com.appname.impprogs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		characterCount("Testing selenium automation");

	}
	
	public static void characterCount(String text) {
	
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	
	char[] ch=text.toCharArray();
	
	System.out.println(ch);
	
	for(char c:ch) {
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)+1);
		}
		else {
			hm.put(c, 1);
		}
	}
	System.out.println(hm);
	
	for(Entry<Character, Integer> h:hm.entrySet()) {
		
		//System.out.println("Key is:-->"+h.getKey()+ "  "+ "Value is:--->	"+h.getValue());
		//print only unique characters elimiates duplicates
		
		if(h.getValue()==1) 
			System.out.println("Unique values are---->"+ h.getKey());
			
			
	}
	
	
	
}
}
