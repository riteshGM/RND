package com.appname.TestNGPrograms;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersSample {

	

	   
		@BeforeGroups("functional")
		@Parameters("ritesh")
		public void groupMethod(String ritesh) {
			System.out.println("Inside beforeGroupMethod"+ritesh);
		}
	
		@AfterGroups("functional")
		public void afterGroupMethod() {
			System.out.println("Inside afterGroupMethod");
		}
		
		@BeforeMethod
		@Parameters("ritesh")
		   public void beforeMethod(String kuchBhi) {
		      System.out.println("Inside @BeforeMethod() and @BeforeMethod() kuchBhi"+kuchBhi);
		   }
	
	
	
	   @Test(groups = { "functional", "checkintest" })
	   @Parameters("ritesh")
	   public void testPrintMessage(String kuchBhi) {
	      System.out.println("Inside functional() and checkintest() kuchBhi"+kuchBhi);
	   }

	   @Parameters("ritesh")
	   @Test(groups = "smoke" )
	   
	   public void testSalutationMessage(String ritesha) {
	      System.out.println("Inside smoke()"+ritesha);
	   }
	   
	   @Parameters("ritesh")
	   @Test(groups = { "regression" })
	   
	   public void testSalutationMessage2(String ritesha) {
	      System.out.println("Inside regression()"+ritesha);
	   }

	   @Parameters("ritesh")
	   @Test(groups = { "functional" })
	   
	   public void testingExitMessage(String ritesha) {
	      System.out.println("Inside functional()"+ritesha);
	   }  
	
}
