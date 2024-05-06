package com.appname.stringprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class SampleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss"); 
		
		Date date= new Date();
		
		String currdate=dateformat.format(date);
		System.out.println(currdate);
		
	}

}
