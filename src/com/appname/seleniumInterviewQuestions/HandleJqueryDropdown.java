package com.appname.seleniumInterviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HandleJqueryDropdown {

	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); //Selenium-4
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		//selectChoiceValues(driver,"choice 1");
		//selectChoiceValues(driver,"all");
		selectChoiceValues(driver,"choice 2","choice 2 3","choice 6","choice 6 2 1","choice 6 2","choice 7");
		//driver.close();

	}

	
	public static void selectChoiceValues(WebDriver driver, String... value) {
		
	List<WebElement> choiceList	=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	
	if(!value[0].equalsIgnoreCase("all")) {
		
		for(WebElement item:choiceList) {
			
			String text=item.getText();
			
			for(String val:value) {
				if(text.equals(val)) {
					item.click();
					break;
				}
			}
		}
	}
	
	else {
		try {
		for(WebElement item:choiceList) {
			item.click();
		}
		}
		catch(Exception e) {
			
		}
			
		}
		
	}
		
	}
	



 