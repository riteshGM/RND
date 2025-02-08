package com.appname.Features_Java17;

public  sealed class VehicleSealed permits Truck {
	
	public void manufacure(String type) {
		System.out.println(type+ "Manufactured");
	}

}
