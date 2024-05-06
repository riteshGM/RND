package com.appname.seleniumInterviewQuestions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Dropdown']")).click();
		WebElement staticdropdown=driver.findElement(By.id("dropdown"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(2);
	}
}
