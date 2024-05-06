package com.appname.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	// Search HashMap by value
	public static void main(String[] args) {
		HashMap<String, String> fruits = new HashMap<>();
		fruits.put("apple", "red");
		fruits.put("banana", "yellow");
		fruits.put("orange", "orange");
		// containsValue() - returns True, if that value 
		//is mapped by any of the key in the map
		boolean containsApple = fruits.containsValue("red");
		System.out.println(containsApple);
	    //entrySet() - Creates a set out of the elements 
		//contained in the hash map
		//Map.entry - To access the entry in the Map
	    for (Map.Entry<String, String> entry : fruits.entrySet()) {
	        if (entry.getValue().equals("red")) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	}

}
