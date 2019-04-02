package com.appname.TestNGPrograms;

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


public class DataProviderRND2 {		
		//This test method declares that its data should be supplied by the Data Provider
		// "getdata" is the function name which is passing the data
	       // Number of columns should match the number of input parameters
		
		
	
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
		public void setData(String username, String password)
		{
			System.out.println("you have provided username as::"+username);
			//System.out.println("you have provided password as::"+password);
		}

		@DataProvider
		public Object[][] getData()
		{
			
			System.out.println("DataProvider's getData() Started");
			
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		Object[][] data = new Object[3][2];

		// 1st row
		data[0][0] ="sampleuser1";
		//data[0][1] = "abcdef";

		// 2nd row
		data[1][0] ="testuser2";
		//data[1][1] = "zxcvb";
		
		// 3rd row
		data[2][0] ="guestuser3";
		//data[2][1] = "pass123";
		System.out.println("DataProvider's getData() Ended");
		System.out.println("Data value: "+data);
		return data;
		}
	
}
