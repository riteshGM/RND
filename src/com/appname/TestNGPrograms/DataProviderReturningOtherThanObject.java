package com.appname.TestNGPrograms;

import java.util.ArrayList;

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


public class DataProviderReturningOtherThanObject {		
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
	
		@DataProvider(name = "data-provider")
	    public Object[][] dataProviderMethod() {
			
			ArrayList <String> array = new ArrayList<String>();
			array.add("Ritesh");
			array.add("Ritesh1");
			array.add("Ritesh2");
			array.add("Ritesh3");
			Object [][] testData = new Object [array.size()][];
			for (int i=0 ; i<array.size();i++){
				testData [i][0]=array.get(i);
			}
			
			return testData;
			
			
	        
	    }
		
	 @Test(dataProvider = "data-provider")
	    public void testMethod(ArrayList<String> value) {
	        System.out.println("Data is: " + value);
	    }
	
}
