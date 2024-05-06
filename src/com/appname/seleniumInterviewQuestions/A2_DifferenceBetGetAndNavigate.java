package com.appname.seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_DifferenceBetGetAndNavigate {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		//get
		// wd.get("https://www.google.com/");
		
		
		//navigate
		
		wd.navigate().to("https://www.google.com/");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.submit();
		Thread.sleep(1000);
		wd.navigate().back();
		input.sendKeys("birds");
		input.submit();
		Thread.sleep(1000);
		wd.navigate().back();
		wd.navigate().refresh();

	}

}
