package com.appname.api.twitter;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SampleTest {
	
	@Test
	public void getLastTweet(){
		
		String consumerKey = "UBPNkwwf1uEjqYyeKRnt88tiV";
		String consumerSecret = "9GqkMicjVYH87DqkFMLzdJtcR5HQrMuw3mbArjFlREIbrmNLLZ";
		String accessToken = "1140917918290464768-aiCqJ2wwyGVvODDKDJl8KNElwmpIZN";
		String secretToken = "VpqqcTcJkJIzskRdVK3Jy9oxMibyP8pBCX0YJPaIdWCnI";
		
		Response res = given().auth().oauth(consumerKey, consumerSecret, accessToken, secretToken).queryParam("count", 1)
		.when().get("https://api.twitter.com/1.1/statuses/home_timeline.json")
		.then().extract().response();
		
		//RAW Response to JSON
		System.out.println(res.asString());
		System.out.println(res.jsonPath().getString("text"));
		System.out.println(res.jsonPath().getString("id"));
	}
	
	@Test
	public void createTweet(){
		
		String consumerKey = "UBPNkwwf1uEjqYyeKRnt88tiV";
		String consumerSecret = "9GqkMicjVYH87DqkFMLzdJtcR5HQrMuw3mbArjFlREIbrmNLLZ";
		String accessToken = "1140917918290464768-aiCqJ2wwyGVvODDKDJl8KNElwmpIZN";
		String secretToken = "VpqqcTcJkJIzskRdVK3Jy9oxMibyP8pBCX0YJPaIdWCnI";
		
		Response res = given().auth().oauth(consumerKey, consumerSecret, accessToken, secretToken)
				.queryParam("status", "Created from REST Assured Script 2")
		.when().post("https://api.twitter.com/1.1/statuses/update.json")
		.then().extract().response();
		
		//RAW Response to JSON
		System.out.println(res.asString());
		System.out.println(res.jsonPath().getString("created_at"));
		System.out.println(res.jsonPath().getString("id"));
		System.out.println(res.jsonPath().getString("text"));
	}
	
	@Test
	public void deleteTweet(){
		
		String consumerKey = "UBPNkwwf1uEjqYyeKRnt88tiV";
		String consumerSecret = "9GqkMicjVYH87DqkFMLzdJtcR5HQrMuw3mbArjFlREIbrmNLLZ";
		String accessToken = "1140917918290464768-aiCqJ2wwyGVvODDKDJl8KNElwmpIZN";
		String secretToken = "VpqqcTcJkJIzskRdVK3Jy9oxMibyP8pBCX0YJPaIdWCnI";
		
		Response res = given().auth().oauth(consumerKey, consumerSecret, accessToken, secretToken)
		.when().post("https://api.twitter.com/1.1/statuses/destroy/1141663870697607169.json")
		.then().extract().response();
		
		//RAW Response to JSON
		System.out.println(res.asString());
		System.out.println(res.jsonPath().getString("created_at"));
		System.out.println(res.jsonPath().getString("id"));
		System.out.println(res.jsonPath().getString("text"));
	}
	

}
