package com.appname.ExceptionHandling;

public class TestUserDefinedExceptions {
	
	public static void myMethod() throws AdvanceExceptionHandling {
			InnerClass.innerMethod(); //Testing Exception propagation
			String Ritesh = "RItesh Mansukhani";
			String Surname = "Mansukhani1";
			System.out.println("Printing Ritesh After Exception Ouccuered");
			if (Ritesh.endsWith(Surname)){
				System.out.println("Ritesh Ends with ["+Surname+"]");
			}else{
				throw new AdvanceExceptionHandling("Ritesh Doesn't End with ["+Surname+"]");
			}
		}


	public static void main (String args[]){
		
		try {TestUserDefinedExceptions.myMethod();
		}catch (AdvanceExceptionHandling e){
			System.out.println("main:ArithmeticException:catch block");
			//e.printStackTrace();
			System.out.println("Exception message"+e.getMessage());
		}
		
		System.out.println("Ritesh in main() after exception");
		System.out.println("Continuing Execution after Exception");
		
	}
}
