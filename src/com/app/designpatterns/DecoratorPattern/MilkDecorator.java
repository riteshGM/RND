package com.app.designpatterns.DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator{

	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}
	
	
	@Override
	public String getCoffee() {
		return coffee.getCoffee()+ ", Milk";
	}

	@Override
	public double getCost() {
		System.out.println("getCost() in MilkDecorator");
		return coffee.getCost()+2;
	}

}
