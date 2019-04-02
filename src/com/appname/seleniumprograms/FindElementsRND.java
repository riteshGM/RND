package com.appname.seleniumprograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindElementsRND {
	
	
	WebElement element = null;
	public String methodName = null;
	WebDriver driver;



	@Test (priority =0)
	public void testColum() {

		try{
			//String service = System.getProperty("user.dir")+"\\drivers\\IEDriverServer_32.exe";
			//System.setProperty("webdriver.ie.driver", service);
			driver = new FirefoxDriver();
			//driver.get("http://toolsqa.com/automation-practice-table/");
			driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
			By locator = By.xpath("//input[@class='cb1-element1']");
			List<WebElement> elements=driver.findElements(locator);
			
			System.out.println("Total Elements "+elements.size());

		}catch(Exception e){
			System.out.println("Catch Block Visited");
			e.printStackTrace();
		}
	}//@Test Ends Here

}
