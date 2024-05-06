package com.appname.seleniumInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTest {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");
		driver.manage().window().maximize();

		compareDispalyedRowCountToActualRowCount();

	}

	public static void compareDispalyedRowCountToActualRowCount() {

		try {
			Thread.sleep(1000);
			List<WebElement> nameElements = driver.findElements(By.xpath("//table[@id='example']//tbody//tr//td[1]"));

			List<String> names = new ArrayList<String>();

			System.out.println("Size of name elements :" + nameElements.size());
			
			 //Adding column1 elements to the list

				for (WebElement nameElement : nameElements) {

					names.add(nameElement.getText());
				}
				 

			for (WebElement n : nameElements) {

				System.out.println(n.getText());
			}

			String NextEle = driver.findElement(By.xpath("//a[contains(text(),'Next')]")).getAttribute("class");

			while (!NextEle.contains("disabled")) {
				driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();

				Thread.sleep(1000);

				nameElements = driver.findElements(By.xpath("//table[@id='example']//tbody//tr//td[1]"));
				for (WebElement nameElement : nameElements) {

					names.add(nameElement.getText());
				}
				NextEle = driver.findElement(By.xpath("//a[contains(text(),'Next')]")).getAttribute("class");
			}
			for (String name : names) {
				System.out.println(name);
			}
			// counting the size of the list
			int actualCount = names.size();
			
			System.out.println("Total number of names :" + actualCount);
			String displayedCountString = driver.findElement(By.id("example_info")).getText().split(" ")[5];
			int displayedCount = Integer.parseInt(displayedCountString);

			System.out.println("Total Number of Displayed Names count:" + displayedCount);

			Thread.sleep(1000);

			// Actual count calculated Vs Dispalyed Count
			if (actualCount == displayedCount) {
				System.out.println("Actual row count = Displayed row Count");
			} else {
				System.out.println("Actual row count !=  Displayed row Count");
				throw new Exception("Actual row count !=  Displayed row Count");
			}

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}

