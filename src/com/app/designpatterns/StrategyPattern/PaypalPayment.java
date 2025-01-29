package com.app.designpatterns.StrategyPattern;

public class PaypalPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		System.out.println("Paypal Payment "+amount);
		
	}
	
	

}
