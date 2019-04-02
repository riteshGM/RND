package com.appname.seleniumprograms;

import java.io.StringBufferInputStream;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "com.ibm.itestq.stepnav";
		String[] b= a.split("\\.");
		System.out.println(b[b.length-1]);
		
	}

}
