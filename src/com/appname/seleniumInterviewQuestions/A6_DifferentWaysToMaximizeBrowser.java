package com.appname.seleniumInterviewQuestions;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A6_DifferentWaysToMaximizeBrowser {

	public static void main(String[] args) {
		//3rd method
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.get("https://www.google.com/");
		//1st method
		//wd.manage().window().maximize();
		
		//2nd method
	
//		Dimension newDimension = new Dimension(1366,768);
//		wd.manage().window().setSize(newDimension);
		
		
	}

}
