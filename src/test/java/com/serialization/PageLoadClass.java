package com.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PageLoadClass {

	public static void main(String[] args) {
		
		Status st=new Status("Microsoft");
		ForStatusVisible vis=new ForStatusVisible(st);
		//PageLoadClass pg=new PageLoadClass();
		
		ObjectMapper mapper=new ObjectMapper();
		try {
		String names=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vis);
		System.out.println(names);
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}
