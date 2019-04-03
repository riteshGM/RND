package com.appname.seleniumprograms;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAndSelectFromList {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Launching sample website
		driver.get("http://total-qa.com/selenium/demo-sites/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("push-dontallow-text")).click();
		
		driver.findElement(By.id("sendx-close-Kn437nzgqdiCYGEBvhbUiE")).click();
		Thread.sleep(3000);
		
		WebElement ele =driver.findElement(By.xpath("//a[contains(text(),'Advanced Selenium')]"));
		//Mouse hover on submit button
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		WebElement subEle =driver.findElement(By.xpath("//a[contains(text(),'Github')]"));
		
		action.moveToElement(subEle).build().perform();
		
		//Thread.sleep just for user to notice the event
		Thread.sleep(3000);
		
		//Closing the driver instance
		driver.quit();
	}	
	
}


