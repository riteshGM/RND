package com.appname.seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreens {
	
	public static void main(String args[]) throws IOException{
		WebDriver driver = new FirefoxDriver();
		TakesScreenshot screen  = (TakesScreenshot) driver;
		File file =screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File ("FileLocation.png"));
		
	}

}
