package com.appname.seleniumprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		
		//Launching sample website
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().window().maximize();
		
		//Mouseover on submit button
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.id("idOfButton"));
		action.moveToElement(btn).perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
		
		//Closing the driver instance
		driver.quit();
	}	
	
}


