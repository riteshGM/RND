package com.appname.seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class GenericDropdownExample {
	public static WebDriver driver;


	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Appraoch-1
		
	/*	Select filesDrp=new Select(driver.findElement(By.id("files")));
		filesDrp.selectByIndex(1);
		
		Select productDrp=new Select(driver.findElement(By.id("products")));
		productDrp.selectByIndex(1);
		
		Select animalDrp=new Select(driver.findElement(By.id("animals")));
		animalDrp.selectByIndex(1);  */
		
		
		//Approach-2
		WebElement filesEle=driver.findElement(By.id("files"));
		
		selectOptionFromDropdown(filesEle,"DOC file");
		WebElement productEle=driver.findElement(By.id("products"));
		selectOptionFromDropdown(productEle,"Yahoo");
		
		WebElement animalEle=driver.findElement(By.id("animals"));
		selectOptionFromDropdown(animalEle,"Avatar");
		
	}
	
	public static void selectOptionFromDropdown(WebElement ele,String value) {
		
		Select drp= new Select(ele);
		List<WebElement> allOptions=drp.getOptions();
		
		for(WebElement option:allOptions) {
			
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		
	}

	}
}
