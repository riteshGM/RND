package com.appname.seleniumInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPaginationTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		
		//Enter text in search-->Apple iPhone 14 Pro
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("beatxp Amoled smart watches for men");
		
		
		//click on search button
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(1000);;
		
		List<WebElement> AllProducts=driver.findElements(By.xpath("//span[@data-component-type='s-search-results']//div[@class='a-section']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));

		List<String> al=new ArrayList<String>();
		
		for(WebElement product:AllProducts) {
			al.add(product.getText());
		}
		
		for (WebElement n :AllProducts) {

			System.out.println(n.getText());
		}
		
		//click on next button
		String NextElement=driver.findElement(By.xpath("//*[contains(text(),'Next')]")).getAttribute("class");
		
		while(!NextElement.contains("disabled")) {

			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,250)", "");
			 */
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();

			/*
			 * WebElement next=driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("arguments[0].scrollIntoView();", next);
			 */
			
			Thread.sleep(5000);
			
			AllProducts=driver.findElements(By.xpath("//span[@data-component-type='s-search-results']//div[@class='a-section']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']"));
			for(WebElement product:AllProducts) {
				al.add(product.getText());
			}
			//System.out.println(al);
			
			NextElement=driver.findElement(By.xpath("//*[contains(text(),'Next')]")).getAttribute("class");
			if(NextElement.contains("disabled")) {
				
				NextElement=driver.findElement(By.xpath("//span[contains(text(),'Next')]")).getAttribute("class");
			}else if(NextElement.contains("separator")) {
				NextElement=driver.findElement(By.xpath("//a[contains(text(),'Next')]")).getAttribute("class");
				
			}
			
		}
		
		for(String a:al) {
			System.out.println("Product:  "+a);
		}
		
		System.out.println("Total number of SmartWatches are :"+al.size());
		driver.close();
	}
	
	

}
