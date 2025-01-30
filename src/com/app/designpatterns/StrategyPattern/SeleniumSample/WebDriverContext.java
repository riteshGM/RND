package com.app.designpatterns.StrategyPattern.SeleniumSample;

import org.openqa.selenium.WebDriver;

public class WebDriverContext {
	
	private WebDriverStrategy strategy;
	
	WebDriverContext (WebDriverStrategy strategy){
		this.strategy = strategy;
	}
	
	public WebDriver getDriver(String browserName) {
		return strategy.getDriver(browserName);	
	}

}
