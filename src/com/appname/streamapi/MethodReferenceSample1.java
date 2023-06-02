package com.appname.streamapi;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceSample1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);

		
		//Call by Method Reference
		list.forEach(System.out::print);
		System.out.println();
		System.out.println("One More Call By Method Reference Sample");
		
		//Call By method Reference
		list.forEach(MethodReferenceSample1::doubleIt);
		
		
	}
	
	public static void doubleIt(int i) {
		System.out.print(i*2 + " ");
		
	}

}
