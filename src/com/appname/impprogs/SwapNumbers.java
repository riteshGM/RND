package com.appname.impprogs;

public class SwapNumbers {

	public static void main(String[] args) {
		// Method-1
		
		/*int x=5;
		int y=8;
		
		System.out.println("Before Swapping: "+x+""+y);
		x=x+y; //13
		y=x-y; //13-8=5
		x=x-y; //13-5=8
		
		System.out.println("After Swapping: "+x+""+y);*/

		//Method-2	
		int x=4;
		int y=8;
		int temp;
		temp=x; //4
		x=y; //8
		y=temp; //4
		System.out.println("After Swapping: "+x+""+y);
		
		
		
	}

}
