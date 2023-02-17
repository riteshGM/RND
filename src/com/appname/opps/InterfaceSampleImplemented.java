package com.appname.opps;


public class InterfaceSampleImplemented implements InterfaceSample{

	
	@Override
	public int getName() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main (String args[]){
		System.out.println(dataMember);
		//Calling Default Mehtod
		new InterfaceSampleImplemented().my_method();
		new InterfaceSampleImplemented().My_method_2();
	}
}
