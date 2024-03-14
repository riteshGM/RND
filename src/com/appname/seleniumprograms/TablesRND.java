package com.appname.seleniumprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TablesRND {
	//public static final Logger log = Logger.getLogger(FindColmnRND.class.getName());

	WebElement element = null;
	public String methodName = null;
	WebDriver driver;

	@Test (priority =0)
	public void testColum() {

		try{
			String service = System.getProperty("user.dir")+"\\drivers\\IEDriverServer_32.exe";
			System.setProperty("webdriver.ie.driver", service);
			driver = new InternetExplorerDriver();
			//driver.get("http://toolsqa.com/automation-practice-table/");
			driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
			driver.manage().window().maximize();
			By locator = By.xpath("//input[@class='cb1-element']");
			//driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
			//By locator = By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[5]");
			// for attribute By locator = By.xpath("//ul[@id='primary-menu']/li");
			//By locator = By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[4]");
			//System.out.println(driver.findElement(locator).getAttribute("class"));
			/*
			List<WebElement> element = driver.findElements(locator);
			for (WebElement ele : element){
				System.out.println(ele.getAttribute("class"));
				
			}
			*/
			
			//getColumn(driver,locator,"getText:String","All",1, "key");
			/*getColumn(driver,locator,"getText:Integer","Min",1, "key");
			getColumn(driver,locator,"getText:Integer","Min",2, "key");
			getColumn(driver,locator,"getText:Integer","Max",2, "key");
			getColumn(driver,locator,"getText:Double","Max",1, "key");*/
			//getColumn(driver,locator,"getText","min",3, "key","long");
			//getColumn(driver,locator,"getAttribute(\"class\")","ALL",0, "key","Integer");
			getColumn(driver,locator,"click","ALL",0, "key","Integer");
			//driver.quit();
			
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
	}//@Test Ends Here
	
/**
 *
 *@author Ritesh Mansukhani
 *
 *
 *@code This Function is Used to retrieve list of Values||Min||Max from similar structured WebElements from Web UI
 * 
 *@param driver --Holds WebDriver
 *@param eleLocator -- WebElement Locator
 *@param actionType -- Action to be performed on WebElement (getAttribute||getText||click)
 *@param returnFuncType -- Action on Retrieved Test Data (Min||Max||ALL)
 *@param returnCount -- How Many Values Expected (Works Only for Min||Max)
 *@param dataKey -- dataKey for retrieved values to be stored in DataMap
 *@param expectedValueType -- Expected Data Type of element retrieved from Web Screen, Used for Min||Max Functions
 *
 *@return ArrayList of Data retrieved from Web Screen
 *
 **
 */

	ArrayList getColumn(WebDriver driver, By eleLocator, String actionType,
			String returnFuncType, int returnCount, String dataKey,
			String expectedValueType) {

		List<WebElement> element = driver.findElements(eleLocator);
		ArrayList columnDataListRaw = new ArrayList();
		ArrayList columnDataListWithType = new ArrayList(); //Used to Hold Data After DataType Parsing
		ArrayList columnDataListFinal = new ArrayList();  //Used to Hold Final Data which will be returned back to calling program
		//Identify actionType (getText|getAttribute|click) and perform the action accordingly 
		if (!element.isEmpty()){
			//Ritesh
			if(actionType.contains("getAttribute")){
				System.out.println("Action Obtained initially as "+actionType);
				//logic for  fetching the string between  "<action>"
				actionType = actionType.substring(actionType.indexOf("\"") + 1);
				actionType = actionType.substring(0, actionType.indexOf("\""));
				System.out.println("getAttribute action retrived "+actionType);
				for (WebElement ele: element){
					columnDataListRaw.add(ele.getAttribute(actionType));
				}
			}
			else{
				//Ritesh
				switch(actionType) {
				case "getText" :
					for (WebElement ele: element){
						columnDataListRaw.add(ele.getText());
					}
					break;
				case "click" :
					for (WebElement ele: element){
						ele.click();
					}
					break;
				default :
					System.out.println("Invalid ActionType: Please Check ActionType and Retry");
				}//Case Ends
			}//If Ends
			System.out.println("Column Data Retrived as "+columnDataListRaw);
			if((expectedValueType.equalsIgnoreCase("integer") || expectedValueType.equalsIgnoreCase("double") || expectedValueType.equalsIgnoreCase("long"))&& !actionType.equalsIgnoreCase("click")){
				if(expectedValueType.equalsIgnoreCase("integer")){
					Iterator <String> itr =columnDataListRaw.iterator();
					while(itr.hasNext()){
						columnDataListWithType.add(Integer.parseInt(itr.next()));
					}
				}else if(expectedValueType.equalsIgnoreCase("double")){
					Iterator <String> itr =columnDataListRaw.iterator();
					while(itr.hasNext()){
						columnDataListWithType.add(Double.parseDouble(itr.next()));
					}
				}else if(expectedValueType.equalsIgnoreCase("long")){
					Iterator <String> itr =columnDataListRaw.iterator();
					while(itr.hasNext()){
						columnDataListWithType.add(Long.parseLong(itr.next()));
					}
				}//Inner If Ends Here
				System.out.println("Column Data List with type"+expectedValueType+" "+columnDataListWithType);
				//Find Required Data as per returnFunctionType Min|Max|All
				if (returnFuncType.equalsIgnoreCase("min") && returnCount>0){
					Collections.sort(columnDataListWithType);
					for (int i = 0 ; i<returnCount ; i++){
						columnDataListFinal.add((columnDataListWithType.get(i)));
					}
					System.out.println(returnCount+" Minimum Column Value Retrived from Screen as"+columnDataListFinal);
				}else if(returnFuncType.equalsIgnoreCase("max") && returnCount>0){
					Collections.sort(columnDataListWithType, Collections.reverseOrder());
					for (int i = 0 ; i<returnCount ; i++){
						columnDataListFinal.add((columnDataListWithType.get(i)));
					}
					System.out.println(returnCount+" Max Column Value Retrived from Screen as"+columnDataListFinal);
				}else if (returnFuncType.equalsIgnoreCase("all")){
					//Return Elements in Same Sequence as Captured from Screen
					columnDataListFinal=columnDataListWithType;
					System.out.println("All Column Values Retrived from Screen as"+columnDataListFinal);
				}else{
					System.out.println("Invalid returnFuncType ["+returnFuncType+"] Or Invalid returnCount ["+returnCount+"]Please check function call again");
				}//Inner If Ends Here
			}else if (actionType.equalsIgnoreCase("click")){
				columnDataListFinal.add(true);	//If here, we received Action as click, returns true if click action if passed
			}
			else{
				columnDataListFinal=columnDataListRaw; // If here, we received String or null or anything as expectedReturnType
			}
			return columnDataListFinal; //Return Value and Exit from Function
		}else{
			System.out.println("No Element Found Please Check Locator Value and Retry"); //If Here, Zero Elements are found on Web UI
			return null;
		}//Outer If Ends
	}//Function Ends
}//Class Ends Here
