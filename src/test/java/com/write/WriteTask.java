package com.write;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteTask {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\src\\test\\resources\\JSONFile\\APITesting.JSON");
		ObjectMapper mapper = new ObjectMapper();
		
		ArrayList<DataPOJO> datapojodetails = new ArrayList<DataPOJO>();
		
		DataPOJO e1 = new DataPOJO(7, "michael.lawson@reqres.in", "Gowtham", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		DataPOJO e2 = new DataPOJO(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson",
				"https://reqres.in/img/faces/8-image.jpg");
		DataPOJO e3 = new DataPOJO(9, "tobias.funke@reqres.in", "Tobias", "Funke",
				"https://reqres.in/img/faces/9-image.jpg");
		DataPOJO e4 = new DataPOJO(10, "byron.fields@reqres.in", "Byron", "Fields",
				"https://reqres.in/img/faces/10-image.jpg");
		DataPOJO e5 = new DataPOJO(11, "george.edwards@reqres.in", "George", "Edwards",
				"https://reqres.in/img/faces/11-image.jpg");
		DataPOJO e6 = new DataPOJO(12, "rachel.howell@reqres.in", "Rachel", "Howell",
				"https://reqres.in/img/faces/12-image.jpg");
		
		datapojodetails.add(e1);
		datapojodetails.add(e2);
		datapojodetails.add(e3);
		datapojodetails.add(e4);
		datapojodetails.add(e5);
		datapojodetails.add(e6);
		
		SupportPOJO supportPOJO = new SupportPOJO("https://reqres.in/#support-heading",
				"To keep ReqRes free, contributions towards server costs are appreciated!");
		
		MainPOJO mainPOJO = new MainPOJO(2, 6, 12, 2, datapojodetails, supportPOJO);
		
		mapper.writeValue(file, mainPOJO);
			
	}
}
