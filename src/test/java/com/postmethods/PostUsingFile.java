package com.postmethods;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostUsingFile {
	
	
	@Test
	public void postFile() throws IOException {
		
		
		BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\saip3\\eclipse-workspace\\ApiTesting\\apitext"));
		
		String name=bf.readLine();
		
		String name1="";
		while(name!=null) {
			
			name1=name1+name;

			name=bf.readLine();
			
		}
		
		System.out.println(name1);
		
		JSONObject object=new JSONObject(name1);
		System.out.println(object.get("name"));
		
		
		
		
		
		
		
	}

}
