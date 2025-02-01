package com.app.designpatterns.FactoryPattern;

public class CarFactory {
	
	public Car getCar(String carType) {
		
		switch (carType) {
		case "HatchBack" :
					return new HatchBack();
		case "Sedan" :
					return new Sedan();
		case "SUV" :
					return new SUV();
		default :
				throw new IllegalArgumentException("Please Supply Correct CarType "+carType);
		}

		
	}

}
