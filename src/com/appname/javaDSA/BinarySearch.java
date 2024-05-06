package com.appname.javaDSA;

public class BinarySearch {
	static int[] arr= {7,24,37,46,50,68};
	public static void main(String[] args) {
		int result=binarySearch(46);
		System.out.println(result);
	}
	public static int binarySearch(int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
