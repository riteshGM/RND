package com.app.designpatterns.DecoratorPattern;

public class ClientCass {
	
	public static void main (String args[]) {
		
		Coffee coffee = new CoffeeDecorator(new SimpleCoffee());
		
		//System.out.println(coffee.getCoffee() + " Cost :"+coffee.getCost());
		
		 coffee = new MilkDecorator(coffee);
		 coffee = new MilkDecorator(coffee);
		 coffee = new MilkDecorator(coffee);
		
		//System.out.println(coffee.getCoffee() + " Cost :"+coffee.getCost());
		
		coffee = new SugarDecorator(coffee);
		
		System.out.println(coffee.getCoffee() + " Cost :"+coffee.getCost());
	}

}
