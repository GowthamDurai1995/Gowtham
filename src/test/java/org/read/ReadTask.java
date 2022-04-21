package org.read;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadTask {
public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
	
	File file = new File("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\src\\test\\resources\\JSONFile\\APITesting.JSON");
	ObjectMapper mapper = new ObjectMapper();
	Employee1 e = mapper.readValue(file, Employee1.class);
	int page = e.getPage();
	System.out.println("Page:" + page);
	int per_page = e.getPer_page();
	System.out.println("Per_Page:" + per_page);
	int total = e.getTotal();
	System.out.println("Total:" + total);
	int total_pages = e.getTotal_pages();
	System.out.println("Total_Pages: " + total_pages);
	
	System.out.println("-----------------------------------------------------------");
	
	ArrayList<Employee> d = e.getData();
	for (Employee datum : d) {
		System.out.println("ID:" + datum.getId());
		System.out.println("Email:" + datum.getEmail());
		System.out.println("First name: " + datum.getFirst_name());
		System.out.println("Last name: " + datum.getLast_name());
		System.out.println("Avatar:" + datum.getAvatar());
		System.out.println("--------------------------------------------------------------");
	}
	
	Support s = e.getSupport();
	String url = s.getUrl();
	System.out.println("URL:" + url);
	String text = s.getText();
	System.out.println("Text:" + text);
	System.out.println("--------------------------------------------------------------");
}
}
