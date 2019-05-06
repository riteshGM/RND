package com.appname.report;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 * @author Ritesh Mansukhani
 * 
 * 
 *         TestBase Class Acts As Test Base for Framework. It contains all the
 *         common methods() which will be utilized by all the Test Cases
 *         throughout Execution E.g. Tasks like WebDriver Initialization, Taking
 *         ScreenShots, Read-Write from property/flat files. Define all you
 *         commonly used method() in TestBase Class and extend all your TestCase
 *         Java Classes to TestBase to use the utility methods from TestBase
 *         Class
 * 
 */


public class ReportTestBase {


	public static ExtentReports extentReport;
	public static ExtentTest extentTest;

	

	/*
	 * public static WebElement frameExplicitWaitHelper(WebDriver driver, By
	 * locator, int seconds){
	 * 
	 * System.out.println("Retrying To Find Element with location" +locator);
	 * 
	 * /*try { Thread.sleep(seconds); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } return
	 * driver.findElement(locator);
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, seconds); WebElement
	 * element = wait.until(ExpectedConditions.(locator)); return element;
	 * 
	 * }
	 */

	@AfterSuite
	public void rollOffSuite() {
		extentReport.close();
	}

	@BeforeSuite
	public void setUpSuite() {

		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"dd-MM-yyyy-hh-mm-ss");
		reportSetUp(dateFormat.format(new Date()), "Test Application Name",
				"SIT");
	}

	/**
	 * Method Initializes ExtentReport ExtendReport object and its Properties
	 * 
	 * @author Ritesh Mansukhani
	 * @param dateTime
	 * @param appName2
	 * @param envName2
	 * 
	 * 
	 */
	private void reportSetUp(String dateTime, String appName2, String envName2) {
		// String dateTime = getCurrentDateTime();
		String configPath = System.getProperty("user.dir")
				+ "\\src\\resources\\extentConfig.xml";
		extentReport = new ExtentReports(System.getProperty("user.dir")
				+ "\\ExtentTestReport\\AutomationTestReport_" + dateTime
				+ ".html", true);
		extentReport.addSystemInfo("Enviroment", envName2).addSystemInfo(
				"Application Name", appName2);
		extentReport.loadConfig(new File(configPath));
		
	}

	@BeforeMethod
	public void beforeTestMethod(Method testMethod) {
		extentTest = startExtentReportTest("Test Case Name with Test ID Here");
	}

	/**
	 * Method Initializes ExtentReport's ExtendTest object
	 * 
	 * @author Ritesh Mansukhani
	 * @param methodName
	 * 
	 */
	private ExtentTest startExtentReportTest(String methodName) {
		try{
			
			return extentReport.startTest(methodName);
			
			
		}catch(Exception e ){
			e.printStackTrace();
			return null;
		}
	
	}

	@AfterMethod
	public void afterTestMethod() {
		endExtentReportTest();
		extentReport.flush();
		extentTest = null;
	}

	/**
	 * Method Performs Clean-up activity for ExtendTest Object of ExtendReport
	 * and Flushes ExtentReport Object before starting next @test method
	 * 
	 * @author Ritesh Mansukhani
	 * @param result
	 * 
	 **/
	private void endExtentReportTest() {
		extentReport.endTest(extentTest);
	}
	
	//Report to html
	public void reportLog(boolean pass){
		if(pass)
		extentTest.log(LogStatus.PASS, "Click at At ADD Button", "Column_1 <td> Column_2 </td>");
		if(!pass)
			extentTest.log(LogStatus.FAIL, "Click at At ADD Button", "Column_1 <td> Column_2 </td>");	
	}
	
}
