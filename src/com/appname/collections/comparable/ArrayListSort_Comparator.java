package com.appname.collections.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSort_Comparator {
	
	public static void main(String args[]){
		List<Student_UsingComparator> arrayList = Arrays.asList(new Student_UsingComparator(1,"Ritesh",21),
				new Student_UsingComparator(2,"Bhatti",20),new Student_UsingComparator(3,"Bhatti",20),new Student_UsingComparator(4,"Bhatti",23));
		
		Collections.sort(arrayList,Student_UsingComparator.compareStudRollNo);
		System.out.println("By Descending Roll No "+arrayList);
		Collections.sort(arrayList,Student_UsingComparator.compareStuAge);
		System.out.println("By Ascending Age "+arrayList);
		
		
		//Sample where we created Comparator in separate class
		
		Collections.sort(arrayList,new StudentComparatorRollNo());
		System.out.println("Ascending Order by RollNo "+arrayList);
		
		//Collections.reverse(arrayList);
		//System.out.println("Reverse"+arrayList);
		
		//How to reverse the order using Collections Class
		Collections.sort(arrayList,Collections.reverseOrder(new StudentComparatorRollNo()));
		System.out.println("Reverse Using Comparator"+arrayList);
	}

}
