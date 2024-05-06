package com.appname.collections;

import java.util.Arrays;
import java.util.Collections;

public class CollectionsReverseANumberArray {

	public static void main(String[] args) {

		Integer arr[] = {370,256,640,490,76,37,123};

		// Reverse an Array using collections
		Collections.reverse(Arrays.asList(arr));
		System.out.println("Reversed Array");
		System.out.println(Arrays.toString(arr));
		
		// Sort an Array using collections
		Collections.sort(Arrays.asList(arr));
		System.out.println("Sorted Array" );
		System.out.println(Arrays.toString(arr));
	}
}
