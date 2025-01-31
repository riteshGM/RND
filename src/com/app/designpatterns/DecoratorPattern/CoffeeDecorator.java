package com.app.designpatterns.DecoratorPattern;

public class CoffeeDecorator implements Coffee {
	
	public Coffee coffee;
	public CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getCoffee() {
		return coffee.getCoffee();
	}

	@Override
	public double getCost() {
		System.out.println("getCost() in CoffeeDecorator");
		return coffee.getCost();
	}
	
	
	
	

}
