package com.appname.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListInReverseOrder {

	public static void main(String[] args) {
	List<String> names = 
		Arrays.asList("CAB", "TAB", "MOB", "NAB", "ROB", "BOB");
    //Each character of string converted into a Unicode value
	Collections.sort(names, (a, b) -> b.compareTo(a));
	System.out.println(names);
	}
}
