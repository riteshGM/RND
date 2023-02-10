package com.appname.opps;

public class BaseParent {
	
	private String ritesh;
	String defaultRitesh;
	protected String protectedRitesh;
	public String publicRitesh;
	
	boolean status;
	String Country;
	
	BaseParent() {
		ritesh="Private Member from Inheritance Class";
		defaultRitesh = "Default Member Set";
		protectedRitesh = "Protected Member Set";
		publicRitesh = "Public Member Set";	
		status = true;
		Country = "India";
	}
	
	public void getVariable(){
		System.out.println("Printing getVariable() from Inheritance");
	}
	
	public String getCountry() {
		return Country;
	}
	
	
	}
