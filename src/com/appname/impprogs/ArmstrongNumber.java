package com.appname.impprogs;

import java.util.ArrayList;

public class ArmstrongNumber {
	public static void checkArmstrongNumberInFromToRange(int from, int to){
		//int lastDigit = number%10;
		ArrayList <Integer> list = new ArrayList <Integer>();
		for (int i = from ; i<=to ; i++){
			
			int temp = 0;
			int remainingNum = i;
			int armstrongSum = 0;
			System.out.println("==================== Check if "+i+" is Armstrong ===========================");
			
			while(remainingNum>0){
				temp=remainingNum%10;
				System.out.println("Temp:"+temp);
			armstrongSum = armstrongSum + temp*temp*temp;
			System.out.println("Armstrong Sum"+armstrongSum);
			remainingNum = remainingNum/10;
			System.out.println("Remaining Number"+remainingNum);
			}
				if (armstrongSum == i){
					System.out.println("==================== Number ["+i+"] is Armstrong Number ==============================");
			list.add(i);
			}else{
				System.out.println("================ Number ["+i+"] is not Armstrong Number ==========================");
			}
		}	
		
		if(!list.isEmpty()){
			System.out.println("List of Armstrong between "+from+" to "+to+" is "+list);
		}
	
	}
	
	public static void checkArmstrongNumberInRange(int number){
		//int lastDigit = number%10;
		ArrayList <Integer> list = new ArrayList <Integer>();
		for (int i = 1 ; i<=number ; i++){
			
			int temp = 0;
			int remainingNum = i;
			int armstrongSum = 0;
			System.out.println("==================== Check if "+i+" is Armstrong ===========================");
			
			while(remainingNum>=1){
				temp=remainingNum%10;
				System.out.println("Temp:"+temp);
			armstrongSum = armstrongSum + temp*temp*temp;
			System.out.println("Armstrong Sum"+armstrongSum);
			remainingNum = remainingNum/10;
			System.out.println("Remaining Number"+remainingNum);
			}
				if (armstrongSum == i){
					System.out.println("==================== Number ["+i+"] is Armstrong Number ==============================");
			list.add(i);
			}else{
				System.out.println("================ Number ["+i+"] is not Armstrong Number ==========================");
			}
		}	
		
		if(!list.isEmpty()){
			System.out.println("List of Armstrong between 1 to "+number+" is "+list);
		}
	
	}
	
	public static void checkArmstrongNumber(int number){
			int temp = 0;
			int remainingNum = number;
			int armstrongSum = 0;
			System.out.println("==================== Check if "+number+" is Armstrong ===========================");
			
			while(remainingNum>=1){
				temp=remainingNum%10;
				System.out.println("Temp:"+temp);
			armstrongSum = armstrongSum + temp*temp*temp;
			System.out.println("Armstrong Sum"+armstrongSum);
			remainingNum = remainingNum/10;
			System.out.println("Remaining Number"+remainingNum);
			}
				if (armstrongSum == number){
					System.out.println("==================== Number ["+number+"] is Armstrong Number ==============================");
			}else{
				System.out.println("================ Number ["+number+"] is not Armstrong Number ==========================");
			}
		}	
		

	

	
	public static void main (String args []){
		checkArmstrongNumber(370);
		checkArmstrongNumber(371);
		checkArmstrongNumber(372);
		//checkArmstrongNumberInRange(300);
		//checkArmstrongNumberInFromToRange(400, 500);
	}

}
