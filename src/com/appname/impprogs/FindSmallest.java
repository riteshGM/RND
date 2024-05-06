package com.appname.impprogs;

import java.util.Arrays;
import java.util.List;

public class FindSmallest {
	
	public static void main(String[] args) {
		Integer givenArray[] = { 43, 71, 27, 4, 16, 99 };
		List<Integer> list = Arrays.asList(givenArray);
		java.util.Collections.sort(list);
		Integer smallest = list.get(0);
		System.out.println(smallest);
	}

}
