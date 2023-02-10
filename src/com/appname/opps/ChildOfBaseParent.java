package com.appname.opps;




public class ChildOfBaseParent extends BaseParent {
	String defaultRitesh = "In ChildOfBaseParent Class";
	
	String Country;
	
	int Age = 19;
	//Method Override
	public String getCountry() {
		return defaultRitesh;
	}
	
	
	
	/*public void getVariable(){
		System.out.println("getVariable() from B");
		
	}*/


}