package com.appname.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ITestQTest {

	private ExtentTest iTestQTestObj;
	private String testCaseScreenLocation;
	private List<LogStatus> childSubStepStatuses = new ArrayList<LogStatus>();
	public static final Logger log = Logger.getLogger(ITestQTest.class.getName());

	public ITestQTest(ITestQReport iTestQReport, String methodName, String testCaseScreenLocation1) {
		this.testCaseScreenLocation = testCaseScreenLocation1;
		this.iTestQTestObj = iTestQReport.getReportObj().startTest(methodName);
	}

	/**
	 * 
	 * @param iTestQReport
	 * @param methodName
	 * @param testCaseDescription
	 * @param screenShotsLocation
	 */
	public ITestQTest(ITestQReport iTestQReport, String methodName, String testCaseDescription,
			String testRunScreensLocation) {
		setTestCaseScreenLocation(testRunScreensLocation, methodName);
		this.iTestQTestObj = iTestQReport.getReportObj().startTest(methodName,
				"<b>TestCase Logical Name - </b>" + testCaseDescription + "&nbsp&nbsp&nbsp&nbsp<span title =" + "\""
						+ "Test Case ScreenShots" + "\"" + "class =" + "\""
						+ "weight-light label blue lighten-1 text-white" + "\"" + "><a class=" + "\"" + "text-white"
						+ "\"" + " href='" + testCaseScreenLocation + "'>ScreenShots</a></span>");

	}

	private boolean setTestCaseScreenLocation(String testRunScreensLocation, String methodName) {

		testCaseScreenLocation = testRunScreensLocation + "/" + methodName;
		return new File(testCaseScreenLocation).mkdir();

	}

	public String getTestCaseScreenLocation() {
		return testCaseScreenLocation;
	}

	public ExtentTest getTestObj() {
		return this.iTestQTestObj;
	}

	public void endTest(ITestQReport iTestQReport) {
		iTestQReport.getReportObj().endTest(this.iTestQTestObj);
	}

	public void appendChild(ExtentTest parentTest, ITestQTest iTestQTest, String testStepName) {
		log.debug("ChildSubStatuses of Current Object" + childSubStepStatuses);
		// Before performing append check if Status is Unknown
		if (this.iTestQTestObj.getRunStatus().equals(LogStatus.UNKNOWN)) {
			log.debug("Inside If Block Status Found to be LogStatus.UNKNOWN");
			boolean passFlag = true;
			for (LogStatus temp : childSubStepStatuses) {
				log.debug(temp);
				if (temp.equals(LogStatus.FAIL)) {
					log.debug("Inside If One of Child found to be Failed");
					passFlag = false;
				}
			}
			if (passFlag) {
				log.debug("Inside If passFlag is " + passFlag);
				this.iTestQTestObj.log(LogStatus.PASS, testStepName,
						"-" + "<td>SubStep : Completed Successfully</td>" + "<td>" + "-" + "</td>");
				iTestQTest.setChildSubStepStatuses(LogStatus.PASS);
				log.debug("ChildSubStatuses of Parent Object" + iTestQTest.getChildSubStepStatuses());
				parentTest.appendChild(this.iTestQTestObj);
			} else {
				log.debug("Inside Else passFlag is " + passFlag);
				this.iTestQTestObj.log(LogStatus.FAIL, testStepName,
						"-" + "<td>SubStep : Attempted but Failed</td>" + "<td>" + "-" + "</td>");

				iTestQTest.setChildSubStepStatuses(LogStatus.FAIL);
				log.debug("ChildSubStatuses of Parent Object" + iTestQTest.getChildSubStepStatuses());
				parentTest.appendChild(this.iTestQTestObj);
			}

		} else {
			log.debug("Inside Else Block Status Found Other than LogStatus.UNKNOWN");
			iTestQTest.setChildSubStepStatuses(this.iTestQTestObj.getRunStatus());
			log.debug("ChildSubStatuses of Parent Object" + iTestQTest.getChildSubStepStatuses());
			parentTest.appendChild(this.iTestQTestObj);
		}
	}

	/*
	public void logSkip(String reportMessage, Step stepToExecute, ExtentTest child) {
		child.log(LogStatus.SKIP, stepToExecute.getElement(), reportMessage);
	}


	public void logSkip(Step stepToExecute, ExtentTest child) {
		child.log(LogStatus.SKIP, stepToExecute.getElement(), getReportMessage(stepToExecute.getType(), "skip"));
	}
*/
	/**
	 * @author RiteshMansukhani Description: This Step Identifies Report Message
	 *         as per step type and/or action
	 * @param stepType
	 * @param status
	 * @return
	 */
	private String getReportMessage(String stepType, String status) {
		String reportMessage = null;
		if (stepType.equalsIgnoreCase("custom")) {
			if (status.equalsIgnoreCase("skip")) {
				reportMessage = "Test Skipped: Class Name Not Defined, Cannot Execute this Custom Step";
			}
		}
		return reportMessage;
	}

	public String getAssertMessageInReportFormat(String resultFailureMessage) {
		log.info(" function: getAssertMessageInReportFormat()");
		if (!resultFailureMessage.isEmpty()) {
			log.error("Assertion Exception Occured: Assertion Failure Message " + resultFailureMessage);
			// Formatting Failure Message for ExtentReport
			resultFailureMessage = resultFailureMessage.replace("<", "&lt;");
			resultFailureMessage = resultFailureMessage.replace(">", "&gt;");
			log.debug("Printing Assertion Message After Replacement " + resultFailureMessage);
			// log.debug("logAssertFailToExtentReportWithScreen() END####");
		}
		log.info(" function: getAssertMessageInReportFormat()");
		return resultFailureMessage;
	}

	/**
	 * This Method Takes Screenshot if takeScreenshot flag is 'y' and performs
	 * task of reporting message to ExtentReport
	 * 
	 * @author RiteshMansukhani
	 * @since 9th March 2018
	 * @param takeScreenshot
	 * @param action
	 * @param dataValue
	 * @param dataValue2
	 * @param stepToExecute
	 * @param driver
	 * @param currentMethod
	 * @param testStep
	 * @param stepNumber
	 * @param passFlag
	 * @param child
	 * @param reportMessage
	 * @param testDataKey
	 * @param multipleDataValues
	 * @return void
	 */

	public void logToReportWithScreen(String takeScreenshot, String action, String dataValue, String stepToExecute,
			WebDriver driver, String currentMethod, String testStep, int stepNumber, boolean passFlag, ExtentTest child,
			String reportMessage, String stepNameColumn, String testDataKey, String multipleDataValues) {
		
		log.info(" function: logToExtentReportWithScreen for Method - " + currentMethod + "["
				+ testStep + " ] Step Number [" + stepNumber + "] Element [" + testStep + stepToExecute
				+ "] reportMessage [" + reportMessage + "]");
		String extentReportScreenDest = null;
		try {

			extentReportScreenDest = takeScreenshot(driver, currentMethod, testStep, stepNumber, stepToExecute,
					action);
			if (passFlag) {
				// Test is Passed
				log.debug("Inside If of Report Entry Block passFlag retrived as " + passFlag);
				if (null != extentReportScreenDest) {
					if (null != multipleDataValues) {
						log.debug("Inside multipleDataValues If block " + multipleDataValues);
						child.log(LogStatus.PASS, stepNameColumn,
								multipleDataValues + "<td>" + action + " : Performed and Successfully Completed</td>"
										+ "<td>" + extentReportScreenDest + "</td>");
					} else if (null != dataValue) {
						child.log(LogStatus.PASS, stepNameColumn,
								testDataKey + " = " + dataValue + "<td>" + action
										+ " : Performed and Successfully Completed</td>" + "<td>"
										+ extentReportScreenDest + "</td>");
					} else {
						child.log(LogStatus.PASS, stepNameColumn,
								"-" + "<td>" + action + " : Performed and Successfully Completed</td>" + "<td>"
										+ extentReportScreenDest + "</td>");
					}
				} else {
					if (null != multipleDataValues) {
						log.debug("Inside multipleDataValues If block " + multipleDataValues);
						child.log(LogStatus.PASS, stepNameColumn, multipleDataValues + "<td>" + action
								+ " : Performed and Successfully Completed</td>" + "<td>" + "-" + "</td>");
					} else if (null != dataValue) {
						child.log(LogStatus.PASS, stepNameColumn, testDataKey + " = " + dataValue + "<td>" + action
								+ " : Performed and Successfully Completed</td>" + "<td>" + "-" + "</td>");
					} else {
						child.log(LogStatus.PASS, stepNameColumn, "-" + "<td>" + action
								+ " : Performed and Successfully Completed</td>" + "<td>" + "-" + "</td>");
					}
				}
			} else {
				// Test is Failed
				log.debug("Inside If of Report Entry Block passFlag retrived as " + passFlag);
				if (null != extentReportScreenDest) {
					if (null != multipleDataValues) {
						log.debug("Inside multipleDataValues If block " + multipleDataValues);
						child.log(LogStatus.FAIL, stepNameColumn,
								multipleDataValues + "<td>" + action + " : Attempted but Failed " + reportMessage
										+ "</td>" + "<td>" + extentReportScreenDest + "</td>");
					} else if (null != dataValue) {
						child.log(LogStatus.FAIL, stepNameColumn,
								testDataKey + " = " + dataValue + "<td>" + action + " : Attempted but Failed "
										+ reportMessage + "</td>" + "<td>" + extentReportScreenDest + "</td>");
					} else {
						child.log(LogStatus.FAIL, stepNameColumn, "-" + "<td>" + action + " : Attempted but Failed "
								+ reportMessage + "</td>" + "<td>" + extentReportScreenDest + "</td>");

					}
				} else {
					if (null != multipleDataValues) {
						log.debug("Inside multipleDataValues If block " + multipleDataValues);
						child.log(LogStatus.PASS, stepNameColumn, multipleDataValues + "<td>" + action
								+ " : Attempted but Failed </td>" + "<td>" + "-" + "</td>");
					} else if (null != dataValue) {
						child.log(LogStatus.FAIL, stepNameColumn, testDataKey + " = " + dataValue + "<td>" + action
								+ " : Attempted but Failed " + reportMessage + "</td>" + "<td>" + "-" + "</td>");

					} else {
						child.log(LogStatus.FAIL, stepNameColumn, "-" + "<td>" + action + " : Attempted but Failed "
								+ reportMessage + "</td>" + "<td>" + "-" + "</td>");
					}
				}
			}

		} catch (Exception e) {
			log.error("Error while Reporting in logToReportWithScreen() -" + currentMethod);
			e.printStackTrace();
		}

		log.info(" function: logToExtentReportWithScreen for Method - " + currentMethod + "["
				+ testStep + " ] Step Number [" + stepNumber + "] Element [" + testStep + stepToExecute
				+ "] Action [" + stepToExecute+ "] reportMessage [" + reportMessage + "]");
	}

	/**
	 * 
	 * @param driver
	 * @param currentMethod
	 * @param testStep
	 * @param stepNumber
	 * @param stepToExecute
	 * @param action
	 * @return String extentReportScreenDest
	 */
	private String takeScreenshot(WebDriver driver, String currentMethod, String testStep, int stepNumber,
			String stepToExecute, String action) {
		String extentReportScreenDest = null;
		
		log.info(" function: takeScreenShot() for " + currentMethod + " ScreenDestValue "
				+ extentReportScreenDest);

		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_SSS");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			if (testStep.length() > 13) {
				testStep = testStep.substring(0, 13);
			}
			File destFile = new File(testCaseScreenLocation + "/" + String.format("%03d", stepNumber) + "_" + testStep
					+ "_" + formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrFile, destFile);

			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
					+ "' height='100' width='100'/> </a>");
			extentReportScreenDest = "<a target='_blank' href='" + destFile.getAbsolutePath() + "'> Click Here</a>";

			/*
			 * }else{ log.debug(
			 * "takeScreenShot() TestCases.TakeScreenShotSwitch is false. Skipping Screen Capture "
			 * ); }
			 */
		} catch (FileNotFoundException e) {
			log.error("Error while taking screenshot in method - " + currentMethod + " " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			log.error("Error while taking screenshot in method - " + currentMethod + " " + e.getMessage());
			e.printStackTrace();

		}catch (UnhandledAlertException unExpectedAlert){
			//Ritesh You will need to come back to this one day
			log.error("Error while Reporting in logToReportWithScreen() -" + currentMethod + " " + unExpectedAlert.getMessage());
			unExpectedAlert.printStackTrace();
		}
		catch (Exception e) {
			log.error("Error while Reporting in logToReportWithScreen() -" + currentMethod + " " + e.getMessage());
			e.printStackTrace();
		}
		log.info(" function: takeScreenShot() for " + currentMethod + " ScreenDestValue"
				+ extentReportScreenDest);
		return extentReportScreenDest;

	}

	public List<LogStatus> getChildSubStepStatuses() {
		return childSubStepStatuses;
	}

	public boolean setChildSubStepStatuses(LogStatus arg0) {
		
		log.info(" function: setChildSubStepStatuses()");
		if (arg0 != null) {
			log.debug("setChildSubStepStatuses() Inside If Logstatus recieved " + arg0);
			this.childSubStepStatuses.add(arg0);
			log.info(" function: setChildSubStepStatuses()");
			return true;
		} else {
			log.debug("setChildSubStepStatuses() Inside else Logstatus recieved " + arg0);
			log.info(" function: setChildSubStepStatuses()");
			return false;
		}
	}

	public ITestQTest startReportTestAppended(String stepName, ITestQReport iTestQReport) {
		this.iTestQTestObj = iTestQReport.getReportObj().startTest(stepName);
		return this;
	}

} 
