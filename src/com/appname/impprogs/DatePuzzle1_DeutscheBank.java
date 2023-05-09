package com.appname.impprogs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Check If a Date is between Given Date Range
 * @author rites
 *
 */
public class DatePuzzle1_DeutscheBank {

	// First Way Using compareTo() of Date Class
	public void checkDate(String startDate, String endDate, String inputDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(startDate);
		Date d2 = sdf.parse(endDate);
		System.out.println("Start Date is " + startDate);
		System.out.println("End Date is " + endDate);
		Date d3 = sdf.parse(inputDate);
		System.out.println("Input Date is " + sdf.format(d3));
		if (d3.compareTo(d1) >= 0 && d3.compareTo(d2) <= 0) {
			System.out.println("Date: " + inputDate + " is between Range");
		} else {
			System.out.println("Date: " + inputDate + " is not between Range");
		}
	}

	// Second Way Using before(Date dte) and after(Date dte) methods of Date Class
	public void checkDate2(String startDate, String endDate, String inputDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(startDate);
		Date d2 = sdf.parse(endDate);
		System.out.println("Start Date is " + startDate);
		System.out.println("End Date is " + endDate);
		Date d3 = sdf.parse(inputDate);
		System.out.println("Input Date is " + sdf.format(d3));
		if (d3.after(d1) && d3.before(d2) || d3.equals(d1) || d3.equals(d2)) {
			System.out.println("Date: " + inputDate + " is between Range");
		} else {
			System.out.println("Date: " + inputDate + " is not between Range");
		}
	}

	public static void main(String[] args) throws ParseException {

		new DatePuzzle1_DeutscheBank().checkDate("2023-05-13", "2023-12-31", "2023-05-13");
		new DatePuzzle1_DeutscheBank().checkDate2("2023-05-13", "2023-12-31", "2023-06-13");
	}

}
