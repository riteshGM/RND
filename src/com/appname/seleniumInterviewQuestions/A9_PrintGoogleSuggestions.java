package com.appname.seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A9_PrintGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		wd.findElement(By.name("q")).sendKeys("game of thrones");
		Thread.sleep(2000);
		List<WebElement> datas = wd.findElements(By.xpath(".//ul[@role='listbox']//following::li"));
		for(int i=0;i<datas.size();i++) {
			System.out.println(datas.get(i).getText());
		}
		
		}
}
