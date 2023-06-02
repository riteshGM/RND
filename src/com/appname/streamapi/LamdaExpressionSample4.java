package com.appname.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Multiple Lines Of Code in Lamda Expression
 * @author admin
 *
 */

public class LamdaExpressionSample4 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		//Print only Even Numbers from List
		//Call by Method Reference
		list.forEach(i -> {
			if(i%2==0) {
				System.out.println(i);
				System.out.println("Second Line Printed");
			}
		}
		);
		
	}
	
}
