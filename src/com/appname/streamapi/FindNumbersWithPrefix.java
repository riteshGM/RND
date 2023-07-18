package com.appname.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersWithPrefix {

	public static void main(String[] args) {
		
		List <Integer> input = Arrays.asList(2,221,231,4,1,3,521,512);
		List <Integer> output = 
		input.stream().map(e -> String.valueOf(e))
						.filter(e -> e.startsWith("2"))
						.map(e -> Integer.valueOf(e))
						.collect(Collectors.toList());
		
		System.out.println(output);
		
		//Another Way as Well
		List <Integer> output2 = 
				input.stream()
								.filter(e -> e.toString().startsWith("2"))
								.collect(Collectors.toList());
		
		System.out.println(output2);
	}

}
