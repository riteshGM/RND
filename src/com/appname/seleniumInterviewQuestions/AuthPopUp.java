package com.appname.seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AuthPopUp {

	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); // Selenium-4
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		//Syntax
		// http://admin:admin@the-internet.herokuapp.com/basic_auth
		// http://username:password@the-internet.herokuapp.com/basic_auth
		

	}

}
