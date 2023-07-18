package com.appname.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDupliates {

	public static void main(String[] args) {
		
		
		List <Integer> input  = Arrays.asList(2,2,1,3,4,1,1,1,1,5,5,5,5,55,5,5,5,5);
		
		
		Set<Integer> output = input.stream().filter(e -> Collections.frequency(input, e)>1).collect(Collectors.toSet());
		System.out.println(output);
		
		
		//One More Way
		Set<Integer> dummySet = new HashSet<Integer>();
		Set <Integer> repeatedSetValues = input.stream().filter(e -> !dummySet.add(e)).collect(Collectors.toSet());
		System.out.println("Unique Repeated Elements Found Already "+repeatedSetValues);
		
		//Now Find Repeated Elements with Occurrence Count
				
		Map<Integer,Integer> outputMap = output.stream().collect(Collectors.toMap(e -> e, e -> Collections.frequency(input, e)));

		System.out.println(outputMap);
		
		//One More Way to Find Frequency In Map
		
		Map<Integer,Integer> outputMap2 = new HashMap<Integer,Integer>();
		repeatedSetValues.stream()
		.forEach(e -> 
			outputMap2 .put(
					e,Integer.valueOf(Collections.frequency(input, e))
					)
				);
		System.out.println(outputMap2);
	}

}
