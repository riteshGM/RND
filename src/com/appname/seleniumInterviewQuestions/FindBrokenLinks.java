package com.appname.seleniumInterviewQuestions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); // Selenium-4
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		int brokenlinks = 0;
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement li:links) {
			
			String URL=li.getAttribute("href");
			
			if(URL==null || URL.isEmpty()){
				System.out.println("URL is Empty");
				continue;
			}
			else {
				URL link=new URL(URL);

				try {
					HttpURLConnection httpconnection=(HttpURLConnection) link.openConnection();
					httpconnection.connect();
					if(httpconnection.getResponseCode()>=400) {
						
						System.out.println(httpconnection.getResponseCode()+ URL+ "  is  " + "Broken Link");
						brokenlinks++;
					}
					else {
						System.out.println(httpconnection.getResponseCode()+ URL+ "  is  " + "Valid Link");
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
		
		System.out.println("Total number of broken links in wenbPage is:::   "+brokenlinks);
		driver.quit();


	}

}
