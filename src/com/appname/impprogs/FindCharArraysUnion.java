package com.appname.impprogs;

import java.util.HashSet;
import java.util.Set;

/**
 * Print Union Values i.e Print Only Unique Values 
 * from both arrays
 * @author RiteshMansukhani
 *
 */

public class FindCharArraysUnion {
	public static void main(String args []){
		int[] x= {2,5,3,7};
		int[] y={5,2,9,0,1};
		Set<Integer> uniqueSet = new HashSet<Integer>();
		for (Integer eachInt : x)
			uniqueSet.add(eachInt);
		
		for (Integer eachInt : y){
			uniqueSet.add(eachInt);
		}
		System.out.println("Union Values from both Arrays"+uniqueSet);
	}
}
