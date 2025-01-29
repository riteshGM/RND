package com.app.designpatterns.StrategyPattern;

public class ClientClass {
	
	public static void main (String args []) {
		
		
		PaymentContext context = new PaymentContext(new CreditCardPayment());
		
		context.pay(500);
		
		PaymentContext context2 = new PaymentContext(new PaypalPayment());
		context2.pay(150);
		
		context2.setPaymentStrategy(new CreditCardPayment());
		context2.pay(60000);
	}

}
