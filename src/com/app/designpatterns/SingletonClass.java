package com.app.designpatterns;

import groovyjarjarantlr4.v4.parse.ANTLRParser.sync_return;

public class SingletonClass {

	//Private Constructor - Dont want Instance Creation by any outside Program
	//Using new SingletonClass();
	
	private  SingletonClass() {
		
	}
	
	//Private Static Instance of Class
	private static SingletonClass obj;
	
	
	//Public Static getInstance Method
	//Synchronized will Make it Threadsafe
	public static synchronized SingletonClass getInstnace() {
		if(obj == null) {
			obj = new SingletonClass();
		}
		
		return obj;
	}
	

}
