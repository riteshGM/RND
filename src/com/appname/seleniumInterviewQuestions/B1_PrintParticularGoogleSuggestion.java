package com.appname.seleniumInterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B1_PrintParticularGoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		wd.findElement(By.name("q")).sendKeys("game of thrones");
		Thread.sleep(2000);
//		WebElement data =wd.findElement(By.xpath(".//ul[@role='listbox']//following::li[3]"));
//		System.out.println(data.getText());
//		data.click();
	List<WebElement> datas =	wd.findElements(By.xpath(".//ul[@role='listbox']//following::li"));
	for(int i=0;i<datas.size();i++) {
	String word =	datas.get(i).getText();
	if(word.contains("cast")) {
		datas.get(i).click();
		
	}
		break;
		}
	}

}
