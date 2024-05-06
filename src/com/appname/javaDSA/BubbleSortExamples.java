package com.appname.javaDSA;

public class BubbleSortExamples {
	static int[] arr = { 5, 3, 8, 4, 6 };

	public static void main(String[] args) {
		int n = arr.length;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}System.out.println(arr[i]);
		}  
	}
}
