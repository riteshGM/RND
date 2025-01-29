package com.app.designpatterns.StrategyPattern;

public class PaymentContext {
	
	PaymentStrategy strategy;
	
	public PaymentContext(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void pay(double amount) {
		strategy.pay(amount);
	}
	
	
	
	

}
