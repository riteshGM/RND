package com.app.designpatterns.StrategyPattern.SeleniumSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalTest implements WebDriverStrategy{

	@Override
	public WebDriver getDriver(String browserName) {
		
		switch (browserName.toLowerCase()) {
		
		case "chrome" : 
						return new ChromeDriver();
						
		case "edge" :
						return new EdgeDriver();
		case "firefox" :
						return new FirefoxDriver();
		default :
						throw new IllegalArgumentException();
		}
	}
}