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
		public Ritesh(){
			System.out.println("Inner Class 1 Constructor called");
		}
		
	}
	
	public class Mansukhani{
		public Mansukhani(){
			System.out.println("Inner Class 2 Constructor called");
		}
		
	}

}

class main{
	public static void main (String args[]){
		MultiplePublicClasses obj = new MultiplePublicClasses();
		obj.getRiteshInstance();
		
		
		System.out.println("Age is "+obj.getAge());
		
	}
}

/**
 * 
 * @author RiteshMansukhani
 *
 *Multiple Public classes in same java file not allowed
 *can remember this by a logic like by what name you would name the java file
 * 
 * @author RiteshMansukhani
 *
 *
 *
public class MyClass{
	
}
 */

