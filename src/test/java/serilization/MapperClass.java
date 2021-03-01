package serilization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperClass {

	public static void main(String[] args) throws JsonProcessingException {
		
		
		Serilization serial=new Serilization("task");
		
		ObjectMapper mapper=new ObjectMapper();
		String names=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(serial);
		
		System.out.println(names);

	}

}
