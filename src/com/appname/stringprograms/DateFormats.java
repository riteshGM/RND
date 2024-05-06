package com.appname.stringprograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormats {

	public static void main(String[] args) {
		//Month-Date-Year
		String monthdateFormat = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat =
				new SimpleDateFormat(monthdateFormat);
		String monthDate = simpleDateFormat.format(new Date());
		System.out.println(monthDate); 
		//Date-Month-Year
		String datemonthFormat = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat1 = 
				new SimpleDateFormat(datemonthFormat);
		String dateMonth = simpleDateFormat1.format(new Date());
		System.out.println(dateMonth); 
		//Year-Month-Date
		String yearFormat = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat2 = 
				new SimpleDateFormat(yearFormat);
		String year = simpleDateFormat2.format(new Date());
		System.out.println(year); 
	}
}
