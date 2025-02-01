package com.app.designpatterns.FactoryPattern;

public class HatchBack implements Car{

	@Override
	public void assemble(String carName) {
		System.out.println("HatchBack Car Assembled Car Name "+carName);
	}

}
