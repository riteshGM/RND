package com.appname.TestNGPrograms;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	@Parameters({ "groups" })
	@Test
	public void testSingleString(String groupList) {
		String[] b= groupList.split("\\|");
		List <String> groups_included =  new ArrayList<String>();
		for (int i = 0 ; i<b.length ;i++){
			groups_included.add(b[i]);
			
		}
	  System.out.println("Final List of Groups Retrived: "+groups_included);
		
	}

}
