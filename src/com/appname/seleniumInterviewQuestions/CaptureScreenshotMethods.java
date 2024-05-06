package com.appname.seleniumInterviewQuestions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CaptureScreenshotMethods {

	public static void main(String[] args) throws IOException {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		//Full Page Screenshot
		
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		File Tar=new File(".\\Screenshots\\homepage.png");
		
		FileUtils.copyFile(src, Tar);*/
		
		
		//Capture Portion/section of page
		
		WebElement section=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[2]"));
		
		File src1= section.getScreenshotAs(OutputType.FILE);
		
		File Tar1=new File(".\\Screenshots\\homepage.png");
		
		FileUtils.copyFile(src1, Tar1);
		
		//Capture Scrreenshot of specific webElement
		
		WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		
		File src= logo.getScreenshotAs(OutputType.FILE);
		
		File Tar=new File(".\\Screenshots\\logo.png");
		
		FileUtils.copyFile(src, Tar);
		
		
		driver.close();
		
		

	}

}
