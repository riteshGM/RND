package com.appname.variables;

public class TypeOfVariables {
	
	// Instance Variables
	int i;
	String str;
	static int staticVariable= 10;
	
	public void printLocalVariable() {
		//Local Variables
		int localVariable = 10;
		i =4;
		str = "In Local Varibale Mehtod";
		System.out.println("Local Variable printLocalVariable() "+localVariable);
		System.out.println("Instance Variable printLocalVariable() "+i);
		System.out.println("Instance Variable printLocalVariable() "+str);
		System.out.println("Printing Static Variable printLocalVariable() "+staticVariable);
	}
	
	public void method2() {
		i=15;
		staticVariable=22;
		System.out.println("Instance Variable from method2() "+i);
		System.out.println("Printing Static Variable method2() "+staticVariable);
	}

	public static void staticMethod() {
		final  int finalVariable = 20;
		int localVariable = 10;
		System.out.println("Used local variable in Static Method staticMethod() "+localVariable);
		System.out.println("Used Static Variable in Static Method staticMethod() "+staticVariable);
		staticVariable = 15;
		//Instance non Static Variable cannot be access in static method
		//System.out.println(str);
		System.out.println("Updated Static Varibale in Static Method staticMethod() "+staticVariable);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeOfVariables obj = new TypeOfVariables();
		obj.printLocalVariable();
		obj.method2();
		obj.staticMethod();
		
	}

}
