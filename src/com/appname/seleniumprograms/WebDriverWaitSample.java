package com.appname.seleniumprograms;

import java.time.Duration;

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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visi(By.id("kandi")));
		
		//Fluent Wait - With Polling
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class)
				.pollingEvery(Duration.ofSeconds(1))
				.withMessage("Element Not Found");
			
				Alert alert = fluentWait.until(ExpectedConditions.alertIsPresent());
		
		
	}

}
