package com.app.designpatterns;

public class SingletonUsageProgram {

	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.getInstnace();
		System.out.println(obj);
		SingletonClass obj2 = SingletonClass.getInstnace();
		System.out.println(obj2);
		//obj.tearDown();
		System.out.println(obj);
	}

}
