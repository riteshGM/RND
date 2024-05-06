package com.appname.seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_DifferentWaysToRefresh {

	public static void main(String[] args) throws AWTException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("---remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		wd.findElement(By.name("q")).sendKeys("birds");
		wd.findElement(By.name("q")).submit();

		// first method

		// wd.navigate().refresh();

		// second method
//		
		// wd.get(wd.getCurrentUrl());

//	    //third method
//		
		// JavascriptExecutor js = ((JavascriptExecutor)wd);
		// js.executeScript("location.reload()");
//		
//		//fourth method
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

	}

}
