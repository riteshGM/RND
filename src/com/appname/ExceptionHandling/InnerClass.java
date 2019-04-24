package com.appname.ExceptionHandling;


public class InnerClass {
	
	public static void innerMethod() throws AdvanceExceptionHandling {
		InnerClass2.innerMethod2();
		System.out.println("InnerClass innerMethod");
	}

}
