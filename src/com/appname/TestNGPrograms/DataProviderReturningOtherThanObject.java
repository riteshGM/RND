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
			System.out.println("Total Size is "+array.size());
			Object [] testData = new Object [array.size()];
		/*	for (int i=0 ; i<array.size();i++){
				testData [0][i]=array.get(i);
			}*/
			
			System.out.println(array.get(0));
			System.out.println(array.get(1));
			System.out.println(array.get(2));
			System.out.println(array.get(3));
			System.out.println(testData.length);
			
			testData[0]= array.get(0);
			testData[1]= array.get(1);
			testData[2]= array.get(2);
			testData[3]= array.get(3);
			
			Object [][] finalObj = new Object [][]{testData};
			
			
			return finalObj;
			
			
	        
	    }
		
	 @Test(dataProvider = "data-provider")
	    public void testMethod(Object [] value) {
		 
		 String text=(String) value[0];
	        System.out.println("Data is: " + value);
	    }
	
}
