package com.appname.seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DynamicWebTable {

	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		driver.manage().window().maximize();
		
		/*
		 * //Login WebElement
		 * username=driver.findElement(By.xpath("//input[@id='Email']"));
		 * username.clear(); username.sendKeys("admin@yourstore.com");
		 * 
		 * WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		 * username.clear(); username.sendKeys("admin");
		 * 
		 * driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		 * 
		 * //Sales-->Orders
		 * //body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]
		 * /p[1] driver.findElement(By.xpath("//p[contains(text(),'Sales')]")).click();
		 * 
		 * driver.findElement(By.xpath("//p[contains(text(),'Orders')]")).click();
		 */
		
		
		//table
		//Find Total number of Entries in a table
		
		String text=driver.findElement(By.xpath("//div[@id='example_info']")).getText();
		System.out.println(text); //Showing 1 to 10 of 57 entries 
		
		int total_pages=Integer.valueOf(text.substring(text.indexOf("of")+3,text.indexOf("entries")-1));
		System.out.println(total_pages);
		
		
		

	}

}
