package com.appname.opps;

public class MultiLevelChild extends ChildOfBaseParent {
	
	String address ;
	
	MultiLevelChild(){
		address = "Amravati in MultiLevel Child Class Constructer";
		System.out.println("Inside MultiLevelChild Class Constructor");
	}
	
	public String getAddress() {
		return address;
	}
	

}
