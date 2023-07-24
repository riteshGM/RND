package com.appname.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LastButOneHighestAndLowest {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(15,14,17,18,20,11,1,1,2,3,4,9);
		
		//Find Second Highest Number from List
		
		int secondHighest = input.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		
		
		int secondLowest = input.stream().sorted().distinct().skip(1).findFirst().get();
		
		System.out.println("Second Higest Number is "+secondHighest);
		
		System.out.println("Second Lowest Number is "+secondLowest);
		
		

	}

}
