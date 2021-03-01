package serilization;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FieldsNames {
	
	public Text text;
	public Fields field;

	
	public FieldsNames(Fields field, Text text) {
		//super();
		this.field = field;
		this.text = text;
	}

	public Fields getField() {
		return field;
	}




	public void setField(Fields field) {
		this.field = field;
	}




	public Text getText() {
		return text;
	}




	public void setText(Text text) {
		this.text = text;
	}




	
	public FieldsNames(Fields field) {
		
		this.field=field;
	}
	
	
	

	public static void main(String[] args) throws JsonProcessingException {
		
		Fields file=new Fields("name2");
		
		Text text=new Text("name2");
		
		FieldsNames names=new FieldsNames(file,text);
		ObjectMapper mapper=new ObjectMapper();
		String tetfileds=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(names);
		System.out.println(tetfileds);
		
		
		
		
		
		

	}

}
