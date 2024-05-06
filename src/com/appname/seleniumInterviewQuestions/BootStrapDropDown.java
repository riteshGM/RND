package com.appname.seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import org.openqa.selenium.WebElement;



public class BootStrapDropDown {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//Product TYPE
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Number of products in dropdown-1 :"+productTypes.size());
		
		for(WebElement product:productTypes) {
			
			if(product.getText().equals("Accounts")){
				product.click();
				break;
				
			}
		}
		
		//Select Product
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Number of products in dropdown-2 :"+products.size());
		
		for(WebElement p:products) {
			
			if(p.getText().equals("Health Insurance")){
				p.click();
				break;
				
			}
		}

	}

}
