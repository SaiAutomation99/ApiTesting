package com.selerizationPractise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoSerilization {
	
	public Fields getFields() {
		return fields;
	}

	public void setFields(Fields fields) {
		this.fields = fields;
	}

	Fields fields;
	
	public DemoSerilization(Fields fields) {
		this.fields=fields;
		
	}
	
	}
	
	


