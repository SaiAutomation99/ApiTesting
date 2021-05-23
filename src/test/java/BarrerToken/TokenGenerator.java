package BarrerToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveAuthProvider;
import io.restassured.authentication.PreemptiveOAuth2HeaderScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TokenGenerator {
	
	
	@Test
	public void tokenGenerator() throws FileNotFoundException, IOException, ParseException {
		
//		RestAssured.baseURI="https://api.github.com/user/repos";
//		
//	PreemptiveOAuth2HeaderScheme auth=new PreemptiveOAuth2HeaderScheme();
//	auth.setAccessToken("3ed3add9b895c18f9cf4fea4d97a440060cb46a5");
//	RestAssured.authentication=auth;
//		
//		RequestSpecification specification=RestAssured.given();
//		
//		//specification.header("content-Type","Application/json");
//		
//		
//		
//		//specification.header("Bearer Token", "3ed3add9b895c18f9cf4fea4d97a440060cb46a5");
//		
//		
//		Response response=specification.request(Method.GET);
//		
//		System.out.println(response.getBody().asString().toString());
//		
//		
//		System.out.println(response.getStatusCode());
		
		
		
		
		JSONParser json=new JSONParser();
		Object obj=json.parse(new FileReader("C:\\Users\\saip3\\Music\\apitext.txt"));
		
	
		org.json.simple.JSONObject object=(org.json.simple.JSONObject)obj;
		System.out.println(object.toString());
		
		String name=object.get("name").toString();
		System.out.println(name);
		
		String post="https://jsonplaceholder.typicode.com/posts";

		RestAssured.baseURI=post;
		RequestSpecification request=RestAssured.given();

		request.body(object.toJSONString());

		request.header("content-type", "application/json");

		Response res=request.request(Method.POST);
		System.out.println(res.getStatusCode());
		
		BufferedWriter bf=new BufferedWriter(new FileWriter("C:\\Users\\saip3\\Music\\sample.txt"));
		bf.write(object.toJSONString());
		System.out.println("written");
		bf.flush();
		bf.close();
		
	}

}
