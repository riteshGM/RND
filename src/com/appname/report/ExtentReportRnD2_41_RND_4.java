package com.appname.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentTestInterruptedException;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReportRnD2_41_RND_4 extends ExtentReportStruct{
	ExtentReports extentReport;

	public static final Logger log = Logger.getLogger(ExtentReportRnD2_41_RND_4.class.getName());
	
	/**
	 * 
	 * @author Ritesh Mansukhani 
	 * @Description User for Report issue
	 *         Report i.e. issue: where substeps don't come in sequence against primitive steps
	 * 
	 *
	 */
	@Test(priority = 0)
	public void testCase02_VerifyUserIsAbleToSearchStore() {
		
		try {
			//reportSetUp();
			String dateTime = getCurrentDateTime();
			String configPath = System.getProperty("user.dir")+"\\src\\resources\\extentConfig.xml";
			
			extentReport = new ExtentReports(System.getProperty("user.dir")+"\\ExtentTestReport\\AutomationTestReport_"+dateTime+".html", true);
			extentReport.addSystemInfo("Enviroment", "SIT")
			.addSystemInfo("Application Name", "Zeus");
			extentReport.loadConfig(new File(configPath));
			System.out.println("Extent report Obj "+extentReport);
			
			//Start Test
			ExtentTest test =extentReport.startTest("Test.Case01","Test Case Logical Name");
			
			ExtentTest parent =extentReport.startTest("Action 1");
			parent.log(LogStatus.PASS,"Step 1", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parent.log(LogStatus.PASS,"Step 2", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parent.log(LogStatus.PASS,"Step 3", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parent.log(LogStatus.PASS,"Step 4", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parent.log(LogStatus.PASS,"Step 5", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			test.appendChild(parent);	
			
			ExtentTest child =extentReport.startTest("Action 1 - SubStep 1");
			
			
			
			child.log(LogStatus.PASS,"Step 6", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			child.log(LogStatus.PASS,"Step 7", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			System.out.println("Child Status"+child.getRunStatus());
			/* This is how to declare HashMap */
		     // HashMap<Integer, LogStatus> subStepStatuses = new HashMap<Integer, LogStatus>();
		      List <LogStatus> subStepStatuses=new ArrayList<LogStatus>();
		      subStepStatuses.add(child.getRunStatus());
			
			parent.appendChild(child);
			
			/*ExtentTest parentNewBorn =extentReport.startTest("Action 1");
			parentNewBorn.log(LogStatus.PASS,"Step 8", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parentNewBorn.log(LogStatus.FAIL,"Step 9", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parentNewBorn.log(LogStatus.PASS,"Step 10", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parentNewBorn.log(LogStatus.PASS,"Step 11", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			test.appendChild(parentNewBorn);*/
			//parent=null;
			parent=extentReport.startTest("Action 1--Continued");
			parent.log(LogStatus.PASS,"Step 8", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parent.log(LogStatus.FAIL,"Step 9", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parent.log(LogStatus.PASS,"Step 10", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parent.log(LogStatus.PASS,"Step 11", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			test.appendChild(parent);
			
			 child =extentReport.startTest("Action 1 - SubStep 2");
			child.log(LogStatus.PASS,"Step 12", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			child.log(LogStatus.PASS,"Step 13", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			parent.appendChild(child);
			
			ExtentTest childNewBornInner =extentReport.startTest("Action 1 - Inner SubStep of SubStep 2");
			childNewBornInner.log(LogStatus.PASS,"Step 14", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			childNewBornInner.log(LogStatus.PASS,"Step 15", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child.appendChild(childNewBornInner);
/*
			ExtentTest childNewBornContinued =extentReport.startTest("Action 1 - SubStep 2");
			childNewBornContinued.log(LogStatus.PASS,"Step 16", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			childNewBornContinued.log(LogStatus.PASS,"Step 17", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			parentNewBorn.appendChild(childNewBornContinued);*/
			
			
			ExtentTest parentNewBorn2 =extentReport.startTest("Action 1");
			parentNewBorn2.log(LogStatus.PASS,"Step 18", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parentNewBorn2.log(LogStatus.FAIL,"Step 19", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parentNewBorn2.log(LogStatus.PASS,"Step 20", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			parentNewBorn2.log(LogStatus.PASS,"Step 21", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			test.appendChild(parentNewBorn2);
			ExtentTest child2 =extentReport.startTest("Action 2");
			
			//test.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child2.log(LogStatus.WARNING,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			
			System.out.println("Child Status"+child2.getRunStatus());
			
			subStepStatuses.add(child2.getRunStatus());
			test.appendChild(child2);
			
			System.out.println(subStepStatuses);
			
			ExtentTest parent3 =extentReport.startTest("Action 3");
			parent3.log(LogStatus.WARNING,"Step Name", "-"+"<td>Warning : Action Could not be Performed Due to Failure in Previous Action </td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			
			ExtentTest parent4 =extentReport.startTest("Action 4");
			parent4.log(LogStatus.WARNING,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			
			ExtentTest parent5 =extentReport.startTest("Action 5");
			parent5.log(LogStatus.WARNING,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			

			//test.appendChild(parent);	
			
			test.appendChild(parent3);	
			
			test.appendChild(parent4);	
			
			test.appendChild(parent5);	
			
			
			//mthodReportClosure(test);
			//System.out.println("Status"+test.getRunStatus());
			//test.getTest().setStatus(LogStatus.FAIL);
			extentReport.endTest(test);
			System.out.println("Test Case Status"+test.getRunStatus());
			
			
			//flush is very important otherwise it will always consider that your report was not ended. and gives you exception
			extentReport.flush();
			test = null;
			
			//suiteTestClosure();
			System.out.println("Extent report Obj in suiteTestClosure() "+extentReport);
			try{
				extentReport.close();
					
			}catch(ExtentTestInterruptedException e){
				System.out.println("Ritesh");
			}
			
		} catch (ExtentTestInterruptedException e) {

			log.info("Exception Occurred During Test Case Execution");
			e.printStackTrace();
		}
	}
}