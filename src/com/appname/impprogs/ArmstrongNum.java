package com.appname.impprogs;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp;
		int num=153;
		int c=0,a;
		temp=num;
		
		while(num>0) {
			a=num%10; //rem
			num=num/10; //quotient
			c=c+(a*a*a);
		}
		
		if(temp==c) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not an Armstrong");
		}
		

	}

}
