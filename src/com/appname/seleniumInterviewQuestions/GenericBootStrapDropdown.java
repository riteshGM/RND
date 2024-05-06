package com.appname.seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class GenericBootStrapDropdown {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Number of products in dropdown-1 :"+productTypes.size());
		
		selectOptionFromDropdown(productTypes,"Accounts");
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Number of products in dropdown-2 :"+products.size());
		
		selectOptionFromDropdown(products,"Savings Accounts");

	}
	
	public static void selectOptionFromDropdown(List<WebElement> options, String value) {
		
		for(WebElement option:options) {
			
			if(option.getText().equals(value)){
				option.click();
				break;
				
			}
		
	}

}
}
