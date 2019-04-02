package com.appname.TestNGPrograms;

import org.testng.annotations.Test;

public class TestNGRND {
	@Test(groups = { "functest", "checkintest" })
	public void setData()
	{
		System.out.println("you have provided username as::");
		System.out.println("you have provided password as::");
	}

}
