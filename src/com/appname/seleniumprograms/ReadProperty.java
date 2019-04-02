package com.appname.seleniumprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperty {
  public static void main(String[] args) {

	Properties prop = new Properties();
	InputStream input = null;

	try {

		input = new FileInputStream("test.properties");

		// load a properties file
		prop.load(input);
		String var = "Ritesh Mansukhani";
		System.out.println(var.substring(0, 5));
		if(var.isEmpty()){
			System.out.println("Inside Empty Checked");
		}
		
		if (var==null){
			System.out.println("Inside Null checked");
		}
		
		String key = "dismiss";
		if (Boolean.parseBoolean(prop.getProperty("action."+key))){
		System.out.println(Boolean.parseBoolean(prop.getProperty("action."+key)));
		
		}else{
			System.out.println("Inside esle block "+prop.getProperty("action."+key));
			System.out.println(Boolean.parseBoolean(prop.getProperty("action."+key)));	
		}
		
		// get the property value and print it out
		System.out.println(prop.getProperty("action.database:(\'test\')"));
		System.out.println(prop.getProperty("dbuser1"));
	
		System.out.println(prop.getProperty("getattribute(\"TEXT\")"));
		System.out.println("["+prop.getProperty("dbpassword")+"]");
		if(prop.getProperty("dbpassword")==null){
			System.out.println("We have got an empty value");
		System.out.println("["+prop.getProperty("dbpassword")+"]");
		}
		
		if (prop.getProperty("dbpassword")==null){
			System.out.println("We have got null value");	
		}
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

  }
}
