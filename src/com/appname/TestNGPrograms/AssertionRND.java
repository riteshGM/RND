package com.appname.TestNGPrograms;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionRND {
	/**
	 * Soft Assert Can be Catched as in "AssertionError"
	 * But if same obejct is being used throughout all the asserts, it will keep all the failure messages each time assertall is done
	 * If you want Message to be refreshed for each soft assert, better create new softAssert object for each assert you want to perform.
	 */
	@Test
	public static void testAssertion(){
		try{
		String actual = "ritesh";
		String expected = "ritesh1";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expected,actual);
		
		try{
			softAssert.assertAll();
		}catch(AssertionError errorMsg){
			System.out.println("Inside Outer Catch Block 1");
			errorMsg.getMessage();
			System.out.println("Failure Message"+errorMsg.getLocalizedMessage());
		}
		
		
		System.out.println("After Soft Assert Execution Still Ocntinues Even if that Assert is not used and assertAll is performed");
		String actual1 = "ritesh";
		String expected1 = "ritesh";
		//SoftAssert softAssert1 = new SoftAssert();
		try{
			softAssert.assertEquals(expected1,actual1);
		}catch(AssertionError errorMsg){
			System.out.println("Inside Outer Catch Block");
			errorMsg.getMessage();
			System.out.println("Failure Message"+errorMsg.getLocalizedMessage());
		}
		
		System.out.println("Msg 1");
		
		softAssert.assertEquals("Mansu", "Mansu1");
		
		System.out.println("Msg 2");
		
		try{
		softAssert.assertAll();
		}catch (AssertionError error){
			System.out.println("Catch Started");
			System.out.println(error.getMessage());
			System.out.println("Catch Ended");
		}
		
		AssertJUnit.assertEquals("Maria", "Sharapowa");
		
		System.out.println("Msg 3");
		System.out.println("Afert Assertion Msg 1");
		softAssert.assertEquals("Mansu", "Mansu1");
		softAssert.assertAll();
		System.out.println("Afert Assertion Msg 2");
		}catch(AssertionError errorMsg){
			System.out.println("Inside Outer Catch Block");
			errorMsg.getMessage();
			System.out.println("Failure Message"+errorMsg.getLocalizedMessage());
			AssertJUnit.assertEquals("Karishma", "Kshama");
		}
	}

	private boolean performSoftAssert(String expected,String actual){
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(expected,actual);
		try{
			softAssert.assertAll();
			return true;
		}catch(AssertionError errorMsg){
			System.out.println("Inside Outer Catch Block 1");
			errorMsg.getMessage();
			System.out.println("Failure Message"+errorMsg.getLocalizedMessage());
			return false;
		}
		
	}
}
