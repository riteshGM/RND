package com.appname.excel;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyFileReadOperation {
	public static final String PROPERTY_RESOURCE_PATH = System.getProperty("user.dir")+"\\src\\com\\appname\\resources\\excels";
	
	public static void main(String[] args) {

	        try (
	        	FileInputStream input = new FileInputStream(PROPERTY_RESOURCE_PATH+"\\sample.properties")) {
	            Properties prop = new Properties();
	            prop.load(input);
	            // set the properties value
	            System.out.println(prop.getProperty("db.url"));
	            input.close();
	        } catch (IOException io) {
	            io.printStackTrace();
	        }

	    }


}
