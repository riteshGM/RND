package com.appname.seleniumInterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class HandleiFrame {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); //Selenium-4
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/iframe[1]")).click();
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium.bidi']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[normalize-space()='webDriver']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium.chrome']")).click();//AbstractDriverOptions
	}

}
