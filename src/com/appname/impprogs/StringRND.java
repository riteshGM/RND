package com.appname.impprogs;

import org.testng.annotations.Test;

public class StringRND {
	
	
	@Test()
	public void setData()
	{
	String msg = "java.lang.AssertionError: expected:<MY ADDRESSOFFICE> but was:<My addressOffice> and Status is 2Value of ITestResult.FAILURE2";
	msg =msg.replace("<", "&lt;");
	msg =msg.replace(">", "&gt;");
	System.out.println(msg);
	}
	
	@Test
	public static void  StringTest(){
		
		String msg = null;
		if(msg !=null){
			if(msg.contains("soft")){
				System.out.println("You Selected Soft");
				
			}else{
				System.out.println("you Selected Hard");
			}
		}
	else{
		System.out.println("Action is null");
	}
	}

	@Test
	public static void StringSubString(){
		
		String msg = "__cframe_ms__id48";
		System.out.println(msg.substring(14));
	}
	
	@Test
	public static void StringEmpty(){
		String msg ;
		msg = "";
		if (msg.isEmpty()){
			System.out.println("isEmpty() works for null["+msg+"]");
		}
		
		if (msg.equalsIgnoreCase("")){
			System.out.println("equalsIgnoreCase() works for null["+msg+"]");
		}
		
		if (msg!=null){
			System.out.println("msg null works["+msg+"]");
		}
	}
	
	
	@Test
	public static void StringNull(){
		String msg=null ;
		if (msg==null){
			msg="Ritesh";
			System.out.println("msg null works["+msg+"]");
			
		}else {
			
			System.out.println("msg not null works["+msg+"]");
		}
	}
}
