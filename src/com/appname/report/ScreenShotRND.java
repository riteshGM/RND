package com.appname.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class ScreenShotRND {
	
	
	
	public void logToReportWithScreen(String takeScreenshot, String action, String dataValue, Step stepToExecute,
			WebDriver driver, String currentMethod, String testStep, int stepNumber, boolean passFlag, ExtentTest child,
			String reportMessage, String stepNameColumn, String testDataKey, String multipleDataValues) {
		int id = ITestQLogger.getuniqueID();
		log.info("START ID=" + id + " function: logToExtentReportWithScreen for Method - " + currentMethod + "["
				+ testStep + " ] Step Number [" + stepNumber + "] Element [" + testStep + stepToExecute.getElement()
				+ "] Action [" + stepToExecute.getAction() + "] reportMessage [" + reportMessage + "]");
		String extentReportScreenDest = null;
		try {
			// Get User Friendly Action Message for Report
			action = getRptActionName(action, stepNameColumn);
			// Identify and Take Screen
			if (!passFlag) {
				// If Test Case is reported as Failed TakeScreenshot regardless
				// of takeScreenshot FLAG
				extentReportScreenDest = takeScreenshot(driver, currentMethod, testStep, stepNumber, stepToExecute,
						action);
			} /** Removed from  TAKE ALL SCREENSHOT FLAG Implementation
			else if (Boolean.parseBoolean(
					SuiteInitializer.getFrameworkPropertyData(ConfigConstants.TAKE_ALL_SCREENSHOTS_FLAG))) {
				//Compulsory take screenshots for each step
				log.debug(" TAKE_ALL_SCREENSHOTS_FLAG is avilable as " + Boolean.parseBoolean(
						SuiteInitializer.getFrameworkPropertyData(ConfigConstants.TAKE_ALL_SCREENSHOTS_FLAG)));

				extentReportScreenDest = takeScreenshot(driver, currentMethod, testStep, stepNumber, stepToExecute,
						action);
			}
			else if (!Boolean.parseBoolean(
					SuiteInitializer.getFrameworkPropertyData(ConfigConstants.TAKE_ALL_SCREENSHOTS_FLAG)) && null != takeScreenshot && !takeScreenshot.trim().equalsIgnoreCase("")) {
				//Take Screen shot when TAKE_ALL_SCREENSHOTS_FLAG is false or key entry is not present in config.properties file
				log.debug(" Screenshot attribute is avilable as " + takeScreenshot);
				if (takeScreenshot.trim().equals("yes") || takeScreenshot.trim().equals("y")) {
					//Good to go take screenshot based on step attribute value
					extentReportScreenDest = takeScreenshot(driver, currentMethod, testStep, stepNumber, stepToExecute,
							action);
				} else {
					log.error("getScreenShotOnProgress : Takescreenshot attribute is other than 'yes' or 'y'");
				}
			} **/
			else if (Boolean
					.parseBoolean(SuiteInitializer
							.getFrameworkPropertyData(ConfigConstants.TEST_CASES_TAKE_SCREENSHOT_SWITCH))
					&& null != takeScreenshot && !takeScreenshot.trim().equalsIgnoreCase("")) {
				// Take Screen shot only when TEST_CASES_TAKE_SCREENSHOT_SWITCH is true
				log.debug(" Screenshot attribute is avilable as " + takeScreenshot);
				if (takeScreenshot.trim().equals("yes") || takeScreenshot.trim().equals("y")) {
					// Good to go take screenshot based on step attribute value
					extentReportScreenDest = takeScreenshot(driver, currentMethod, testStep, stepNumber, stepToExecute,
							action);
				} else {
					log.error("getScreenShotOnProgress : Takescreenshot attribute is other than 'yes' or 'y'");
				}
			}
			else {
				log.error("getScreenShotOnProgress : Takescreenshot attribute is null or empty "+takeScreenshot+ "TEST_CASES_TAKE_SCREENSHOT_SWITCH value "+Boolean
						.parseBoolean(SuiteInitializer.getFrameworkPropertyData(ConfigConstants.TEST_CASES_TAKE_SCREENSHOT_SWITCH)));
			}

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

		log.info("END ID=" + id + " function: logToExtentReportWithScreen for Method - " + currentMethod + "["
				+ testStep + " ] Step Number [" + stepNumber + "] Element [" + testStep + stepToExecute.getElement()
				+ "] Action [" + stepToExecute.getAction() + "] reportMessage [" + reportMessage + "]");
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
			Step stepToExecute, String action) {
		String extentReportScreenDest = null;
		int id = ITestQLogger.getuniqueID();
		log.info("START ID=" + id + " function: takeScreenShot() for " + currentMethod + " ScreenDestValue "
				+ extentReportScreenDest);

		try {
			/*
			 * if (Boolean.parseBoolean(
			 * 
			 * SuiteInitializer .getFrameworkPropertyData(ConfigConstants.
			 * TEST_CASES_TAKE_SCREENSHOT_SWITCH))) {
			 */
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_SSS");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			// File destFile = new File(testCaseScreenLocation + "/"+
			// String.format("%03d", stepNumber) +"_" +testStep+"_"+
			// stepToExecute.getElement()
			// +"_" +action + "_" + formater.format(calendar.getTime()) +
			// ".png");
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
		log.info("END ID=" + id + " function: takeScreenShot() for " + currentMethod + " ScreenDestValue"
				+ extentReportScreenDest);
		return extentReportScreenDest;

	}

}
