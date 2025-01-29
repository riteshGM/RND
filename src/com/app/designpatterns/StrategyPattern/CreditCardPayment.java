package com.app.designpatterns.StrategyPattern;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		System.out.println("Credit Card Payment "+amount);
		
	}
	

}
