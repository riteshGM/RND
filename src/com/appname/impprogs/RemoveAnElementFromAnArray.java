package com.appname.impprogs;

public class RemoveAnElementFromAnArray {
	static int[] numArray = { 56, 16, 24, 67, 71 };
	public static void main(String[] args) {
		int num = removeElement();
		for (int k = 0; k < num; k++) {
			System.out.println(numArray[k]);
		}
	}
	public static int removeElement() {
		int remove = 16;
		int i = 0;
		int j = 0;
		while (i < numArray.length) {
			if (numArray[i] == remove) {
				i++;
			} else {
				numArray[j] = numArray[i];
				i++;
				j++;
			}
		}
		return j;
	}
}
