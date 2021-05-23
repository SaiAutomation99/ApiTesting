package SerilizationDemo;

import java.util.ArrayList;
import java.util.Dictionary;

public class GetterandSettersArraylist {
	
	public ArrayList al;

	
	public ArrayList getAl() {
		return al;
	}

	public void setAl(ArrayList al) {
		this.al = al;
	}

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		
		GetterandSettersArraylist k=new GetterandSettersArraylist();
		k.setAl(al);
		
		System.out.println(k.getAl());
		System.out.println(k.al);
		
		
		
		
		
		
		

	}

}
