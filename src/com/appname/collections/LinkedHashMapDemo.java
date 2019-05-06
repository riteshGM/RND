package com.appname.collections;

import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo {
  public static void main(String[] args) {
	  LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(1, new String("Samsung"));
        linkedHashMap.put(2, new String("Mi"));
        linkedHashMap.put(3, new String("Toshiba"));
        linkedHashMap.put(4, new String("HCL"));
        linkedHashMap.put(5, new String("Wipro"));
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
        System.out.println("\nValues of map after iterating over it : ");
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
        System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
        System.out.println("\nLinkedHashMap contains 2 as key? : " + linkedHashMap.containsKey(2));
        System.out.println("LinkedHashMap contains HCL as value? : " + linkedHashMap.containsValue("HCL"));
        System.out.println("\nRemove entry for key 3 : " + linkedHashMap.remove(3));
        System.out.println("Content of LinkedHashMap after removing key 2: " + linkedHashMap);
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
        
  }
}
