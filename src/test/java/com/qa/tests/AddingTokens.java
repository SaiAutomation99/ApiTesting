package com.qa.tests;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class AddingTokens {
	
	public Response res;
	@Test
	public void addingToken() {
		String value="https://jsonplaceholder.typicode.com/posts";
		
		String h="https://jsonplaceholder.typicode.com/todos/1";
		RestAssured.baseURI=value;
		RequestSpecification spe=RestAssured.given();
		
		 res=spe.request(Method.GET);
		
		
		//ResponseBody body=res.getBody();
		String str=res.getBody().asString();
		System.out.println("=="+str);
		
		
		//JSONObject object=new JSONObject(str);
		
		JSONArray array=new JSONArray(str);
		System.out.println(array.length());
		
		JSONObject object=new JSONObject(array.get(1).toString());
		String name=object.get("id").toString();
		
		Assert.assertEquals(2, 2);
		
		System.out.println(name);
		
		//String a=obj.get("userId").toString();
		//System.out.println(a);
		
		System.out.println(res.getStatusCode());
		
		headergetting();
		
		
	}
	public void headergetting() {
		
		Headers head=res.headers();
		
		for (Header header : head) {
			System.out.println(header.getName());
			System.out.println(header.getValue());
			
		}
		
		
	}

}
