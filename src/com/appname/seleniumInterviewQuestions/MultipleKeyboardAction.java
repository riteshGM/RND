package com.appname.seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MultipleKeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		
		WebElement input1=driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		
		WebElement input2=driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
		input1.sendKeys("THis is selenium automation test..........");
		Thread.sleep(2000);
		//Multiple key press
		//CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//CTRL+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//tab-- shiftv to input 2 text box
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//CTRL+V
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Compare texts
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			
			System.out.println("Text Copied");
		}else {
			System.out.println("Text NOT Copied");
		}
		
		
		driver.close();

	}

}
