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



public class ExtentReportRnD2_41_RND_3 extends ExtentReportStruct{
	ExtentReports extentReport;

	public static final Logger log = Logger.getLogger(ExtentReportRnD2_41_RND_3.class.getName());
	
	/**
	 * 
	 * @author Ritesh Mansukhani 
	 * @Description Used for Unknown Status fix RND of extent
	 *         Report i.e. issue: when any of step dont have any primitive
	 *         action and has only subteps within,
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
			
			ExtentTest parent =extentReport.startTest("Action 2");
			parent.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			
			ExtentTest child =extentReport.startTest("Action 2 - Step 1");
			
			
			
			child.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			child.log(LogStatus.FAIL,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			System.out.println("Child Status"+child.getRunStatus());
			/* This is how to declare HashMap */
		     // HashMap<Integer, LogStatus> subStepStatuses = new HashMap<Integer, LogStatus>();
		      List <LogStatus> subStepStatuses=new ArrayList<LogStatus>();
		      subStepStatuses.add(child.getRunStatus());
			
			parent.appendChild(child);
			
			System.out.println("Child Status after append"+child.getRunStatus());

			ExtentTest child2 =extentReport.startTest("Action 1");
			
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
			

			test.appendChild(parent);	
			
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