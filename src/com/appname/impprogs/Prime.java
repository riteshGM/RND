package com.appname.impprogs;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=13;
		//2, 3, 5, 7, 11, 13
		boolean flag=false;
		for(int i=2;i<=number/2;i++) {
			
			if(number%i==0) {
				flag=true;
				break;
				//System.out.println("Not a Prime Number");
			}
		}
		
		if(!flag) {
			System.out.println(number +"  Number is a Prime Number");
		}
		else {
			System.out.println(number +"  Number is NOT a Prime Number");

	}

}
}
