package com.appname.opps;

public class PolymorphismChild extends PolymorphismParent{
	int age;
	public PolymorphismChild(int age){
		super(age+1);
		System.out.println("Inside Constructor of PolymorphismChild");
		this.age = age;
		System.out.println("Age initialized as "+this.age);
	}
	
	public int getAge(){
		System.out.println("Inside PolymorphismChild getAge()");
		System.out.println("Testing the code inside child");
		System.out.println("Value of age is found to be "+this.age);
		return this.age;
	}
	
	//We define static mehtods with same name and parameters as in overriding rules but still it is not overriding since static is class owned only
	// never gets extended to child
	public static int getAge(int age){
		return 1;
	}
	
	//Overloading final Static method is allowed
	public static final int getAge(int age, int b){
		return 1;
	}
	
	public static final int getAge(int age, int b, int c){
		return 1;
	}
	/*
	//Cannot override final method from parent as simple as that

	public static final int getAgeFinalStatic(int age, int b, int c){
		return 1;
	}*/
}
