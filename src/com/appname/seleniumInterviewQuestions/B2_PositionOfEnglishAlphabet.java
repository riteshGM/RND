package com.appname.seleniumInterviewQuestions;
import java.util.Scanner;

public class B2_PositionOfEnglishAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ASCII - A-> 65, a-> 97
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char givenChar = input.next().charAt(0);
		givenChar = Character.toLowerCase(givenChar);
		int asciiValue = (int) givenChar;
		System.out.println(asciiValue);
		
		int position =asciiValue-96;
		System.out.println(position);
	}

}
