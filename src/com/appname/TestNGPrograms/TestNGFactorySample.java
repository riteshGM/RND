package com.appname.TestNGPrograms;

import org.testng.annotations.Test;

public class TestNGFactorySample {
	
	private int parameter;
	public TestNGFactorySample(int parameter){
		this.parameter = parameter;
		System.out.println("Constructor is Invoked "+this.parameter);
	}
	
	public int getParameter(){
		return this.parameter;
	}
	
	@Test
	public void test1(){
		System.out.println("test1 invoked");
	}
	
	@Test
	public void test2(){
		System.out.println("test2 invoked");
	}
	

}
