package com.appname.ExceptionHandling;

import net.bytebuddy.implementation.bytecode.Throw;

public class AdvanceExceptionHandling extends RuntimeException {
	
	public AdvanceExceptionHandling(String str){
		super(str);
	}
	
	public AdvanceExceptionHandling() {
		super();
	}
	
	public AdvanceExceptionHandling(Throwable cause) {
		super(cause);
	}
	
	public AdvanceExceptionHandling(String str, Throwable cause) {
		super (str, cause);
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
