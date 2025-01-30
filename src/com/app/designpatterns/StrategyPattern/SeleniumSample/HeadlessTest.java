package com.app.designpatterns.StrategyPattern.SeleniumSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessTest implements WebDriverStrategy {

	@Override
	public WebDriver getDriver(String browserName) {
switch (browserName.toLowerCase()) {
		
		case "chrome" :
						ChromeOptions options = new ChromeOptions();
						options.addArguments("--headless");
						return new ChromeDriver(options);
						
		case "edge" :	
						EdgeOptions eo = new EdgeOptions();
						eo.addArguments("--headless");
						return new EdgeDriver(eo);
		case "firefox" :
						FirefoxOptions fo =  new FirefoxOptions();
						fo.addArguments("--headless");
						return new FirefoxDriver(fo);
		default :
						throw new IllegalArgumentException();
		}
	}
	
	

}
