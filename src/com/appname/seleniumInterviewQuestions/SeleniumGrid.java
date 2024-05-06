package com.appname.seleniumInterviewQuestions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class SeleniumGrid {
		
	@Test
	public static void chromeBrowser() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL(" http://192.168.1.9:4444"),caps);
		driver.get("https://saucelabs.com/");
	}
	
}
