package com.appname.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		
		// Distinct Numbers
		Stream.of(7, 8, 5, 4, 9, 1, 6, 4, 5, 6)
		.distinct()
		.forEach((n) -> System.out.println(n));
		System.out.println()
;		
		// Sorted and Distinct Numbers
		List<Integer> sortedList 
		= Stream.of(7, 8, 5, 4, 9, 1, 6, 4, 5, 6)
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		System.out.println(sortedList);

	}

}
