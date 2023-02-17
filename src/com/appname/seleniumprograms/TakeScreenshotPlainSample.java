package com.appname.seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeroturnaround.zip.commons.FileUtils;

public class TakeScreenshotPlainSample {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();
		//DownCasting Needed
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot.img"));

		//Type Casting Not Needed
		ChromeDriver driverChrome = new ChromeDriver();
		File src2 = driverChrome.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("screenshot2.img"));
		
		
	}

}
