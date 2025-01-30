package com.app.designpatterns.StrategyPattern.SeleniumSample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ClientClass {
	
	@Test
	public void myMethod() {
		
		WebDriverContext context = new WebDriverContext(new LocalTest());
		
		WebDriver driver = context.getDriver("chrome");
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
