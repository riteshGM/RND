package com.appname.opps;

import org.openqa.selenium.remote.DesiredCapabilities;

public class LambaExpressionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runnable is an Interface Java.lang
		Runnable run = () -> {System.out.println("Ritesh");
		System.out.println("Mansukhani");
		};
		
		run.run();
		
	}

}
