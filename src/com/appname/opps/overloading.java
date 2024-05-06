package com.appname.opps;

public class overloading{
	public static void main(String[] args) {
		Abc obj = new Demo();
		obj.disp();

	}
}


class Abc {

	//Overridden method
	public void disp()
	{
		System.out.println("disp() method of parent class");
	}	   
}
class Demo extends Abc{
	//Overriding method
	public void disp(){
		System.out.println("disp() method of Child class");
	}
	public void newMethod(){
		System.out.println("new method of child class");
	}
}





