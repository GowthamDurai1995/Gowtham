package org.json.write;

import java.io.File;
import java.util.ArrayList;

import org.json.write.Support;
import org.pojo.LibGlobal;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Task extends LibGlobal {

	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\src\\test\\resources\\JSONFiles\\Employee.json");
		ObjectMapper mapper = new ObjectMapper();

		ArrayList<EmpDetail> empDetails = new ArrayList<EmpDetail>();
		EmpDetail e1 = new EmpDetail(7, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
		EmpDetail e2 = new EmpDetail(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
		EmpDetail e3 = new EmpDetail(9, "tobias.funke@reqres.in", "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
		EmpDetail e4 = new EmpDetail(10, "byron.fields@reqres.in", "Byron", "Fields", "https://reqres.in/img/faces/10-image.jpg");
		EmpDetail e5 = new EmpDetail(11, "george.edwards@reqres.in", "George", "Edwards", "https://reqres.in/img/faces/11-image.jpg");
		EmpDetail e6 = new EmpDetail(12, "rachel.howell@reqres.in", "Rachel", "Howell", "https://reqres.in/img/faces/12-image.jpg");
			
		empDetails.add(e1);
		empDetails.add(e2);
		empDetails.add(e3);
		empDetails.add(e4);
		empDetails.add(e5);
		empDetails.add(e6);
		
		Support support = new Support("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
		
		Employee e = new Employee(2, 6, 12, 2, empDetails, support);
		mapper.writeValue(file, e);
	}

}
