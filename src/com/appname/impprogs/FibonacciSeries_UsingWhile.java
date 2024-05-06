package com.appname.impprogs;

public class FibonacciSeries_UsingWhile {
	int num1 = 0;
	int num2 = 1;
	int count = 0;
	int N = 10;  // Get N Fibonacci Numbers
	public static void main(String[] args) {
		//Object Creation
	 FibonacciSeries_UsingWhile FS = new FibonacciSeries_UsingWhile();
	 // Method calling
	  FS.fibonacciSeries();
	}
	public void fibonacciSeries() {
		while (count < N) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			count++;
		}
	}
}
