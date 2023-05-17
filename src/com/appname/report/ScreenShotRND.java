package com.appname.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ScreenShotRND {
	
	public static final Logger log = Logger.getLogger(ScreenShotRND.class.getName());
	
	public void logToReportWithScreen(String takeScreenshot, String action, String dataValue, String stepToExecute,
			WebDriver driver, String currentMethod, String testStep, int stepNumber, boolean passFlag, ExtentTest child,
			String reportMessage, String stepNameColumn, String testDataKey, String multipleDataValues) {
		//int id = ITestQLogger.getuniqueID();
		//log.info("START ID=" + id + " function: logToExtentReportWithScreen for Method - " + currentMethod + "["
		//		+ testStep + " ] Step Number [" + stepNumber + "] Element [" + testStep + stepToExecute.getElement()
		//		+ "] Action [" + stepToExecute.getAction() + "] reportMessage [" + reportMessage + "]");
		String extentReportScreenDest = null;
		try {
			// Identify and Take Screen

			extentReportScreenDest = takeScreenshot(driver, currentMethod, testStep, stepNumber, stepToExecute,
						action);


			if (passFlag) {
				// Test is Passed
				System.out.println("Inside If of Report Entry Block passFlag retrived as " + passFlag);
				
						child.log(LogStatus.PASS, stepNameColumn,
								"-" + "<td>" + action + " : Performed and Successfully Completed</td>" + "<td>"
										+ extentReportScreenDest + "</td>");
				 
			} else {
				// Test is Failed
				System.out.println("Inside If of Report Entry Block passFlag retrived as " + passFlag);

						child.log(LogStatus.FAIL, stepNameColumn, "-" + "<td>" + action + " : Attempted but Failed "
								+ reportMessage + "</td>" + "<td>" + "-" + "</td>");

			}

		} catch (Exception e) {
			System.out.println("Error while Reporting in logToReportWithScreen() -" + currentMethod);
			e.printStackTrace();
		}
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
		System.out.println(" function: takeScreenShot() for " + currentMethod + " ScreenDestValue "
				+ extentReportScreenDest);
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_SSS");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			if (testStep.length() > 13) {
				testStep = testStep.substring(0, 13);
			}
			File destFile = new File(System.getProperty("user.dir") + "/Report/" + String.format("%03d", stepNumber) + "_" + testStep
					+ "_" + formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrFile, destFile);

			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
					+ "' height='100' width='100'/> </a>");
			extentReportScreenDest = "<a target='_blank' href='" + destFile.getAbsolutePath() + "'> Click Here</a>";

		} catch (FileNotFoundException e) {
			System.out.println("Error while taking screenshot in method - " + currentMethod + " " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error while taking screenshot in method - " + currentMethod + " " + e.getMessage());
			e.printStackTrace();

		}catch (UnhandledAlertException unExpectedAlert){
			//Ritesh You will need to come back to this one day
			System.out.println("Error while Reporting in logToReportWithScreen() -" + currentMethod + " " + unExpectedAlert.getMessage());
			unExpectedAlert.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Error while Reporting in logToReportWithScreen() -" + currentMethod + " " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(" function: takeScreenShot() for " + currentMethod + " ScreenDestValue"
				+ extentReportScreenDest);
		return extentReportScreenDest;

	}

}
