package com.appname.impprogs;

import java.io.StringBufferInputStream;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "com%ibm%itestq%stepnav";
		String[] b= a.split("%");
		for (String each : b) {
			System.out.println(each);
		}
		
	}

}
