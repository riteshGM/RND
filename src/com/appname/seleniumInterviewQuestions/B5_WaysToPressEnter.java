package com.appname.seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B5_WaysToPressEnter {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		WebElement input =wd.findElement(By.name("q"));
		//first method
		//input.sendKeys("Chennai");
		
		
		//second method
		//input.sendKeys("chennai" + Keys.ENTER);
		
		//third method
		//input.sendKeys("chennai \n");
		
		
		//fourth method
		/*input.sendKeys("Chennai");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);*/
		
		//fifth method
		
		
		//input.sendKeys("Chennai");
		//input.submit();
		
		//sixth method
		/*JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].value='Chennai'", input);
		Thread.sleep(2000);
		wd.quit();*/ 
		//however, this method does not press
	}

}
