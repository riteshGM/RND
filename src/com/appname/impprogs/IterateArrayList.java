package com.appname.impprogs;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("10");
		al.add("100");
		al.add("1000");
		al.add("10000");
		
		System.out.println(al.size());
		
		System.out.println("While Loop::::");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using Advanced For Loop:::");
		for(Object obj:al) {
			System.out.println(obj);
		}
		
		System.out.println("using For loop:::::");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}

}
