package com.appname.Interfaces_Java8;



//Class Using Functional Interface

public class FunctionalInterfaceImpl {
	
	public static void main (String args[]) {
		FunctionalInterfaceSample obj = new FunctionalInterfaceSample() {
			public int add(int i,int j) {
				return i+j;
			}
		};
		
		System.out.println("Printing Addition "+ obj.add(1,2));
		
		
		FunctionalInterfaceSample obj2 = (i,j) -> i+j;
		System.out.println(obj2.add(1, 5));
	}
	
	
	
}
