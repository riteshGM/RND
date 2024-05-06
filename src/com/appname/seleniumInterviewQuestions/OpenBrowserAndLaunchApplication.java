package com.appname.seleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserAndLaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); //Open Bowser
		driver.manage().window().maximize();  //Maximize window
		driver.get("https://www.youtube.com/"); //Launch the application
		Thread.sleep(3000);    //wait for 3Sec
		driver.close();       //close the window
	}

}
