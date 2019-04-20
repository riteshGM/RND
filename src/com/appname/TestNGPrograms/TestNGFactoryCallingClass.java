package com.appname.TestNGPrograms;

import org.testng.annotations.Factory;

public class TestNGFactoryCallingClass {
	
	@Factory
	public Object [] testRunner(){
/*		TestNGFactorySample obj = new TestNGFactorySample(1);
		TestNGFactorySample obj1 = new TestNGFactorySample(1);*/	
		
		return new Object []{new TestNGFactorySample(1),new TestNGFactorySample(2)};
	
	}
	

}
