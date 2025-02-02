package com.app.designpatterns.RemoveSwitchAndIf;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void myTest() {
		DriverFactory factory = new DriverFactory();
		WebDriver driver = factory.getDriver("chrome");
		driver.get("https://www.google.co.in");
		System.out.println("Page Title "+driver.getTitle());
		driver.quit();	
	}

}
