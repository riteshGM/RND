package com.appname.TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {

	// login credentials - String array
	String[][] data = { 
			{ "standard_user", "secret_sauce"}, 
			{ "locked_out_user", "secret_sauce"},
			{ "problem_user", "secret_sauce"}, 
			{ "performance_glitch_user", "secret_sauce"} 
			};

	// Data Provider Annotation
	@DataProvider(name = "loginCredentials")
	public String[][] loginDataProvider() {
		return data;
	}

	// Login test
	@Test(dataProvider = "loginCredentials")
	public void loginwithCredential(String uname, String pword) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
		userName.sendKeys(uname);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		driver.close();
}

}
