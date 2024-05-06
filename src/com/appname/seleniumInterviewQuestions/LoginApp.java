package com.appname.seleniumInterviewQuestions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp {

	public static WebDriver VcentryLogin() {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		DesiredCapabilities cp = new DesiredCapabilities();
//		cp.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(cp);
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		wd.findElement(By.name("username")).sendKeys("Akshayaachu");
		wd.findElement(By.name("password")).sendKeys("Aswin@1a");
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		return wd;
		
	}
}