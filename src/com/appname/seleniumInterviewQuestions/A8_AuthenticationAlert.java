package com.appname.seleniumInterviewQuestions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A8_AuthenticationAlert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}
	
	
}
