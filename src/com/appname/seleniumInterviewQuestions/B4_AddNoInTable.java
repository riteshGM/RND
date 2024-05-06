package com.appname.seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B4_AddNoInTable {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://letcode.in/table");
		WebElement table = wd.findElement(By.id("shopping"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int sum = 0;
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));

			WebElement prices = cells.get(1);
			String text = prices.getText();
			sum += Integer.parseInt(text);
			
		}
		if (sum == 858) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		wd.quit();

	}
}