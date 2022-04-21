package org.json;

import java.io.File;
import java.util.List;

import org.pojo.LibGlobal;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Task3 extends LibGlobal {

	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\src\\test\\resources\\JSONFiles\\Employee.json");
		ObjectMapper mapper = new ObjectMapper();
		Employee e = mapper.readValue(file, Employee.class);

		int page = e.getPage();
		int per_page = e.getPer_page();
		int total = e.getTotal();
		int total_pages = e.getTotal_pages();
		List<EmpDetail> empDetails = e.getEmpDetails();
		Support s = e.getSupport();

		System.out.println(page);
		System.out.println(per_page);
		System.out.println(total);
		System.out.println(total_pages);
		System.out.println("--------------------------");
		for (EmpDetail c : empDetails) {
			System.out.println(c.getId());
			System.out.println(c.getEmail());
			System.out.println(c.getFirst_name());
			System.out.println(c.getLast_name());
			System.out.println(c.getAvatar());
			System.out.println("--------------------------");
		}
		
		System.out.println(s.getText());
		System.out.println(s.getUrl());
	}

}
