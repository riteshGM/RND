package com.appname.seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithCredentials {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver(); //Open Bowser
		driver.manage().window().maximize();  //Maximize the window
		//Launch the application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Provides a waiting time between each consecutive test step as 3 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));  
		//Enter User Name
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//Password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123"); 
		//Click login button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.close();  //Close the window
		
	}

}
