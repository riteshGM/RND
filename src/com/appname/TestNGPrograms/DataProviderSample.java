package com.appname.TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataProviderSample {		
	/**
	 * Trying Sample Code creation to run test in parallel.
	 */



	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite Called");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite Called");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test Called");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("After Test Called");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class Called");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("After Class Called");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method Called");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method Called");
	}

	@Parameters("username")
	@Test
	public void setData(@Optional("default_val")String username)
	{	
		WebDriver driver;
		Long id = Thread.currentThread().getId();
		System.out.println("Thread id:  " + id);

		System.out.println("First Test you have provided username as::"+username);
		driver = new FirefoxDriver();
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

	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod() {
		return new Object[][] { 
			{ "data one" }, 
			{ "data two" } 
		};
	}

	@Test(dataProvider = "data-provider")
	public void testMethod(String data) {
		System.out.println("Data is: " + data);
	}

}
