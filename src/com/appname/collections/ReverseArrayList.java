package com.appname.collections;



import java.util.Arrays;
import java.util.Collections;  
import java.util.List;  
public class ReverseArrayList {  
public static void main(String[] args) {  
	
     List<String> list = Arrays.asList(new String [] {"a","b","c","d","a","b","c","d","a","b","c","d"});  
     System.out.println("Before "+list);
    Collections.reverse(list);
    System.out.println("After reverse"+list);
    Collections.sort(list);
    System.out.println("After sorting"+list);
}
}
