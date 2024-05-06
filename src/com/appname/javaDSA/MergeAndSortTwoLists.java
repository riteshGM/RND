package com.appname.javaDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeAndSortTwoLists {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(45, 37, 78);
		List<Integer> list2 = Arrays.asList(96, 24, 53);
		System.out.println("List1 :"+ list1);
		System.out.println("List2 :"+ list2);
		// Merge two lists using addAll
		List<Integer> mergedList = new ArrayList<Integer>();
		mergedList.addAll(list1);
		mergedList.addAll(list2);
		System.out.println("MergedList :" + mergedList);
		List<Integer> sortedList1 = mergedList.stream()
			     .sorted().collect(Collectors.toList());
		System.out.println("SortedList :" + sortedList1);
	}
}
