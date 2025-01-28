package com.appname.variables;

public class TrickyCounter {
	
	public static void main (String args[]) {
		//Integer Catching -128 to 127
		/**
		 * If Integer is initialzed between -128 to 127 - object points to same reference in heap memory
		 */
		
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1==i2); // == Reference is compared
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3==i4); // == will give False Here since reference is not same. if we use .equals gives true - since content is compared
		
		
		Integer i5 = new Integer(127);
		Integer i6 = new Integer(127);
		System.out.println(i5==i6);
		
	}

}
