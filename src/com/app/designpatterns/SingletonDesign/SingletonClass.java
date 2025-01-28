package com.app.designpatterns.SingletonDesign;

public class SingletonClass {

	//Private Constructor - Dont want Instance Creation by any outside Program
	//Using new SingletonClass();
	
	private  SingletonClass() {
		
	}
	
	/**
	 * Private - since we dont want direct access to instance
	 * Static Only 1 Instance is created and passed on until teared down/nullified
	 */
	
	private static SingletonClass obj;
	
	//Public Static getInstance Method
	//Synchronized will Make it Threadsafe
	public static synchronized SingletonClass getInstnace() {
		if(obj == null) {
			obj = new SingletonClass();
		}
		return obj;
	}
	
	public static synchronized void tearDown() {
		obj = null;
	}

}
