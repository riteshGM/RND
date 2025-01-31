package com.app.designpatterns.DecoratorPattern;

public class SimpleCoffee implements Coffee {

	@Override
	public String getCoffee() {
		
		return "Simple Coffee";
	}

	@Override
	public double getCost() {
		System.out.println("getCost() in SimpleCoffee");
		
		return 5;
	}
	
	

}
