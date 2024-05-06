package com.appname.seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B7_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.britannica.com/place/Bangalore-India/");
		//JavascriptExecutor js = (JavascriptExecutor)wd;
		/*js.executeScript("window.scrollBy(0,560)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-560)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)");
		
		
		WebElement link =wd.findElement(By.linkText("Britain"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);",link);
		link.click();*/
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_PAGE_UP);
	robot.keyRelease(KeyEvent.VK_PAGE_UP);	
	Thread.sleep(2000);
		wd.close();
	}

}
