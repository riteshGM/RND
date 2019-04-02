package com.appname.seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;


public class FileRND {
	
	
	@Test()
	public void FileRND()
	{
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_SSS");
		
		System.out.println("Date Printed"+formater.format(new Date()));
		

//		String reportDirectory = new File(System.getProperty("user.dir")) + "\\src\\screenshots\\";
		
		//String path = (String)reportDirectory+"/success_screenshots/test_run_"+formater.format(calendar.getTime());
		
		String path = System.getProperty("user.dir")+"/src/screenshots"+"/test_run_"+formater.format(calendar.getTime());
		
		System.out.println(path);
		new File(path).mkdirs();
		
		String groups = "UAT|SIT|SANITY";
		String a[]=groups.split("\\|");
		
		System.out.println("Length "+a.length);
		String abc="";
		
		
		for (String b : a){
			abc=abc+"_"+b;
		} 
		
		System.out.println(abc);
		
		String testcasePath = path+"/"+"testcase_1_";
		boolean destFile2 = new File(testcasePath).mkdir();
		
		
		  File file = new File(testcasePath+"\\sajdhjsad.png");
		  
		     /*If file gets created then the createNewFile() 
		      * method would return true or if the file is 
		      * already present it would return false
		      */
	             boolean fvar;
				try {
					fvar = file.createNewFile();
					if (fvar){
				          System.out.println("File has been created successfully");
				     }
				     else{
				          System.out.println("File already present at the specified location");
				     }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     
		
		

	}
	
	
}
