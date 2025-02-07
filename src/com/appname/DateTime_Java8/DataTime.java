package com.appname.DateTime_Java8;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time = LocalTime.now();
		 DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm a");
		System.out.println(time.format(format));
		
	}

}
