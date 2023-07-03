package com.appname.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinSample {
	
	
	public static void main (String args[]) {
		
		
		List<Integer> numberList = Arrays.asList(3,4,5,6,7,8,9,10);
		
		Optional<Integer> minVal = numberList.stream().min((val1,val2) -> {
			return val1.compareTo(val2);
		});
		
		System.out.println("Min Value Found is "+minVal.get());
	}

}
