package com.appname.ExceptionHandling;


public class InnerClass2 {
	
	public static void innerMethod2() throws AdvanceExceptionHandling {
		try{
			int a=10;
		
		//int b = a/0;
		int b = a/2;
		System.out.println("Print Masshallah B:"+b);
		String Ritesh = "RItesh Mansukhani";
		
		String Surname = "Mansukhani1";
		
		if (Ritesh.endsWith(Surname)){
			System.out.println("Ritesh Ends with ["+Surname+"]");
		}else{
			throw new AdvanceExceptionHandling("Ritesh Doesn't End with ["+Surname+"]");
		}
		}catch(ArithmeticException e){
			String message = "Arithematic Exception Occured";
			throw new AdvanceExceptionHandling(message);
			
		}
	}
}
