package com.appname.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsRND {
	
	
	
	@Test
	public void testDragNDrop() throws InterruptedException{
		try{
			//AutomationStepByStep.com
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		//Thread.sleep(3000);

		dragAndDropWithResult(driver, driver.findElement(By.xpath("//div[@id='todrag']/child::span[1]")), driver.findElement(By.xpath("//div[@id='mydropzone']")), By.xpath("//div[@id='droppedlist']/child::span"));
		//driver.quit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}	
		public static void dragAndDrop(WebDriver driver, WebElement source, WebElement dest){
			if (source.isDisplayed() && dest.isDisplayed()){
				System.out.println("DragNDrop IF Started: ");
		 new Actions(driver).moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
		 	System.out.println("DragNDrop IF Ended: ");
			}else{
				System.out.println("Source Or Destination Location Not Available on UI");
			}
		}
		
		public static void dragAndDropWithResult(WebDriver driver, WebElement source, WebElement dest, By dropped){
			dragAndDrop(driver,source,dest);
				if(driver.findElement(dropped).getText().equalsIgnoreCase(source.getText())){
					System.out.println("Element "+dropped+" Dropped to Destination Location "+dropped.toString());
				}else{
					System.out.println("Could not Find Dragged Element at Destinnation Location");
			}
			
		}
		
	
	
	
}
