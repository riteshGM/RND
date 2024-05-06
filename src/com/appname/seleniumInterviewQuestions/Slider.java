package com.appname.seleniumInterviewQuestions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Slider {

	public static void main(String[] args) throws InterruptedException {
		
		
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://codepen.io/ProsantaMazumder/pen/LgvrWE");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement minSlider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("Location of Element"+minSlider.getLocation());
		System.out.println("Height and Width of Element"+minSlider.getSize());
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(minSlider, 150, 0).perform();
		
		Thread.sleep(2000);
		WebElement maxslider=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		
		act.dragAndDropBy(maxslider, -100, 0).perform();
		//System.out.println("Location of Element"+minSize.getLocation());
		

	}

}
