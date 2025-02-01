package com.app.designpatterns.FactoryPattern;

public class ClientClass {

	public static void main(String[] args) {
		
		CarFactory factory = new CarFactory();
		
		factory.getCar("Sedan").assemble("Corolla Altis");
		
		factory.getCar("HatchBack").assemble("Grand I10");
		
		factory.getCar("SUV").assemble("XUV 700");
		 
	}

}
