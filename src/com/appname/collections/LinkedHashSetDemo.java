package com.appname.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.apache.poi.ss.formula.functions.T;

public class LinkedHashSetDemo {
    public static void main(String a[]){
   /*     LinkedHashSet<String> lh = new LinkedHashSet<String>();
        lh.add("Saturday");
        lh.add("Monday");
        lh.add("Tuesday");
        lh.add("Wednesday");
		lh.add("Thursday");
		lh.add("Friday");
		lh.add(null);
		lh.add(null);
		lh.add("Sunday");
		lh.add("Tuesday");
        System.out.println(lh);
        System.out.println("Size of LinkedHashSet: "+lh.size());
        System.out.println("Is LinkedHashSet empty? : "+lh.isEmpty());
        
        Object[] obj =lh.toArray();
        System.out.println(obj);
        //If want to sort the linkedHashSet I can do it using TreeSet
        
        TreeSet<String> set = new TreeSet();
        
        set.addAll(lh);
        
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(set);
       
       * Import point to note here. we dont need to iterate and add
       * instead can use addAll() method
       *  Iterator<String> itr = lh.iterator();
        while(itr.hasNext()){
        	String value = (String) itr.next();
        	System.out.println(value);
        	set.add(value);
        	
        }
        
        System.out.println(set);
        
        set.remove("2");
        System.out.println("After removal"+set);
        
        System.out.println("Array List: "+arrayList);*/
        
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
        
        TreeSet<String> treeSet = new TreeSet<String>();

        /**
         * Null not allowed in TreeSet
         */
        //treeSet.add(null);
        System.out.println(treeSet);   
    }
}