package com.appname.seleniumInterviewQuestions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class KeyBoardAction {

	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		
		//single key press
		act.sendKeys(Keys.ENTER).build().perform();
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		
		act.sendKeys(Keys.SPACE).build().perform();
		
		//multiple key press
		
		
		
		
		
		
		
		
	}

}
