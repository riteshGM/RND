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
import org.testng.annotations.Test;


public class DataProviderRND3 {		
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
	
		@Test(dataProvider="getData")
		public void setData(String username)
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
		

		
		@DataProvider(parallel=true)
		public Object[][] getData()
		{
			
			System.out.println("DataProvider's getData() Started");
			
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		Object[][] data = new Object[5][1];

		// 1st row
		data[0][0] ="sampleuser1";
		//data[0][1] = "abcdef";

		// 2nd row
		data[1][0] ="testuser2";
		//data[1][1] = "zxcvb";
		
		// 3rd row
		data[2][0] ="guestuser3";
		//data[2][1] = "pass123";
		
		//4th row
		data[3][0] ="guestuser3";
		//5th row
		data[4][0] ="guestuser3";
		System.out.println("DataProvider's getData() Ended");
		System.out.println("Data value: "+data);
		return data;
		}
	
}
