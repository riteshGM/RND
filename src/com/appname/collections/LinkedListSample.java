package com.appname.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
	
	public static void main (String args[]){
		LinkedList<String> list = new LinkedList<String>();
		System.out.println(list);
		list.add("a");
		list.add("b");
		list.add("a");
		list.add("d");
		list.add("e");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.remove("a");
		System.out.println(list);
		//If you want to pass your Collection obj to a method and want to make sure
		//that method should not be able to change it make it unModifieable using Collecitons Clas
		List <String> unModifiableList = Collections.unmodifiableList(list);
		//Below Command will give us UnSupportedOperationException
		//unModifiableList.add("a");
		
		List <String> syncList=Collections.synchronizedList(list);
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		List <String> myList =Collections.emptyList();
		myList.add("element");
		System.out.println(myList.contains("element"));
		
		
	}

}
