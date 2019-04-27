package com.appname.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DuplicatesInArrayUsingTreeSet {

    public static void main(String[] args) {
        String[] array = new String[]{"a", "d", "z", "x", "t", "b", "a", "z"};
        System.out.println("Input Array is : " + (Arrays.toString(array)));
        TreeSet<String> treeSet = new TreeSet<String>();
        for (String str : array) {
            if (!treeSet.add(str)) {
                System.out.println("Duplicate Entry is: " + str);
            }
        }
        System.out.println("TreeSet is : " + treeSet);
        
        /**
         * Using HashSet
         */
        HashSet<String> hashSet = new HashSet<String>();
        for (String str : array) {
            if (!hashSet.add(str)) {
                System.out.println("Duplicate Entry is: " + str);
            }
        }
        System.out.println("HashSet is : " + hashSet);
        
        /**
         * Using LinkedHashSet
         */
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        for (String str : array) {
            if (!linkedHashSet.add(str)) {
                System.out.println("Duplicate Entry is: " + str);
            }
        }
        System.out.println("LinkedHashSet is : " + linkedHashSet);
        
        System.out.println("Compare "+hashSet.contains("a"));
    }
}
