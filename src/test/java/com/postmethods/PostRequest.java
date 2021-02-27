package com.postmethods;

import javax.management.RuntimeErrorException;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {


	@Test
	public void postrequest() {


		int statuscode=postRequest();

		if(statuscode==201) {

			Assert.assertEquals(201, 201);

		}else {

			throw new RuntimeErrorException(null);
		}

	}



	public int postRequest() {

		String post="https://jsonplaceholder.typicode.com/posts";

		RestAssured.baseURI=post;
		RequestSpecification request=RestAssured.given();

		org.json.simple.JSONObject obj=new org.json.simple.JSONObject();

		obj.put("userId", "818");
		obj.put("id", "818");
		obj.put("title", "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
		obj.put("body", "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");

		request.body(obj.toJSONString());

		request.header("content-type", "application/json");

		Response res=request.request(Method.POST);

		System.out.println(res.getStatusCode());
		
		System.out.println("restassured");



		return res.getStatusCode();


	}



	//	 "userId": 1,
	//	    "id": 1,
	//	    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
	//	    "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}
