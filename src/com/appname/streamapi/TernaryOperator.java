package com.appname.streamapi;


public class TernaryOperator {

	public static void main(String[] args) {
		int a=756; int b=978; int c=391; int biggestNum =0;
		//result = condition ? trueCase : elseCase;
		// Nested ternary operator
		biggestNum = a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
				System.out.println("biggestNum = " + biggestNum);
		}

}
