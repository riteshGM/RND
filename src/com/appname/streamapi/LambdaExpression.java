package com.appname.streamapi;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		String[] places = { "Canada", "India", "Singapore", 
				                "USA", "Spain" , 
				               "Iran", "Italy", "Indonesiya"};
		// Array to list
		List<String> myplaces = Arrays.asList(places);
		myplaces.stream()
		.filter((p) -> p.startsWith("I"))
		.map((p) -> p.toUpperCase()) 
		.sorted().forEach((p) -> System.out.println(p));
    }
}
