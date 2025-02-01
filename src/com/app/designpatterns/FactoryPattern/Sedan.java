package com.app.designpatterns.FactoryPattern;

public class Sedan implements Car{

	@Override
	public void assemble(String carName) {
		System.out.println("Sedan Car Assembelled Car Name"+carName);
		
	}
	
	

}
