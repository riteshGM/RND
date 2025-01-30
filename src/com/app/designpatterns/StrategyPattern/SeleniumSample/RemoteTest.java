package com.app.designpatterns.StrategyPattern.SeleniumSample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteTest implements WebDriverStrategy {

	@Override
	public WebDriver getDriver(String browserName) {
		switch (browserName.toLowerCase()) {
		
		case "chrome" : 
						ChromeOptions co = new ChromeOptions();
						try {
							return new RemoteWebDriver(new URL("http://localhost:8080/ed/hub"),co);
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
		case "edge" :
						EdgeOptions eo = new EdgeOptions();
						try {
							return new RemoteWebDriver(new URL("http://localhost:8080/ed/hub"),eo);
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
		case "firefox" :
						FirefoxOptions fo = new FirefoxOptions();
						try {
							return new RemoteWebDriver(new URL("http://localhost:8080/ed/hub"),fo);
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		default :
						throw new IllegalArgumentException();
		}
	}
	

}
