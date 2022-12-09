package com.appname.opps;

public class MultiplePublicClasses {
	int age=0;
	
	public int getAge(){
		return age;
	}
	
	public MultiplePublicClasses(){
		System.out.println("Outer Class Constructor called");
	}
	
	public Ritesh getRiteshInstance(){
		return new Ritesh();
	}
	public class Ritesh{
		int age = 10;
		public Ritesh(){
			System.out.println("Inner Class 1 Constructor called");
		}
		
	}
	
	public class Mansukhani{
		public Mansukhani(){
			System.out.println("Inner Class 2 Constructor called");
		}
		
	}
	
	public static void main( String args []) {
		MultiplePublicClasses obj = new MultiplePublicClasses();
		Ritesh riteshObj = obj.getRiteshInstance();
		System.out.println("Age from Inner/Nested Class " + riteshObj.age);
		System.out.println("Age from Main/Outer Class "+obj.age);
	}

}
/*
class main{
	public static void main (String args[]){
		MultiplePublicClasses obj = new MultiplePublicClasses();
		obj.getRiteshInstance();
		
		
		System.out.println("Age is "+obj.getAge());
		
	}
}
*/


/**
 * 
 * @author RiteshMansukhani
 *
 *Multiple Public classes in same java file not allowed
 *can remember this by a logic like by what name you would name the java file
 * 
 * Only Nested Classes are allowed to be more than 1 becuase that doesn't create any ambiguity
 * @author RiteshMansukhani
 *
 *
 *
 *
public class MyClass{
	//Gives Public Class MyClass should be defined in it's own file named MyClass
}
*/
 

