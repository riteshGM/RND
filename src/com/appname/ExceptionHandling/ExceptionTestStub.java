package com.appname.ExceptionHandling;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ExceptionTestStub {
	WebDriver driver;
	@Test
	public void testMethod(){
		
		
		try {
			driver = new FirefoxDriver();
			driver.get("www.google.co.in");
			assertTrue(false);
			
			
		}catch (Exception e){
		
			System.out.println("Exception Occurred"+e.getMessage());
		}
		finally{
			System.out.println("Finally Block Executed");
			try{
			driver.close();
			System.out.println("Finally Block Executed after driver close()");
			}catch(Exception e2){
				System.out.println("Exception in Finally"+e2);
			}
			
		}
	}

}
