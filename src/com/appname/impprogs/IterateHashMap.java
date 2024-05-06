package com.appname.impprogs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		hm.put("Test", 4);
		hm.put("Automation", 46);
		hm.put("java", 446);
		hm.put("Selenium", 0446);
		
		System.out.println(hm.size());
		
		//Iterate using for each loop
		for(Map.Entry h:hm.entrySet()) {
			System.out.println("key is:"+h.getKey()+ " "+"value is:" +h.getValue());
		}
		
		//Iterate using While loop
		Iterator itr=hm.entrySet().iterator();
		System.out.println("While Loop");
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry) itr.next();
			System.out.println("key is:"+me.getKey()+ " "+"value is:" +me.getValue());
		}
		

	}

}
