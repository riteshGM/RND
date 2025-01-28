package com.app.designpatterns.BuilderPattern;

public class Product {
	
	

	//Mandatory Fields
	private String name;
	private double price;
	boolean stockPresent;
	
	//Optional Fields
	private String description;
	private String storeCity;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStockPresent() {
		return stockPresent;
	}

	public void setStockPresent(boolean stockPresent) {
		this.stockPresent = stockPresent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStoreCity() {
		return storeCity;
	}

	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

//Private Constructor for Prouct
	private Product(ProductBuilder builder) {
		this.name = builder.name;
		this.price = builder.price;
		this.stockPresent = builder.stockPresent;
		this.description = builder.description;
		this.storeCity = builder.storeCity;
	}
	
	//Source -> Generate toString()
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stockPresent=" + stockPresent + ", description="
				+ description + ", storeCity=" + storeCity + "]";
	}
	
	
	
	public static class ProductBuilder{
		
		//Mandatory Fields
		private String name;
		private double price;
		boolean stockPresent;
		
		//Optional Fields
		private String description;
		private String storeCity;
		
		
		
		public ProductBuilder(String name, double price, boolean stockPresent) {			
			this.name = name;
			this.price = price;
			this.stockPresent = stockPresent;
		}
		
		
		//Public Setters for Optional Fields
		public ProductBuilder setStoreCity(String storeCity) {
			this.storeCity = storeCity;
			return this;
		}
		public ProductBuilder setDescription(String description) {
			this.description = description;
			return this;
		}
		
		//public build method
		public Product build() {
			return new Product(this);
		}
		
	}
	

}
