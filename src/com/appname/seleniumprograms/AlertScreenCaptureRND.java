package com.appname.seleniumprograms;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertScreenCaptureRND {
	
	
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
	 
	 // Trigger the alert
	 BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	 ImageIO.write(image, "png", new File("Test.png"));
	 
	 //driver.switchTo().alert();
	 driver.findElement(By.id("id"));
	 driver.quit();
	 //driver.switchTo().alert().accept();
	 }

}
