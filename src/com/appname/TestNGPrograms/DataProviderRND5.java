package com.appname.TestNGPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataProviderRND5 {		
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
		public void setData(HashMap<Integer, List<String>> list)
		{	
			System.out.println(list);
		}
		

		@DataProvider()
		public Object[][] getData(ITestContext context)
		{
			String testParam = context.getCurrentXmlTest().getParameter("testBrowser");
			System.out.println("DataProvider's getData() Started");
			System.out.println(testParam);
		
			List list = Arrays.asList("Ritesh","Mansukhani");
			Map dataMap = new HashMap<Integer, List<String>>();
			dataMap.put(1, list);
			
			Map dataMap1 = new HashMap<Integer, List<String>>();
			dataMap1.put(2, list);
			
		return new Object [][]{
			{dataMap},
			{dataMap},
			{dataMap1}
			};
		}
	
}
