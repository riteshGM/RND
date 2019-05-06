package com.appname.collections;

import java.util.*;

public class HashSetIteratorExample {
   public static void main(String args[]) {
       
   // Declaring a HashSet
   HashSet<String> hashset = new HashSet<String>();
   // Add elements to HashSet
   hashset.add("Pear");
   hashset.add("Apple");
   hashset.add("Orange");
   hashset.add("Papaya");
   hashset.add("Banana");    
   // Get iterator
   Iterator<String> it = hashset.iterator();
   // Show HashSet elements
   System.out.println("HashSet contains: ");
   while(it.hasNext()) {
     System.out.println(it.next());
   }
   
   System.out.println("HashSet contains Using for each loop:");
   // Using for each loop
   for(String str : hashset){
       System.out.println(str);
   }
   //Random access to elements is not allowed
   //hashset.get()
 }
} 
