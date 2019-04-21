package com.appname.excel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyFileWriteOperation {
	public static final String PROPERTY_RESOURCE_PATH = System.getProperty("user.dir")+"\\src\\com\\appname\\resources\\excels";
	
	public static void main(String[] args) {

	        try (
	        	FileOutputStream output = new FileOutputStream(PROPERTY_RESOURCE_PATH+"\\sample.properties")) {
	            Properties prop = new Properties();
	            // set the properties value
	            prop.setProperty("db.url", "localhost");
	            prop.setProperty("db.user", "mkyong");
	            prop.setProperty("db.password", "password");
	            // save properties to project root folder
	            prop.store(output, null);
	            System.out.println(prop);
	            output.close();
	        } catch (IOException io) {
	            io.printStackTrace();
	        }

	    }


}
