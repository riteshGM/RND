package com.appname.stringprograms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import freemarker.template.SimpleDate;

public class DatePlusNextValue {
	
	public static void main(String args[]) {
		
		
		String dateBefore = "26-07-2024";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYY");
	
		
		
		Calendar calender = Calendar.getInstance();
		
		try {
			calender.setTime(sdf.parse(dateBefore));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Current Date Given "+sdf.format(calender.getTime()));
		calender.add(Calendar.DAY_OF_WEEK,3);
		String dateCalculated = sdf.format(calender.getTime());
		
		
		System.out.println("New Date after 3 days is "+dateCalculated);
	}

}
