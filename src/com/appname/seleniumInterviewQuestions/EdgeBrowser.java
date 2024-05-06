package com.appname.seleniumInterviewQuestions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class EdgeBrowser {
	
	@Test
		public static void edgeBrowser() throws MalformedURLException {
		DesiredCapabilities caps1=new DesiredCapabilities();
		caps1.setBrowserName("MicrosoftEdge");
		WebDriver driver=new RemoteWebDriver(new URL(" http://192.168.1.9:4444"),caps1);
		driver.get("https://saucelabs.com/");
	}
}
