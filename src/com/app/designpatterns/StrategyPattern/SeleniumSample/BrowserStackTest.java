package com.app.designpatterns.StrategyPattern.SeleniumSample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackTest implements WebDriverStrategy {

	@Override
	public WebDriver getDriver(String browserName) {
		switch (browserName.toLowerCase()) {
				
				case "chrome" : 
					
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.setCapability("browserName", "chrome");
					chromeOptions.setCapability("browserVersion", "latest");
					chromeOptions.setCapability("bstack:options", Map.of(
					    "os", "Windows",
					    "osVersion", "11",
					    "userName", "YOUR_USERNAME",
					    "accessKey", "YOUR_ACCESS_KEY"
					));

					try {
						return new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), chromeOptions);
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

								
								
				case "edge" :
								EdgeOptions options = new EdgeOptions();
								options.setCapability("browserName", "MicrosoftEdge");
								options.setCapability("browserVersion", "latest");
			
								// For BrowserStack or Sauce Labs
								options.setCapability("bstack:options", Map.of(
								    "os", "Windows",
								    "osVersion", "10",
								    "browserName", "Edge",
								    "browserVersion", "latest",
								    "userName", "YOUR_USERNAME",
								    "accessKey", "YOUR_ACCESS_KEY"
								));
			
							try {
								return new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), options);
							} catch (MalformedURLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

				case "firefox" :
							FirefoxOptions fo = new FirefoxOptions();
							fo.setCapability("browserName", "MicrosoftEdge");
							fo.setCapability("browserVersion", "latest");
		
							// For BrowserStack or Sauce Labs
							fo.setCapability("bstack:options", Map.of(
							    "os", "Windows",
							    "osVersion", "10",
							    "browserName", "Edge",
							    "browserVersion", "latest",
							    "userName", "YOUR_USERNAME",
							    "accessKey", "YOUR_ACCESS_KEY"
							));
		
						try {
							return new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), fo);
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				default :
								throw new IllegalArgumentException();
				}
			}
	
	

}
