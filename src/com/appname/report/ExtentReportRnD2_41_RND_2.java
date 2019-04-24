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



public class ExtentReportRnD2_41_RND_2 extends ExtentReportStruct{
	ExtentReports extentReport;

	public static final Logger log = Logger.getLogger(ExtentReportRnD2_41_RND_2.class.getName());
	
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
			
			ExtentTest parent =extentReport.startTest("Action 1");
			ExtentTest child =extentReport.startTest("Step 1");
			
			//test.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			

			child.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a target='_blank' href='C:\\005_VerifyStore_getStoreNameFromSearchResultsObject_gettext_14_05_2018_21_58_40_148.png' >Click Here</a></td>");
			child.log(LogStatus.FAIL,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			System.out.println("Child Status"+child.getRunStatus());
			/* This is how to declare HashMap */
		     // HashMap<Integer, LogStatus> subStepStatuses = new HashMap<Integer, LogStatus>();
		      List <LogStatus> subStepStatuses=new ArrayList<LogStatus>();
		      subStepStatuses.add(child.getRunStatus());
			
			parent.appendChild(child);
			
			System.out.println("Child Status after append"+child.getRunStatus());

			ExtentTest child2 =extentReport.startTest("Step 2");
			
			//test.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			child2.log(LogStatus.PASS,"someElement", "data_key:value"+"<td>Action_value:Completed</td>"+"<td><a>Click Here</a></td>");
			
			System.out.println("Child Status"+child2.getRunStatus());
			
			subStepStatuses.add(child2.getRunStatus());
			parent.appendChild(child2);
			
			System.out.println(subStepStatuses);
			Boolean passFlag=true;
			
			   /* Display content using Iterator*/
			//Iterator<LogStatus> iterator = subStepStatuses.iterator();
		   
			for (LogStatus temp : subStepStatuses) {
				System.out.println(temp);
				if(temp.equals(LogStatus.FAIL)){
					passFlag=false;
				}
			}
		        	
		        	 
		       
		      subStepStatuses.clear();
		      System.out.println("After Flush"+subStepStatuses);
			
			System.out.println("Parent Status"+parent.getRunStatus());
			boolean noPrimitiveFlag = true;
			if(parent.getRunStatus().equals(LogStatus.UNKNOWN) && noPrimitiveFlag){
				if(passFlag){
				parent.log(LogStatus.PASS,"-", "-"+"<td>SubStep Completed Successfully</td>"+"<td><a>Click Here</a></td>");
				System.out.println("Inside If when Unknown");
				test.appendChild(parent);
				}else{
					parent.log(LogStatus.FAIL,"-", "-"+"<td>SubStep Completed Successfully</td>"+"<td><a>Click Here</a></td>");
					System.out.println("Inside If when Unknown");
					test.appendChild(parent);	
				}
				
			}else{
				System.out.println("Inside Else Block");
				parent.appendChild(parent);
			}
			
			
			
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