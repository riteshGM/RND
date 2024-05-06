package com.appname.impprogs;

public class VowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels=0,consonents=0,digits=0,spaces=0;
		
		String text= "This is Automation test Engineer 0446";
		
		for(int i=0;i<text.length();i++) {
			
			char c=text.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				
				vowels++;
			}
			else if(c>='a' && c<= 'z') {
				consonents++;
			}
			else if(c>='0' && c<='9') {
			digits++;
			}
			else if(c==' ') {
				spaces++;
			}

	}
		System.out.println(vowels);
		System.out.println(consonents);
		System.out.println(digits);
		System.out.println(spaces);
}
}
