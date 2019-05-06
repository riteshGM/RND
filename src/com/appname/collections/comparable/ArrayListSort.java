package com.appname.collections.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
	
	public static void main(String args[]){
		List<Student> arrayList = Arrays.asList(new Student(1,"Ritesh",21),new Student(2,"Bhatti",20));
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		
		
	}

}
