package com.appname.seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class PermissionPopupNotification {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		//Permission based popups
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); // Selenium-4
		driver.get("http://www.redbus.in/");
		driver.manage().window().maximize();

	}

}
