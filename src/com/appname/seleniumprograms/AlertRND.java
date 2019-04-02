package com.appname.seleniumprograms;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertRND {
	
	
	WebDriver driver;
	 @BeforeMethod
	 public void init() throws Exception {
	 driver = new FirefoxDriver();
	 driver.get("http://demo.guru99.com/test/delete_customer.php");
	 driver.manage().window().maximize();
	 }
	 
	 @Test
	 public void bla() throws AWTException, IOException {
	 driver.findElement(By.name("cusid")).sendKeys("123456");
	 driver.findElement(By.name("submit")).click();
	 
	 Alert obj = null;
	 obj.accept();
	 
	 // Trigger the alert
	 BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	 ImageIO.write(image, "png", new File("Test.png"));
	 
	 driver.switchTo().alert();
	 driver.quit();
	 //driver.switchTo().alert().accept();
	 }

}
