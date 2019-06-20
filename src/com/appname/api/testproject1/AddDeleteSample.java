package com.appname.api.testproject1;

import org.testng.annotations.Test;

import io.restassured.response.ResponseBodyData;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AddDeleteSample {

@Test
public void sampleGetTest(){
	
	    
	 /*   String originalText = "test";
	    String expectedMd5CheckSum = "098f6bcd4621d373cade4e832627b4f6";
	        
	    ResponseBodyData response = given().
	        param("text",originalText).
	    when().
	        get("http://md5.jsontest.com/jason").
	    then().
	        assertThat().
	        
	       // body("md5",equalTo(expectedMd5CheckSum)).
	        extract().response();
	    
	    System.out.println(response.asString());*/
	    
	    
	/*    
	    
	    ResponseBodyData response = given().
	    		body("{\"name\":\"Ritesh\",\"salary\":\"123\",\"age\":\"23\"}").
		    when().
		        post("http://dummy.restapiexample.com/api/v1/create").
		    then().log().body().
		        extract().response();*/
	    
	    
	   // http://dummy.restapiexample.com/api/v1/update/21
	    	
	    	 ResponseBodyData responseChange = given().
	    		body("{\"name\":\"RiteshMansukhani\",\"salary\":\"123\",\"age\":\"23\"}").
		    when().
		        put("http://dummy.restapiexample.com/api/v1/update/11845").
		    then().log().body().
		        extract().response();
}

}
