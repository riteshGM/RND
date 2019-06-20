package com.appname.api.testproject1;

import org.testng.annotations.Test;

import io.restassured.response.ResponseBodyData;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FirstScriptSample {

@Test
public void sampleGetTest(){
	
	    
	    String originalText = "test";
	    String expectedMd5CheckSum = "098f6bcd4621d373cade4e832627b4f6";
	        
	    ResponseBodyData response = given().
	        param("text",originalText).
	    when().
	        get("http://md5.jsontest.com/jason").
	    then().
	        assertThat().
	        
	       // body("md5",equalTo(expectedMd5CheckSum)).
	        extract().response();
	    
	    System.out.println(response.asString());
}

}
