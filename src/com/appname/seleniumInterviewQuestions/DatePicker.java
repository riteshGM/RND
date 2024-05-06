package com.appname.seleniumInterviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DatePicker {

	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		/*
		 * Alert alert=driver.switchTo().alert(); alert.accept();
		 */
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		
		String date="19";
		String month="November";
		String year="2022";
		
		//click on Datepicker
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
		
		while(true) {
			
			String mon=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/div/span[1]")).getText();
			String yr=driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/div/span[2]")).getText();
			
			if(mon.equalsIgnoreCase(month)&&yr.equals(year)) 
				break;
			else
				driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span")).click();
			
		}
		
		//Date selection--> //*[@id="jDate"]/span/div/div/div[2]/table//tbody//tr
		
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table//tr"));
		
		for(WebElement ele:alldates) {
			
			String dt=ele.getText();
			
			if(dt.equals(date)) {
				ele.click();
			}
		}

	}

}
