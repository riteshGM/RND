package com.appname.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class FindSumOfAllIntegers {

	public static void main(String[] args) {
		
		
		List<Integer> input  = Arrays.asList(-1,0,12,14,18,19);
		
		
		Optional<Integer> sum = input.stream().reduce ((a,b) -> a+b);
		System.out.println("Total Sum is "+sum.get());
		
		//Find Average of All Integers
		
		double average = input.stream().mapToInt(e -> e ).average().getAsDouble();
		System.out.println("Average is "+average);
		
		/*
		 * Find Square of EachElement and average only such elements which are greater than 100
		 */
		List<Integer> input3  = Arrays.asList(1,4,5,18,30,15);
		double finalAverage = input3.stream()
								.map(e -> e*e)
								.filter(e -> e>100)
								.mapToInt(e -> e)
								.average()
								.getAsDouble();
		
		System.out.println("Final Average is "+finalAverage);

	}

}
