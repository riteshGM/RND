package com.appname.impprogs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
		
		char[] ch=str1.toCharArray();
		
		System.out.println(ch);
		
		String str2=str1.replaceAll("\\s", "");
		System.out.println(str2);
		
		for(int i=0;i<ch.length;i++) {
			if((ch[i]!=' ') && (ch[i]!='\t')) {
				System.out.print(ch[i]);
			}
		}
	}

}
