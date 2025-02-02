package com.app.designpatterns.RemoveSwitchAndIf;

import java.util.HashMap;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	
	
	private HashMap<String, Supplier<WebDriver>> driverMap = new HashMap<String, Supplier<WebDriver>> ();
	
	public DriverFactory() {
		System.out.println("Driver Map is Being Initialized");
		driverMap.put("chrome", this::createChromeDriver);
		driverMap.put("edge",this::createEdgeDriver);
		System.out.println("driver Map Initialization done "+driverMap.toString());
		
	}

	public WebDriver getDriver(String browserName) {
		Supplier<WebDriver> supplier =driverMap.get(browserName);
		if(supplier == null) {
			throw new IllegalArgumentException("browserName Supplied is not Implemented by DriverFactory "+browserName);
			
		}else {
			return supplier.get();
		}
		
	} 
	private WebDriver createChromeDriver() {
		return new ChromeDriver();
	}
	
	private WebDriver createEdgeDriver() {
		return new EdgeDriver();
	}
}
