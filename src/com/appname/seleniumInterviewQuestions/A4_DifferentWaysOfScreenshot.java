package com.appname.seleniumInterviewQuestions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class A4_DifferentWaysOfScreenshot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/alert/");

		// 1st method- does not take fullscreenshot

//		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("C:\\WorkSpace3\\C3_WebDriverTest\\screenshots\\alert.png"));
     	wd.findElement(By.id("id1")).click();
//		

		// 2nd method- takes fullscreenshot

		Robot robot = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage src = robot.createScreenCapture(rectangle);
		File destination = new File("C:\\WorkSpace3\\C3_WebDriverTest\\screenshots\\alert2.png");
		ImageIO.write(src, "png", destination);
		
	}

}
