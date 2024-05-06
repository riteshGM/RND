package com.appname.seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitExample {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//this will basically returns boolean value-True/False--> Explicit wait is element specific

		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
		//element.click();
		
		//generic method calls
		By elelocator=By.xpath("//h3[text()='Selenium']");
		
		WebElement ele=waitForElePresent(driver, elelocator, 5);
		ele.click();
		
		//waitForElePresent(driver, elelocator, 5).click();

	}
	
	//Generic Method
	public static WebElement waitForElePresent(WebDriver driver,By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
	}

}
