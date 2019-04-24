package com.appname.report;

import java.io.File;
import org.apache.log4j.Logger;
import com.relevantcodes.extentreports.ExtentReports;

public class ITestQReport {

	private ExtentReports iTestQReportObj;
	private String testRunScreensLocation;
	public static final Logger log = Logger.getLogger(ITestQReport.class.getName());

	public ITestQReport(String dateTime, String appName2, String envName2) {
		reportSetUp(dateTime, appName2, envName2);
		screensDirectorySetup(dateTime, appName2, envName2);
	}

	/**
	 * 
	 * @param dateTime
	 * @param appName2
	 * @param envName2
	 * @param includedGroups
	 * @return Boolean result as true or false
	 */
	private boolean screensDirectorySetup(String dateTime, String appName2, String envName2) {
		//String splittedGroups[]=includedGroups.split("\\|");
		/*String printableGroups="";
		for (String temp : splittedGroups){
			printableGroups=printableGroups+"_"+temp;
		} */
		//testRunScreensLocation = System.getProperty("user.dir")+"/src/screenshots"+"/test_run_"+appName2+"_"+envName2+printableGroups+"_"+dateTime;
		String userLocation="";
	
		if(null!=userLocation){
			log.debug("Inside If screensDirectorySetup() SCREENSHOTS_DIRECTORY is Defined as "+userLocation);
			testRunScreensLocation = System.getProperty("user.dir")+"/"+userLocation+"/"+appName2+"_"+envName2+"_"+dateTime;
		}else{
			log.debug("Inside If screensDirectorySetup() SCREENSHOTS_DIRECTORY is not Defined Continued Using Default ScreenShots Location");
			testRunScreensLocation = System.getProperty("user.dir")+"/screenshots/"+appName2+"_"+envName2+"_"+dateTime;
		}
		
		return new File(testRunScreensLocation).mkdirs();
		
		
	}
	
	public String getTestRunScreensLocation(){
		return testRunScreensLocation;
	}

	public ExtentReports getReportObj() {
		return this.iTestQReportObj;
	}

	/**
	 * Method Initializes ExtentReport's ExtendTest object
	 * 
	 * @author Ritesh Mansukhani
	 * @param methodName
	 * 
	 */
	
	public ITestQTest startReportTest(String methodName,String testCaseScreenLocation) {
		return new ITestQTest(this, methodName,testCaseScreenLocation);
	}
	
	public ITestQTest startReportTestAppended(String stepName, ITestQTest iTestQTest) {
		return iTestQTest.startReportTestAppended(stepName,this);
	}
	
	/**
	 * 
	 * @param methodName
	 * @param testCaseDescription
	 * @param screenShotsLocation
	 * @return ITestQTest Object
	 */
	public ITestQTest startReportTest(String methodName, String testCaseDescription, String screenShotsLocation) {
		return new ITestQTest(this, methodName, testCaseDescription, screenShotsLocation);
	}

	
	
	/**
	 * Method Performs Clean-up activity for ExtendTest Object of ExtendReport
	 * and Flushes ExtentReport Object before starting next @test method
	 * 
	 * @author Ritesh Mansukhani
	 *
	 * 
	 **/

	public void endReportTest(ITestQTest iTestQTest) {
		iTestQTest.endTest(this);
		this.iTestQReportObj.flush();
	}

	/**
	 * Method Initializes iTestQReport ExtendReport object and its Properties
	 * 
	 * @author Ritesh Mansukhani
	 * @param dateTime
	 * @param appName2
	 * @param envName2
	 * @return ExtentReports Instance
	 * 
	 * 
	 */
	private void reportSetUp(String dateTime, String appName2, String envName2) {
		if (this.iTestQReportObj == null) {
			log.debug("reportSetUp() iTestQReportObj is Instantiating: ");
			String configPath = System.getProperty("user.dir") + "\\src\\resources\\extentConfig.xml";
			this.iTestQReportObj = new ExtentReports(
					System.getProperty("user.dir") + "\\ExtentTestReport\\AutomationTestReport_" + dateTime + ".html",
					true);
			this.iTestQReportObj.addSystemInfo("Enviroment", envName2).addSystemInfo("Application Name", appName2);

			this.iTestQReportObj.loadConfig(new File(configPath));
		} else {
			log.debug("reportSetUp() iTestQReportObj is already Instantiated: " + this.iTestQReportObj);
		}
	}

	/**
	 * Method ends extendReport instance
	 * 
	 * @author Ritesh Mansukhani
	 * 
	 **/
	public void reportTearDown() {
		this.iTestQReportObj.close();
	}

}
