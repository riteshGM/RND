package com.appname.seleniumInterviewQuestions;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); //Selenium-4
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//Select specific checkbox
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//Select all the checkboxes
		
		List<WebElement> allcheckboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		
		//int totalcheckboxes=allcheckboxes.size();
		
		//System.out.println(totalcheckboxes);
		
		/*for(WebElement c:allcheckboxes) {
			System.out.println(c.isSelected());
			Thread.sleep(2000);
			c.click();
			System.out.println(c.isSelected());
		}*/
		
		//Select multiple checkboxes based on choice
		//Monday SUNDAY
		/*for(WebElement c:allcheckboxes) {
			String name=c.getAttribute("id");
			
			if(name.equalsIgnoreCase("monday") || name.equalsIgnoreCase("sUNdaY")) {
				c.click();
			}*/
			
			//Select last two check boxes
			
			//Total=7
			// last 2 check boxes means 7-2=5
			
			int totalcheckboxes=allcheckboxes.size();
			
			/*
			 * for(int i=totalcheckboxes-4;i<totalcheckboxes;i++) {
			 * 
			 * allcheckboxes.get(i).click(); }
			 */
			
			//select first 3 checkboxes
			
			for(int i=0;i<totalcheckboxes;i++) {
				if(i<=2) { //First 3 checkboxes select
				allcheckboxes.get(i).click();
				}
			}
			
		}

	}

