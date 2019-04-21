package com.appname.opps;

public class PolymorphismParent {
	
	int salary;
	public PolymorphismParent(int salary){
		System.out.println("Inside Constructor of PolymorphismParent");
		this.salary = salary;
		System.out.println("Salary initialized as "+this.salary);
	}
	
	public int getAge(){
		System.out.println("Inside PolymorphismParent getAge()");
		return this.salary;
	}
	//We define static mehtods with same name and parameters as in overriding rules but still it is not overriding since static is class owned only
		// never gets extended to child
	public static int getAge(int age){
		return 1;
	}
	
	public static final int getAgeFinalStatic(int age, int b, int c){
		return 1;
	}
	
	
}
