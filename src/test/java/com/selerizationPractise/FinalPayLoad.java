package com.selerizationPractise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalPayLoad {
	
public static void main(String[] args) throws JsonProcessingException {
		
		Projects project=new Projects("Text");
		IssueType type=new IssueType("name");
		Fields fields=new Fields("hello", "hai", project, type);
		DemoSerilization demo=new DemoSerilization(fields);
		
		ObjectMapper mapper=new ObjectMapper();
		String names=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(demo);
		
		System.out.println(names);
	

}
}
