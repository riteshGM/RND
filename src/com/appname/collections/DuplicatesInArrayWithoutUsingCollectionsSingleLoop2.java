package com.appname.collections;

import java.util.Arrays;

//TODO need to revisit this

public class DuplicatesInArrayWithoutUsingCollectionsSingleLoop2 {

	public static void main(String args[]) {
		//int [] array = {1,2,3,1,2,1,2,3,1,3,2};
		//int[] array = { 1, 2, 3, 2, 2, 2 };
		int[]array = {1,2,3,3,3,1};

		Arrays.sort(array);

		System.out.println("Sorted Array input is");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

		int outputArr [] = new int[array.length];
		System.out.println("Before Searching");
		for(int each : outputArr ) {
			System.out.print(each);
		}
		
		
		boolean print = true;
		int outputArrayIndex = 0;
		for(int index =0; index < array.length ; index++) {
			
			if(index == array.length-1) {
				if(print) {
					outputArr[outputArrayIndex] = array[index];
				}else {
					//do Nothing
					//outputArrayIndex--;
				}
			}else if(array[index]==array[index+1] && print) {
				outputArr[outputArrayIndex] = array[index];
				outputArrayIndex++;
				print = false;
			}else if (array[index]!=array[index+1] && print) {
				outputArr[outputArrayIndex] = array[index];
				outputArrayIndex++;
			}else if (array[index]!=array[index+1] && !print) {
				print = true;
			}else {
				System.out.println("Duplicate Element Do Nothing "+array[index]);
			}
		}
		
		
		System.out.println("After Searching");
		for(int each : outputArr ) {
			System.out.print(each);
			
		}
		
		System.out.println("Total Elements found unique"+outputArrayIndex);
		//Save Output finally
		int finalArry[] = new int[outputArrayIndex];
	
		for (int index = 0; index <finalArry.length ; index++ ) {
			finalArry[index] = outputArr[index];
			System.out.print(finalArry[index]);
		}
		
		
	}
}
