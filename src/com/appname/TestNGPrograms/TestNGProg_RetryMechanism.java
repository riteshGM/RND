package com.appname.TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGProg_RetryMechanism {
	
	 @Test(retryAnalyzer = com.appname.TestNGPrograms.RetryAnalyzer.class)
	 public void Test1()
	 {
		 
		 System.out.println("Test Started Test1");
	 Assert.assertEquals(false, true);
	 System.out.println("Test Ended Test1");
	 }

}
