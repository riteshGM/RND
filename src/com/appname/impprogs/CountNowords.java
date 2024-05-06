package com.appname.impprogs;

import java.util.HashMap;

public class CountNowords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is the sample test of Automation to count the test";
		
		String[] strarr=str.split(" ");
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(int i=0;i<strarr.length;i++) {
			
			if(hm.containsKey(strarr[i])) {
				int count=hm.get(strarr[i]);
				hm.put(strarr[i], count+1);
			}
			else {
				hm.put(strarr[i], 1);
			}
		}
		System.out.println(hm);

	}

}
