package com.appname.collections;

import java.util.*;
public class ArrayListLoopExample {
    public static void main(String args[]) {
        // initialize ArrayList  
        List<Integer> al = Arrays.asList(2,4,5,6,7,8,9,11);
        System.out.println("Using Advanced For Loop");   
        // printing ArrayList 
        for (Integer num : al) {         
            System.out.println(num);   
        }
        
        List<String> arrayListObj = Arrays.asList("Ritesh","Mansukhani","a","b");
        System.out.println(arrayListObj);
        List<String> arrayListObj1 = Arrays.asList(new String []{"bb","zz","a","b"});
        System.out.println(arrayListObj1);
        
        List<String> arrayObj = Arrays.asList("He","Is","A","Jolly","Good","Fellow");
        //Using Advance For Loop
        for (String eachWord : arrayObj) {
        	System.out.print(eachWord+" ");
        }
        
        //Using Iterator
        Iterator <String> iteratorObj= arrayObj.iterator();
        //Print New Line to have next output on fresh line
        System.out.println();
        while (iteratorObj.hasNext()) {
        	System.out.print(iteratorObj.next()+" ");
        }
    }
}