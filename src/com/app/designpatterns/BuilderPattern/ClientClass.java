package com.app.designpatterns.BuilderPattern;

public class ClientClass {

	public static void main(String[] args) {
		
		
		Product product1 = new Product.ProductBuilder("Mac Book Pro", 12, true).build();
		product1.setStoreCity("Pune");
		System.out.println(product1.toString());
		
		Product product2 = new Product.ProductBuilder("Iphone 16 Pro Max", 56, true)
										.setDescription("New Iphone Launched in 2025")
										.setStoreCity("Hyderabad")
										.build();
		System.out.println(product2.toString());
		
		
		System.out.println(product1==product2);
		
	}

}
