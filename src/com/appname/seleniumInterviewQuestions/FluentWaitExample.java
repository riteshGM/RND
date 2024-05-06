package com.appname.seleniumInterviewQuestions;

import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


public class FluentWaitExample {

	public static void main(String[] args) {
		// If the element is not available within 10 sec then it will throw exception . 
		//but in fluent wait  it provides more flexibility in polling time and ignoring exceptions
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		
		//Fluent Wait Declaration
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);
		   
		   driver.get("https://www.google.com");
		   driver.manage().window().maximize();
			
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			//driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
		   
		   
		   //Usage of Fluent wait
		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//h3[text()='Selenium']"));
		     }
		   });
		   
		   element.click();	

	}
	
	
	

}
