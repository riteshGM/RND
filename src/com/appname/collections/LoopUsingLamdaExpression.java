package com.appname.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopUsingLamdaExpression {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.forEach(k -> {
			System.out.println("Key "+k);
		});
		
		Map<Integer, String> map = Map.of(
				1,"Ritesh",
				2,"Mansukhani",
				3,"Pune",
				4,"Hadapsar"
				);
		map.forEach((key,value) -> {
			System.out.println("Key "+key);
			System.out.println("Value "+value);
				});
		
	}

}
;