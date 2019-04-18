package com.appname.TestNGPrograms;

import org.testng.annotations.Test;

public class IgnoreTest {
	
	   @Test(enabled = false, groups = "smoke")
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	   }

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	     
	   }

}
