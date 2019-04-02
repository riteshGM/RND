package com.appname.seleniumprograms;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MutiThreadingSample {
	
	protected URL hubURL;
	WebDriver driver;
	protected static DesiredCapabilities capabilities;
	
	@Test
	public void setData()
	{	
		Long id = Thread.currentThread().getId();
	    System.out.println("Thread id:  " + id);
	    openBrowser();
	    this.notify();
		 driver.get("http://demo.guru99.com/test/delete_customer.php");
		 driver.manage().window().maximize();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close();
	}
	
	@Test
	public void setData2()
	{	
		Long id = Thread.currentThread().getId();
	    System.out.println("Thread id:  " + id);
	    openBrowser();
		 driver.get("http://demo.guru99.com/test/delete_customer.php");
		 driver.manage().window().maximize();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.close();
	}

	synchronized private void openBrowser() {
		System.out.println("Open Browser method started ###");
		System.out.println("Count#"+Thread.activeCount());
		/*try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    try {
			hubURL = new URL("http://localhost:4445/wd/hub");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		// driver = new FirefoxDriver();
		driver = new RemoteWebDriver(hubURL, capabilities); 
		
	}
	
	

}
