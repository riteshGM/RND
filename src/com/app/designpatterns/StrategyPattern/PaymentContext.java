package com.app.designpatterns.StrategyPattern;

public class PaymentContext implements PaymentStrategy{
	
	PaymentStrategy strategy;
	
	public PaymentContext(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	@Override
	public void pay(double amount) {
		strategy.pay(amount);
	}
	

	
	
	
	

}
