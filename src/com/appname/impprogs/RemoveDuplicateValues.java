package com.appname.impprogs;

import java.util.TreeSet;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"one","two","one","two","three","four"};
		
		TreeSet<String> ts= new TreeSet<String>();
		for(String s:str) {
			if(!ts.add(s)) {
				System.out.println("Duplciate values are:" + s);
			}
		}

	}

}
