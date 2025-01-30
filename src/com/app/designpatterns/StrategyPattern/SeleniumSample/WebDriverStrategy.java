package com.app.designpatterns.StrategyPattern.SeleniumSample;

import org.openqa.selenium.WebDriver;

public interface WebDriverStrategy {
	
	public WebDriver getDriver(String browserName);

}
