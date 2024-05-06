package com.appname.seleniumInterviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HandleLinks {

	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); // Selenium-4
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// driver.findElement(By.linkText("Today's Deals")).click();
		// driver.findElement(By.partialLinkText("Today's Deals")).click();

		// How to capture how all the links in a webpage

		List<WebElement> links = driver.findElements(By.tagName("a"));

		/*
		 * int size=links.size();
		 * System.out.println("No of links presnt in webpage:  "+size);
		 * 
		 * for(int i=0;i<=size;i++) { String text=links.get(i).getText();
		 * System.out.println(text);
		 * System.out.println(links.get(i).getAttribute("href"));
		 * 
		 * }
		 */

		for (WebElement link : links) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}

	}

}
