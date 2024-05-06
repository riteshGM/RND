package com.appname.seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class ActionvsActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement feature=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(feature).perform(); //or else we can use build.perform()... differnce is in Perform we have build.perform()---Advisable .perform
		//act.moveToElement(feature).build().perform();
		//Actions is a calss and Action is an Interface
		//Return type of build is Action
		
		Action action=act.moveToElement(feature).build(); //Action is Interface---Build will create an Action , perform will complete the Action
		action.perform();
	}

}
