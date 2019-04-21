package com.appname.opps;

public class PolymorphismCallingClass {
	public static void main(String args  []){
		/**
		 * Verify Child Object creation and reference variable of child type and parent type
		 */
		
		PolymorphismChild objChild = new PolymorphismChild(10);
		
		PolymorphismParent objParent = new PolymorphismChild(20);
		
		
		System.out.println(objChild.getAge());
		//Make a note that at run time method gets called from as per the object creation class_name and its value is used
		System.out.println(objParent.getAge());
		
		/**
		 * Verify Parent Object creation and reference variable of child type and parent type
		 */
		///Note that we tried to down cast but it is not allowed got ClassCastException
		//PolymorphismChild objChild2 = (PolymorphismChild) new PolymorphismParent(30);
		
		PolymorphismParent objParent2 = new PolymorphismParent(40);
		
		//System.out.println(objChild2.getAge());
		//Make a note that at run time method gets called from as per the object creation class_name and its value is used
		System.out.println(objParent2.getAge());
	}

}
