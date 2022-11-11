package com.appname.report;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class ExtentReportRnD2_41_2 extends ExtentReportStruct{

	public static final Logger log = Logger.getLogger(ExtentReportRnD2_41_2.class.getName());
	
	
	/**
	 * 
	 * @author Ritesh Mansukhani
	 * Below Method verifies Search Store Functionality
	 * 
	 *
	 */
	@Test(priority = 0)
	public void testCase02_VerifyUserIsAbleToSearchStore() {
		
		try {
			
			reportSetUp();
			ExtentTest test = getExtentTestObj("testCase02_VerifyUserIsAbleToSearchStore","test_Case_Details_very long text!@!@!@()()hjusYIDIAYIUDSA DSA DSAD SA DSA DHJSAADUISAHIDYSADSADSA DSA D SA DSA DSA DSADHSAJYDUSAYDIYSAIDYSAIYDISAYDIYSAIUDYSAIDYSAUDYSAIYDIUSAYDUISAYDUIYSADIUYSAIUDYSAIUDYSAUIDYIUSAYDSADIUSAYDIUSA()()()      1jddsdjshdjshdjsdyusydsbn dsds:::::dsdshdsjhdjs_____jdshdjshdj","ScreenPath");
			
			ExtentTest child = getExtentTestObj("Child");
			
			child.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Attempted - Element Not Found </td>"+"<td><a>Click Here</a></td>");
			child.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			
			ExtentTest child1 = getExtentTestObj("Child1");
			child1.log(LogStatus.PASS,"someElement", "Action Completed in child 1"+"<td>Click Here</td>");
			child1.log(LogStatus.PASS,"someElement", "Action Completed in child 1"+"<td>Click Here</td>");
			child1.log(LogStatus.PASS,"someElement", "Action Completed in child 1"+"<td>Click Here</td>");
			child1.log(LogStatus.PASS,"someElement", "Action Completed in child 1"+"<td>Click Here</td>");
			
			ExtentTest child2 = getExtentTestObj("Child2");
			child2.log(LogStatus.PASS,"someElement", "Action Completed in child 2"+"<td>Click Here</td>");
			child2.log(LogStatus.PASS,"someElement", "Action Completed in child 2"+"<td>Click Here</td>");
			child2.log(LogStatus.PASS,"someElement", "Action Completed in child 2"+"<td>Click Here</td>");
			child2.log(LogStatus.PASS,"someElement", "Action Completed in child 2"+"<td>Click Here</td>");

			ExtentTest child3 = getExtentTestObj("Child3");
			child3.log(LogStatus.PASS,"someElement", "Action Completed in child 3"+"<td>Click Here</td>");
			child3.log(LogStatus.PASS,"someElement", "Action Completed in child 3"+"<td>Click Here</td>");
			child3.log(LogStatus.PASS,"someElement", "Action Completed in child 3"+"<td>Click Here</td>");
			child3.log(LogStatus.PASS,"someElement", "Action Completed in child 3"+"<td>Click Here</td>");
			child3.log(LogStatus.PASS,"someElement", "Action Completed in child 3"+"<td>Click Here</td>");
			
			ExtentTest child4 = getExtentTestObj("Child4");
			child4.log(LogStatus.PASS,"someElement", "Action Completed in child 4");
			child4.log(LogStatus.PASS,"someElement", "Action Completed in child 4");
			child4.log(LogStatus.PASS,"someElement", "Action Completed in child 4");
			child4.log(LogStatus.PASS,"someElement", "Action Completed in child 4");
			child4.log(LogStatus.PASS,"someElement", "Action Completed in child 4");
			
			ExtentTest child5 = getExtentTestObj("child5");
			child5.log(LogStatus.PASS,"someElement", "Action Completed in child 5");
			child5.log(LogStatus.PASS,"someElement", "Action Completed in child 5");
			child5.log(LogStatus.PASS,"someElement", "Action Completed in child 5");
			child5.log(LogStatus.PASS,"someElement", "Action Completed in child 5");
			child5.log(LogStatus.PASS,"someElement", "Action Completed in child 5");
			
			
			child.appendChild(child1);
			child2.appendChild(child4);
			child2.appendChild(child5);
			child.appendChild(child2);
			test.appendChild(child);
			test.appendChild(child3);
			
			//extentReport.setReportUsesManualConfiguration(true);
			//CreateNewAccountUIActions.clickOnSignInLink(driver);
			//getScreenShotOnProgress(driver, methodName);
			
			
			
			/*
			ExtentTest childTest11 = extentTest.createNode("Base Child#1");
			ExtentTest childTest = extentTest.createNode("Base Child#2");
			String [][] data = {
				    { "Element_Name", "Action", "Description" },
				    { "Content.1.1", "Content.2.1", "Successfull with data1 [1234561]" }
				};
			String [][] data1 = {
				    { "Content.1.1", "Content.2.1", "Successfull with data1 [1234561]" }
				};	
			
			childTest11.log(Status.PASS, MarkupHelper.createTable(data));
			
			childTest.log(Status.PASS, MarkupHelper.createTable(data));
			/*childTest.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest.log(Status.PASS, MarkupHelper.createTable(data1));*/
			
			
			//ExtentTest childTest2 = childTest.createNode("Level 1 Child#1");
			
			//childTest2.log(Status.PASS, MarkupHelper.createTable(data));
			/*childTest2.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest2.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest2.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest2.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest2.log(Status.FAIL, MarkupHelper.createTable(data1));*/
			
			
			//ExtentTest childTest3 = childTest2.createNode("Level 2 Child#1");
			
			//childTest3.log(Status.PASS, MarkupHelper.createTable(data));
			//childTest3.log(Status.FAIL, MarkupHelper.createTable(data1));
			/*childTest3.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest3.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest3.log(Status.FAIL, MarkupHelper.createTable(data1));
			childTest3.log(Status.PASS, MarkupHelper.createTable(data1));*/
			

			
			/*ExtentTest childTest4 = childTest.createNode("Level 1 Child#2");
			childTest4.log(Status.PASS, MarkupHelper.createTable(data));
			/*childTest4.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest4.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest4.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest4.log(Status.FAIL, MarkupHelper.createTable(data1));
			childTest4.log(Status.FAIL, MarkupHelper.createTable(data1));*/
			
			//ExtentTest childTest5 = childTest.createNode("Level 1 Child#3"); 
			//childTest5.log(Status.PASS, MarkupHelper.createTable(data));
			/*childTest5.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest5.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest5.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest5.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest5.log(Status.PASS, MarkupHelper.createTable(data1));*/
			
			/*ExtentTest childTest6 = childTest.createNode("Level 2 Child#2");
			
			childTest6.log(Status.PASS, MarkupHelper.createTable(data));
			childTest6.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest6.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest6.log(Status.PASS, MarkupHelper.createTable(data1));
			childTest6.log(Status.FAIL, MarkupHelper.createTable(data1));
			childTest6.log(Status.INFO, MarkupHelper.createTable(data1));*/ 
			
			/*SignInUIActions.enterEmailIDAndPasswordToSignInAndSubmit(driver);

			SignInUIActions.clickWomenCategory(driver);

			SignInUIActions.clickDiscoverStores(driver);
			getScreenShotOnProgress(driver, methodName);

			SignInUIActions.enterYourLocationAndClickSearch(driver);
			getScreenShotOnProgress(driver, methodName);

			String actualStoreNameString = SignInPageObjects.getStoreNameFromSearchResultsObject(driver).getText();

			String expectedStoreNameString = "Pembroke Pines";

			Assert.assertEquals(actualStoreNameString, expectedStoreNameString);

			log.info("Store Name Verified In Search Results as:" + actualStoreNameString);*/
			mthodReportClosure(test);
			suiteTestClosure();
			
		
		} catch (Exception e) {

			log.info("Exception Occurred During Test Case Execution");
			e.printStackTrace();
		}
	}
}