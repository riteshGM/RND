package com.appname.Features_Java17;

public class SwitchCase_PatternMatching {

	public static void main(String[] args) {
		Object obj = 1.1;	
		
		switch(obj) {
		case String s -> System.out.println("Object is a String"+s);
		case Integer i -> System.out.println("Object is an Integer "+i);
		default -> System.out.println("Type not Defined");
		}

	}

}
