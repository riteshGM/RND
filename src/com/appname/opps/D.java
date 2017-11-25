package com.appname.opps;

public class D {
	
	public static void main (String args[]){
	B objB = new B();
	B objB2 = new B();
	
	objB2 = objB;
	
	ChildOfB objChildOfB = new ChildOfB();
	

	
	
	objB2.defaultRitesh="Handle";
	objB.defaultRitesh="Pendle";
	
	System.out.println(objB2.defaultRitesh);
	System.out.println(objB.defaultRitesh);
	
	
	}


}
