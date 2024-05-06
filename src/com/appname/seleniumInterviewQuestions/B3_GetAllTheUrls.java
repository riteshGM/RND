package com.appname.seleniumInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B3_GetAllTheUrls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("game of thrones");
		input.submit();
		Thread.sleep(2000);
	/*List<WebElement> totalLinks =	wd.findElements(By.tagName("a"));
	for (WebElement links: totalLinks) {
		System.out.println(links.getAttribute("href"));    
	}*/
	
	List<WebElement> totalLinks =	wd.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));	
	
	for (WebElement links : totalLinks) {
		System.out.println(links.getText());
	}
	}
	}


