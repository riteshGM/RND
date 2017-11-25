package com.appname.otherpackage;

import com.appname.ExceptionHandling.AdvanceExceptionHandling;

public class TestUserDefinedExceptions {
	
	public static void myMethod() throws AdvanceExceptionHandling {
		
		String Ritesh = "RItesh Mansukhani";
		
		String Surname = "Mansukhani1";
		
		if (Ritesh.endsWith(Surname)){
			System.out.println("Ritesh Ends with ["+Surname+"]");
		}else{
			throw new AdvanceExceptionHandling("Ritesh Doen't End with ["+Surname+"]");
		}
		
	}

	public static void main (String args[]) throws AdvanceExceptionHandling{
		
		TestUserDefinedExceptions.myMethod();
		
	}
}
