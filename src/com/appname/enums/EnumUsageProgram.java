package com.appname.enums;

public class EnumUsageProgram {

	public void printEnum(AuthorType type) {
		System.out.println("Author Type Selected "+type);
	}
	
	public void selectBasedOnType(AuthorType type) {
		if(type == AuthorType.RITESH) {
			System.out.println("Author Type Selected as "+type);
		}else if (type == AuthorType.OMKAR) {
			System.out.println("Author Type Selected as "+type);
		}else if (type == AuthorType.BHARTI) {
			System.out.println("Author Type Selected as "+type);
		}
	}
	
	
	public static void main(String args[]) {
		EnumUsageProgram obj = new EnumUsageProgram();
		
		obj.printEnum(AuthorType.RITESH);
		obj.printEnum(AuthorType.BHARTI);
		obj.selectBasedOnType(AuthorType.RITESH);
		
		
		
		
	}
}
