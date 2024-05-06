package com.appname.impprogs;

import java.util.*;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(100);
		al.add(200);
		
		int j=Collections.max(al);
		System.out.println("maximum number in an Array is:" +j);
		
		int ind=al.indexOf(j);
		System.out.println(ind);
		al.remove(ind);
		int max2=Collections.max(al);
		System.out.println("Second maximum number is:"+ max2);
		
		
		

	}

}
