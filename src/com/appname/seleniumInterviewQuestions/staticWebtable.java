package com.appname.seleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class staticWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		//how many rows in a table
		int rows=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr")).size();
		System.out.println("Total number of rows in a Table: "+ rows);
		
		//how many Columns in a table
		int cols=driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td")).size();
		System.out.println("Total number of Columns in a Table: "+ cols);
		
		//Retrieve specific data from the table
		String value=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[4]/td[2]")).getText();
		System.out.println("The value is:"+value);
		
		//Retrieve all the test data from the table
		
		  System.out.println("Data from the table:::::::::"); for(int r=1;r<=rows;r++)
		  {
		  
		  for(int c=1;c<=cols;c++) { String
		  data=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+r+"]/td["
		  +c+"]")).getText(); System.out.println(data+ "		");
		  
		  } System.out.println(); }
		 
		
		
		//Print Capital and Currency of India
		
		/*
		 * for(int r=1;r<=rows;r++) { String
		 * Country=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+r+
		 * "]/td[2]")).getText(); //System.out.println(Country);
		 * 
		 * if(Country.equalsIgnoreCase("India")) { String
		 * city=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+r+
		 * "]/td[3]")).getText(); String
		 * currency=driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr["+r+
		 * "]/td[4]")).getText(); System.out.println(Country+"  "+
		 * "Capital:----> "+city+" "+"Currency---> "+currency); }
		 * 
		 * }
		 */
		
		
		driver.quit();
	}

}
