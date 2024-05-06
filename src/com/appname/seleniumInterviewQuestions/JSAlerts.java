package com.appname.seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JSAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); // Selenium-4
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1. Alert window with OK button
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//2. Alert window with OK and Cancel Button
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(2000);
		Alert alert =driver.switchTo().alert();
		//driver.switchTo().alert()alert.accept(); //close alert by using OK button
		alert.dismiss();
		
		//3. Alert window with input box
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(2000);
		Alert alert1 =driver.switchTo().alert();
		String atext=alert.getText();
		System.out.println(atext);
	
		alert1.sendKeys("####THis is Alert BOX___ALERT###");
		
		alert1.accept();
		
		
		

	}

}
