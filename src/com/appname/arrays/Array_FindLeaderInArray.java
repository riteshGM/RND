package com.appname.arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Find Max in Array
 * @author rites
 *
 */
public class Array_FindLeaderInArray {
	public static void main(String args []){
		int [] array = {1,2,17,2,22,2,3,1,2};
		
		int max = array[0];
		for (int i = 1; i<array.length; i++){
			if(max<array[i]){
				max = array[i];
			}
		}
		
		System.out.println("Leader Element is "+max);
		
		/**
		 * Other way is using any of collection
		 */
	
		Set<Integer> setObj = new HashSet<Integer>();
		for (int eachVal : array){
			setObj.add(eachVal);
		}
	
		System.out.println("Leader Val Using Collection is"+Collections.max(setObj));
		
	
	}
	

}
