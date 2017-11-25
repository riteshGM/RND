package com.appname.ExceptionHandling;

public class AdvanceExceptionHandling extends Exception {
	
	public AdvanceExceptionHandling(String str){
		super(str);
	}
	
	
	
	
	public static void main(String args[]){
		
		try{
			int a = 100;
		
		 throw new AdvanceExceptionHandling("This is User-Defined Exception");
		 
	}catch(AdvanceExceptionHandling exp){
		System.out.println(exp);
	}
	}
	


}
