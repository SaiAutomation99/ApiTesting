package serilization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Fields {
	
	String name;
	Text text;
public Fields(String name) {
	
	this.name=name;
	this.text=text;
}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public static void main(String[] args) throws JsonProcessingException {
		
		
		//Text text=new Text("name2");
		
		Fields fields=new Fields("name1");
//		
//		ObjectMapper mapper=new ObjectMapper();
//		String names=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(fields);
//		System.out.println(names);
		
		
		

	}

}
