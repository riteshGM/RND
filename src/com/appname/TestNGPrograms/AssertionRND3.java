package com.appname.TestNGPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionRND3 {
	/**
	 * Soft Assert Can be Catched as in "AssertionError"
	 * But if same obejct is being used throughout all the asserts, it will keep all the failure messages each time assertall is done
	 * If you want Message to be refreshed for each soft assert, better create new softAssert object for each assert you want to perform.
	 * 
	 * Identified the logic to be implemented in framework Man !!!
	 * @Date 11-06-2018
	 */
	@Test
	public static void testAssertion(){
		
		List <SoftAssert> listAssert = new ArrayList<SoftAssert>();

		
		////////////////////
		performSoftAssert("ritesh","riteshian", listAssert);
		//////////////////////////////////
		
		
		performSoftAssert("Maria","Marian", listAssert);
		
		/////////////////////////////////////
		
		performSoftAssert("Shakira","Shakira", listAssert);
		performSoftAssert("Thomas","Thmisa", listAssert);
		performSoftAssert("Maria","Marian", listAssert);
		performSoftAssert("Hijbul","Hijbula", listAssert);
		performSoftAssert("Mian","AAyn", listAssert);
		
		///////////////////////////////////////////////////////////////////
			performFinalAssert(listAssert);
		////////////////////////////////////////////////////////////////
	}
	
	

	public static boolean performSoftAssert(String expected,String actual, List <SoftAssert> listAssert){
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(expected,actual);
		
		try{
			softAssert.assertAll();
			
			
		}catch(AssertionError errorMsg){
			System.out.println("Inside Outer Catch Block 1");
			errorMsg.getMessage();
			listAssert.add(softAssert);
			System.out.println("Failure Message"+errorMsg.getLocalizedMessage());
			return true;
		}
		return false;
	}
	
	public static void performFinalAssert(List <SoftAssert> listAssert){
		System.out.println("Total Failures in Test Case "+listAssert.size());
		
		//Iterator<SoftAssert> iterator =  listAssert.iterator();
		SoftAssert mainAssert = new SoftAssert();
		String failureInfoList = "";
		System.out.println("Inside For Loop");
		for (SoftAssert soft : listAssert){
			try{
				soft.assertAll();
			}catch(AssertionError aerror){
				failureInfoList =failureInfoList+aerror.getMessage()+"\n";
				System.out.println("Assertion Error Recorded Continue the Loop");
			}
		}
		System.out.println("For Loop Ended");
		mainAssert.fail(failureInfoList);
		mainAssert.assertAll();
	}
	
}

