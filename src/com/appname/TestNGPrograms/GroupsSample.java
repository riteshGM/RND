package com.appname.TestNGPrograms;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsSample {

	

	   
		@BeforeGroups("functional")
		public void groupMethod() {
			System.out.println("Inside beforeGroupMethod");
		}
	
		@AfterGroups("functional")
		public void afterGroupMethod() {
			System.out.println("Inside afterGroupMethod");
		}
		
	   @Test(groups = { "functional", "checkintest" })
	   
	   public void testPrintMessage() {
	      System.out.println("Inside functional() and checkintest()");
	   }

	   @Test(groups = "smoke" )
	   
	   public void testSalutationMessage() {
	      System.out.println("Inside smoke()");
	   }
	   
	   @Test(groups = { "regression" })
	   
	   public void testSalutationMessage2() {
	      System.out.println("Inside regression()");
	   }

	   @Test(groups = { "functional" })
	   
	   public void testingExitMessage() {
	      System.out.println("Inside functional()");
	   }  
	
}
