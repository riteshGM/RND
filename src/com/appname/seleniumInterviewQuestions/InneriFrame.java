package com.appname.seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class InneriFrame {

	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Selenium-4
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//click on iFrame within iFrame
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		//*[@id="Multiple"]/iframe
		
		WebElement parentframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		
		WebElement childframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		driver.switchTo().frame(parentframe);
		driver.switchTo().frame(childframe);
		
		//driver.switchTo().parentFrame(); //switch from child frame to parent frame
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Abrar Ahmed inside frame");
		

	}

}
