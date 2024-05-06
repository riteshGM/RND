package com.appname.stringprograms;

import org.apache.commons.lang3.StringUtils;

public class RemoveSpaceInAString {

	public static void main(String[] args) {
		String str1 = "   Java, world!   ";
		str1 = str1.trim();
		String str2 = "   Python, world!   ";
		str2 = str2.replaceAll("\\s+", "");
		String str3 = "   JavaScript, world!   ";
		str3 = StringUtils.deleteWhitespace(str3);
		System.out.println("Trim Method :"+ str1);
		System.out.println("ReplaceAll :" + str2); 
		System.out.println("Del2WhiteSpace :"+ str3); 
	}

}
