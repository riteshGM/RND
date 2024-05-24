package com.appname.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapsExample {

	public static void main(String[] args) {
		
		
		List<String> list1 = Arrays.asList("Pink", "Bush");
		List<String> list2 = Arrays.asList("Maria", "Bush");
		List<String> list3 = Arrays.asList("Patrick", "Bambata");
		List<String> list4 = Arrays.asList("Joffery", "Johnson");
		List<String> list5 = Arrays.asList("Herald", "Somalia");
		
		List<List<String>> listAll = Arrays.asList(list1,list2,list3,list4,list5);
		System.out.println("Before Stream Operation");
		System.out.println(listAll);
		
		System.out.println("After Stream Operation FlatMap");
		List<String> flat =listAll.stream().flatMap(eachList -> eachList.stream()).collect(Collectors.toList());
		System.out.println(flat);
		
		//Print Only those Names which ends with a"
		
		listAll.stream().flatMap(eachList -> eachList.stream())
				.filter(eachEle -> eachEle.endsWith("a"))
				.forEach(each -> System.out.print(each+" "));
	}

}
