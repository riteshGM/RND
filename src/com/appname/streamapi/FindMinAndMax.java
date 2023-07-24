package com.appname.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinAndMax {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1,21,3,4,5,-1);
		int max =
				input.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		int min =
				input.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("Max is "+max);
		
		System.out.println("Min is "+min);
		
	}

}
