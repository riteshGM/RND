package com.appname.impprogs;

import java.util.Arrays;
import java.util.HashSet;

public class missingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input= "abcdefghijklmnopqrstuvwx";
		input=input.replaceAll(" ", "");
		
		String[] inputarray=input.split("");
		//create string of alphabets
		
		String[] alphabets= "abcdefghijklmnopqrstuvwxyz".split("");
		
		//craeting hashsets to find intersections
		
		HashSet<String> s1= new HashSet<String>(Arrays.asList(inputarray));
		
		HashSet<String> s2= new HashSet<String>(Arrays.asList(alphabets));
		
		s2.removeAll(s1);
		
		System.out.println("Missing alphabets are:     "+s2);
		
	}

}
