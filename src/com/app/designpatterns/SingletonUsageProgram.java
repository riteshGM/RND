package com.app.designpatterns;

public class SingletonUsageProgram {

	public static void main(String[] args) {
		SingletonClass obj = SingletonClass.getInstnace();
		System.out.println(obj.hashCode());
		SingletonClass obj2 = SingletonClass.getInstnace();
		System.out.println(obj2);
		//Nullify Singleton Instance;
		SingletonClass.tearDown();
		System.out.println(SingletonClass.getInstnace());
		System.out.println(SingletonClass.getInstnace());
		System.out.println(SingletonClass.getInstnace());
		SingletonClass.tearDown();
		System.out.println(SingletonClass.getInstnace());
		System.out.println(SingletonClass.getInstnace());
		
	}

}
