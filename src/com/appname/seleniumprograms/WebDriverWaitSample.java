package com.appname.seleniumprograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitSample {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		/**
		 * Explicit Waits Samples
		 */
		
		//WebDriver Wait - No polling
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kandi")));
		
		//Fluent Wait - With Polling
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver> (driver)
				//.withTimeout(Duration.ofSeconds(5))
				.withTimeout(10, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				//.pollingEvery(Duration.ofSeconds(1))
				.pollingEvery(500, TimeUnit.MILLISECONDS)
				.withMessage("Element Not Found");
			
				fluentWait.until(ExpectedConditions.alertIsPresent());
				fluentWait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("mapp"), "Ritesh"));
		
				
				
				ExpectedConditions.
		
	}

}
