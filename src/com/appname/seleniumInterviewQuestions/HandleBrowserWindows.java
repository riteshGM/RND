package com.appname.seleniumInterviewQuestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); //Selenium-4
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//getWindowHandle()--->returns String
		
		
		/*String windowID=driver.getWindowHandle(); //Every time it will generate new Random ID
		System.out.println(windowID);*/
		
		//getWindowHandles()----> Set<String>
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> windowIds=driver.getWindowHandles(); //Returns IDs of multiple browser windows
		
		//1. Method: Using Iterator
		
		/*Iterator<String> it=windowIds.iterator();
		
		String parentWID=it.next();
		
		String ChildWID=it.next();
		System.out.println(parentWID);
		System.out.println(ChildWID); */
		
		
		//2.Method: using List/ArrayList
		
		
		List<String> windowIDList= new ArrayList<String>(windowIds);//converting set to list
		
	/* String parentW=windowIDList.get(0);
		String childW=windowIDList.get(1);
		
		System.out.println("Parent Wiondow ID::"+parentW);
		System.out.println("Child Wiondow ID::"+childW);
		
		//How to use Window IDS for Switching
		
		driver.switchTo().window(parentW);
		
		String Ptitle=driver.getTitle();
		System.out.println(Ptitle);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childW);
		
		String Ctitle=driver.getTitle();
		System.out.println(Ctitle); */
		
		//Method3: Using For Eachloop
		
		//Close the window based on choice
		
		  for(String w:windowIds) { 
			  String title=driver.switchTo().window(w).getTitle();
		  //title.equals("OrangeHRM") || title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")
		  if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
			  driver.close();
		  }
		  
		  
		  }
		  
		  //driver.close(); //close single browser window on which is pointing /focusing
		 	
		
	}

}
