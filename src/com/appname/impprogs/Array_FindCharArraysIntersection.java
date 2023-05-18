package com.appname.impprogs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_FindCharArraysIntersection {
	public static void main(String args []){
		int[] x= {2,5,3,7,2};
		int[] y={5,2,9,0,2,1};
		Set<Integer> uniqueSet = new HashSet<Integer>();
		Set<Integer> commonValuesSet = new HashSet<Integer>();
		for (Integer eachInt : x)
			uniqueSet.add(eachInt);
		for (Integer eachInt : y){
			if(!uniqueSet.add(eachInt)){
				commonValuesSet.add(eachInt);
			}
			
		}
		System.out.println("Common Values only from both Arrays"+commonValuesSet);
		
		/**
		 * Other way is using third array
		 */
		int [] z = new int[x.length+y.length];
		
		//iterator through both arrays and compare values
		int i =0;
		for (int eachX: x)
		{
			for (int eachY : y){
				if(eachX==eachY){
					z[i]=eachX;
					i++;
				}
			}
		}
		
		//System.out.println("Unique Char Array Using Classic Arrray is "+Arrays.toString(z));
		System.out.print("[");
		for(int temp=0 ; temp<i;temp++){
			System.out.print(z[temp]+" ");
		}
		System.out.print("]");
	}
}
