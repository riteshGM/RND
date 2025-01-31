package com.app.designpatterns.DecoratorPattern;

public class SugarDecorator extends CoffeeDecorator{

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}
	

	@Override
	public String getCoffee() {
		return coffee.getCoffee()+ ", Sugar";
	}

	@Override
	public double getCost() {
		System.out.println("getCost() in SugarDecorator");
		return coffee.getCost()+4;
	}
}
