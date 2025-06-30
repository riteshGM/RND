package com.appname.arrays;

import java.util.Arrays;

public class MoveAllZerosToRight {
	
	
	public static void main (String args[]) {
		int arr[] = {0,0,1,2,0,3,4,0};
		moveAllZeros(arr);
	}

	public static void moveAllZeros(int arr[]) {
		int index = 0;
		for(int each : arr) {
			if(each!=0) {
				arr[index]=each;
				index++;
			}
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		System.out.println("Processing Completed...");
		System.out.println(Arrays.toString(arr));
	}
}
