package com.appname.seleniumprograms;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionRND {
	
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method Called");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method Called");
	}

	@Test()
	public void setData()
	{
		try{
		String retrivedValue = "Ritesh";
		String dataValue = "Ritesh1";
		//AssertJUnit.assertEquals(retrivedValue, dataValue);
		Assert.assertTrue(false);
		System.out.println("Ritesh After Assertion");
		}catch(AssertionError  e){
			System.out.println(e.getMessage());
			System.out.println("Exception Occured");
			AssertJUnit.assertTrue(false);
		}
	}

}
