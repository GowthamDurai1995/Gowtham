package org.jsonFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\src\\test\\resources\\JSONFile\\Sample.JSON");
		ObjectMapper mapper = new ObjectMapper();
		Employee e = mapper.readValue(file, Employee.class);
		int p = e.getPage();
		System.out.println(p);
		int pp = e.getPer_page();
		System.out.println(pp);
		int t = e.getTotal();
		System.out.println(t);
		int tp = e.getTotal_pages();
		System.out.println(tp);
		}
}