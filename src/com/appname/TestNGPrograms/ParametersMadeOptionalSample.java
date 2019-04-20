package com.appname.TestNGPrograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersMadeOptionalSample {
	   @Test()
	   @Parameters("ritesh")
	   public void optionalParameterSample(@Optional("ritesh prints default") String kuchBhi) {
	      System.out.println("Inside functional() and checkintest() kuchBhi "+kuchBhi);
	   }
	   
	   @Test()
	   /**
	    * if Parameter is passed from xml it has definitely be catched here.
	    * But is parameter is defined here it can be made optional to be passed from xml
	    * @param kuchBhi
	    */
	   @Parameters("ritesh")
	   public void optionalParameterSample2(@Optional("ritesh prints default") String kuchBhi) {
	      System.out.println("Inside functional() and checkintest() kuchBhi "+kuchBhi);
	   }
}
