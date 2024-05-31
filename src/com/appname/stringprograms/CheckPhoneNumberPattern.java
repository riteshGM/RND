package com.appname.stringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CheckPhoneNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String number = "0721-2577553";
		
		List<String> list = Arrays.asList(
			"0721-2577553",
			"0072-25996533",
			"1721-2599553",
			"0722-257115",
			"0712-1512121",
			"07211-2577553",
			"0721_2577221"
		);
		
		String regex = "^0[0-9]{3}-25[0-9]{5}";
		
		for(String each : list) {
			System.out.println("Number "+each+" Matched Pattern - "+Pattern.matches(regex, each));
		}
	
	}
	

}
