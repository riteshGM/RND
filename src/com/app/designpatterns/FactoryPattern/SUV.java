package com.app.designpatterns.FactoryPattern;

public class SUV implements Car{

	@Override
	public void assemble(String carName) {
		System.out.println("SUR Car Assembled Car Name"+carName);
	}
	

}
