package com.appname.impprogs;

public class PrintWithoutLoop {
	
	public void print(int n) {
		
		if(n<=10) {
			System.out.println(n);
			print(n+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrintWithoutLoop().print(1);
	}

}
