package com.appname.impprogs;

public class CountNoofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		String text="This is selenium automation testing using java";
		
		String[] strarr=text.split(" ");
		
		for(int i=0;i<strarr.length;i++) {
			count++;
		}
		System.out.println(count);

	}

}
