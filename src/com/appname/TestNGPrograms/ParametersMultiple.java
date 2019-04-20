package com.appname.TestNGPrograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersMultiple {
	   @Test()
	   @Parameters({"ritesh","surname"})
	   public void optionalParameterSample(@Optional("ritesh prints default") String kuchBhi, String value2) {
	      System.out.println("Inside functional() and checkintest() kuchBhi "+kuchBhi+" value2 "+value2);
	   }
	   
	   @Test()
	   /**
	    * if Parameter is passed from xml it has definitely be catched here.
	    * But is parameter is defined here it can be made optional to be passed from xml
	    * @param kuchBhi
	    */
	   @Parameters({"ritesh","surname"})
	   public void optionalParameterSample2(@Optional("ritesh prints default") String kuchBhi, @Optional("default2")String surname) {
	      System.out.println("Inside functional() and checkintest() kuchBhi "+kuchBhi+" value2 "+surname);
	   }
}
