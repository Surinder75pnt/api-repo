package com.getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


// url https://reqres.in/api/users/2
public class FirstGetRequest {
	
	@Test
	void testcase01()
	{
		Response res= RestAssured.get("https://reqres.in/api/users/2");
		// now print that res asString
		System.out.println(res.asString());
		// print status code
		System.out.println(res.getStatusCode());
		
	}

}
