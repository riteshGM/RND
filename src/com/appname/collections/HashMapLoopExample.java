package com.appname.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapLoopExample {
    public static void main(String args[]) {
        
    // Creating a HashMap of String keys and String values
    Map<String, String> hashmap = new HashMap<String, String>();
    hashmap.put("Key1", "Value1");
    hashmap.put("Key2", "Value2");
    System.out.println("Iterating or looping map using entrySet and foreach loop");
    // For each loop and entrySet() method
    Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
    for (Map.Entry<String,String> entry : entrySet) {
        System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
    }
    // for each loop and keySet()
    for (String eachKey : hashmap.keySet()){
    	System.out.println("Key is "+eachKey+" Value is "+hashmap.get(eachKey));
    }
    
    //Using iterator() and entrySet()
    Iterator<Map.Entry<String,String>> itr = hashmap.entrySet().iterator();
    while(itr.hasNext()){
    	Map.Entry<String,String> eachEntry = itr.next();
    	System.out.println("Key is "+eachEntry.getKey()+" value is "+eachEntry.getValue());
    }
    
    //Using iterator() and keySet()
    Iterator<String> setItr = hashmap.keySet().iterator();
    while(setItr.hasNext()){
    	String eachKey = setItr.next();
    	System.out.println("Key is "+eachKey+" value is "+hashmap.get(eachKey));
    }
    
    //Using classic for loop and entrySet()
    for(; itr.hasNext();){
    	Map.Entry<String,String> eachEntry = itr.next();
    	System.out.println("Key is "+eachEntry.getKey()+" value is "+eachEntry.getValue());
    }
    
    //Using classic for loop and keySet()
    for(int i = 0; setItr.hasNext();){
    	String eachKey = setItr.next();
    	System.out.println("Key is "+eachKey+" value is "+hashmap.get(eachKey));
    }
    
  }
}
