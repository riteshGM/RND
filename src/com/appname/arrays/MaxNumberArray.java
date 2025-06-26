package com.appname.impprogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,60,70,800,999};
		
		int max= Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		
		//using ArraList
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println(Collections.max(list));

	}

}
