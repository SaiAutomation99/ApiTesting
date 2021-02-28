package BarrerToken;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveAuthProvider;
import io.restassured.authentication.PreemptiveOAuth2HeaderScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TokenGenerator {
	
	
	@Test
	public void tokenGenerator() {
		
		RestAssured.baseURI="https://api.github.com/user/repos";
		
	PreemptiveOAuth2HeaderScheme auth=new PreemptiveOAuth2HeaderScheme();
	auth.setAccessToken("3ed3add9b895c18f9cf4fea4d97a440060cb46a5");
	RestAssured.authentication=auth;
		
		RequestSpecification specification=RestAssured.given();
		
		//specification.header("content-Type","Application/json");
		
		
		
		//specification.header("Bearer Token", "3ed3add9b895c18f9cf4fea4d97a440060cb46a5");
		
		
		Response response=specification.request(Method.GET);
		
		System.out.println(response.getBody().asString().toString());
		
		
		System.out.println(response.getStatusCode());
		
		
		
		
	}

}
