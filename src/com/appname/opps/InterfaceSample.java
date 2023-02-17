package com.appname.opps;

public interface InterfaceSample {
public static final String dataMember="Ritesh";

int getName();

 default  void my_method() {
	System.out.println("Called from Default Method");
}
 
 default void My_method_2() {
	 System.out.println("Second Default Method");
 }
}
