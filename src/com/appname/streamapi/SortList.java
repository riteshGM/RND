package com.appname.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> input  =  Arrays.asList(1,15,2,5,10);
		
		
		List<Integer> sortedAsc = input.stream().sorted().collect(Collectors.toList());
		
		List <Integer> sortedDsc = input.stream().sorted(Collections.reverseOrder()).toList();
		
		System.out.println("Ascending Order List"+sortedAsc);
		
		System.out.println("Descending Order List"+ sortedDsc);

	}

}
