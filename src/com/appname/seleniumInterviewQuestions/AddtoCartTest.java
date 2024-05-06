package com.appname.seleniumInterviewQuestions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCartTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/StoreName/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
		
		WebElement searchtxtbox =driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchtxtbox.sendKeys("mac");
		
		//click on search button
		
		driver.findElement(By.xpath("//div[@id='search']//button[@type='button']")).click();
		
		//get list of products
		
		List<WebElement>  productlist=driver.findElements(By.xpath("//*[@id='content']/div[5]//h4/a"));
		
		
		String actText="MacBook Pro";
		for(WebElement product:productlist) {
			
			//System.out.println(product.getText());
			
			System.out.println(product.getAttribute("title"));
			System.out.println(product.getText().equals(actText));
			
			if(product.getText().equals(actText)) {
				
				
				/*
				 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				 * 
				 * System.out.println(
				 * wait.until(ExpectedConditions.elementToBeClickable(product)));
				 */
				
				System.out.println(product.getText());
				
				act.moveToElement(product).click().build().perform();
				
				
				
				/*
				 * executor.executeScript("arguments[0].scrollIntoView(true);", product);
				 * executor.executeScript("“arguments[0].click();", product);
				 */
				 
				//(“arguments[0].click();”,product);
				//product.click();
			}
			
			
		}
		
		

	}

}
