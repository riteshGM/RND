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
        
        
    }
}