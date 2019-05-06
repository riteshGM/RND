package com.appname.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String a[]){
		HashMap hm = new HashMap();
        hm.put("1","FIRST");
        hm.put("2","SECOND");
        hm.put("3","THIRD");
		hm.put("4",null);
		//Can add same key value
		hm.put("4",null);
		hm.put(null,"FIFTH");
		hm.put(null,"SIXTH");
        System.out.println("hashmap is "+hm);
        System.out.println("Value of 1: "+hm.get("1"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        hm.remove("2");
        System.out.println("After removal process, the hashmap is "+hm);
        System.out.println("Size of the HashMap: "+hm.size());
        
        
        //Map Views
        System.out.println("Entry Set "+hm.entrySet());
        System.out.println("Keys Set "+hm.keySet());
        System.out.println("Values "+hm.values());
        
        Collection<String> valuesCollection =hm.values();
        //Iterate Using Classic For Loop
        Iterator <String> itr = valuesCollection.iterator();
        for (int i = 0; itr.hasNext();){
        	System.out.println(itr.next());
        }
      
    }
}
