package com.appname.seleniumInterviewQuestions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_TakesScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.get("https://www.google.com/");
		wd.manage().window().maximize();
	File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//
	FileHandler.copy(src,new File("C:\\SeleniumPractiseWorkSpace2\\C2_WebDriverTest\\screenshots\\google.png"));
	
	}

}
