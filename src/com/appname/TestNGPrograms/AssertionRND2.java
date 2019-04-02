package com.appname.TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.net.PercentEscaper;

public class AssertionRND2 {
	/**
	 * Soft Assert Can be Catched as in "AssertionError"
	 * But if same obejct is being used throughout all the asserts, it will keep all the failure messages each time assertall is done
	 * If you want Message to be refreshed for each soft assert, better create new softAssert object for each assert you want to perform.
	 * Below program has above functionality implemented
	 */
	@Test
	public static void testAssertion(){
		try{
		String actual = "ritesh";
		String expected = "ritesh1";
		
		System.out.println(performSoftAssert(expected,actual));
		System.out.println("After Soft Assert Execution Still Ocntinues Even if that Assert is not used and assertAll is performed");
		String actual1 = "ritesh";
		String expected1 = "ritesh";
		System.out.println(performSoftAssert(expected1,actual1));
		
		System.out.println("Msg 1");
		
		//softAssert.assertEquals("Mansu", "Mansu1");
		System.out.println(performSoftAssert("Mansu", "Mansu1"));
		System.out.println("Msg 2");

		System.out.println("Msg 3");
		System.out.println("Afert Assertion Msg 1");
		System.out.println(performSoftAssert("Mansu", "Mansu"));
		System.out.println("Afert Assertion Msg 2");
		}catch(AssertionError errorMsg){
			System.out.println("Inside Outer Catch Block");
			errorMsg.getMessage();
			System.out.println("Failure Message"+errorMsg.getLocalizedMessage());
		}
	}

	public static boolean performSoftAssert(String expected,String actual){
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
