package com.appname.report;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportStruct {

	ExtentReports extentReport;
	//public ExtentTest extentTest;

	//Call this in @BeforeTest
	public void reportSetUp() {
		String dateTime = getCurrentDateTime();
		String configPath = System.getProperty("user.dir")+"\\src\\resources\\extentConfig.xml";
		
		extentReport = new ExtentReports(System.getProperty("user.dir")+"\\ExtentTestReport\\AutomationTestReport_"+dateTime+".html", true);
		extentReport.addSystemInfo("Enviroment", "SIT")
		.addSystemInfo("Application Name", "Zeus");
		extentReport.loadConfig(new File(configPath));
		System.out.println("Extent report Obj "+extentReport);
	}

	protected static String getCurrentDateTime() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formator = new SimpleDateFormat("dd_MM_YY_hh_mm_SS");
		calendar = Calendar.getInstance();
		formator = new SimpleDateFormat("dd_MM_YY_hh_mm_SS");
		return formator.format(calendar.getTime());

	}

	//Call this in @BeforeMethod
	public ExtentTest getExtentTestObj (String methodName, String stepDescription, String path){
		//return extentReport.startTest(methodName);
		return extentReport.startTest(methodName, stepDescription+"&nbsp&nbsp&nbsp&nbsp<span title ="+"\""+"Test Case ScreenShots"+"\""+"class ="+"\""+"weight-light label blue lighten-1 text-white"+"\""+"><a class="+"\""+"text-white"+"\""+" href='" + path + "'>ScreenShots</a></span>");
		
	}

	
	public ExtentTest getExtentTestObj (String methodName){
		return extentReport.startTest(methodName);
	}
	
	//Call this in @AfterMethod
	//public void mthodReportClosure(ITestResult result){
	public void mthodReportClosure(ExtentTest extentTest){
		//getTestResult(result);
		extentReport.endTest(extentTest);
		extentReport.flush();
		extentTest = null;


	}

	//Call this in @AfterSuite
	public void suiteTestClosure(){
		System.out.println("Extent report Obj in suiteTestClosure() "+extentReport);
		extentReport.close();
	}
/*
	private void getTestResult(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test passed.");
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Test failed: "+result.getThrowable());
			//TODO Need to Check for Screen Capture Code on Failure in Below Line of Code
			//String errorSrcPath = getScreenShot(result.getName());
			//extentTest.log(LogStatus.INFO, "Failure Snapshot: "+extentTest.addScreenCapture(errorSrcPath));
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test skipped."+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.STARTED) {
			extentTest.log(LogStatus.INFO, "Test Started");
		}
		else {
			extentTest.log(LogStatus.UNKNOWN, "Status Unknown");
		}
		//TODO Need to check for more statuses

	}*/
}
