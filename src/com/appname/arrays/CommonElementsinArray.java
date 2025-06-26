package com.appname.arrays;

public class CommonElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {10,20,60,70,800,999};
		
		int[] arr2= {20,20,80,70,800,990};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+ " ");
				}
			}
		}

	}

}
