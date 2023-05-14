package com.appname.collections;

import java.util.*;

class ConvertArrayListToArray {
	public static void main(String args[]) {

		/* ArrayList declaration and initialization */
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Boston");
		cities.add("Dallas");
		cities.add("San jose");
		cities.add("Chicago");
		cities.add("Chicago");
		
		/** Another way to declare and initialize an Array
		 * 
		 */
		List<String> inputList = Arrays.asList("Ritesh","Mansukhani","Good","Mansukhani"); 

		/* ArrayList to Array Conversion */
		String citinames[] = cities.toArray(new String[cities.size()]);
		
		/* Displaying Array elements */
		for (String k : citinames) {
			System.out.println(k);
		}
		// sort using Collections.sort()
		Collections.sort(cities);
		System.out.println(cities);
		
		TreeSet<String> set = new TreeSet<String>();
		System.out.println("Duplicates in Array are");
		for(String each : citinames) {
			if(!set.add(each)) {
				System.out.print(each);
			}
		}
		
	}
}
