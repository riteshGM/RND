package com.appname.seleniumprograms;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FindElementsExplicitWait {
	WebDriver driver;

	@Test (priority =0)
	public void testColum() {

		try{
			
			driver = new FirefoxDriver();
			driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
			driver.manage().window().maximize();
			By locator = By.xpath("//input[@class='cb1-element']");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			
			List <WebElement> myIput = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			System.out.println("Total Elements "+myIput.size());

		}catch(TimeoutException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println("Catch Block Visited");
			e.printStackTrace();
		}
	}//@Test Ends Here
	
}
