package org.jsonFile;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APITask {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader ("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\src\\test\\resources\\JSONFile\\APITesting.JSON");
		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(reader);
		JSONObject obj1 = (JSONObject) obj;
		Object objdata = obj1.get("data");
		JSONArray a = (JSONArray) objdata;
		for (int i = 0; i < a.size(); i++) {
			Object eachobjectdata = a.get(i);
		JSONObject jEachDetails = (JSONObject) eachobjectdata;
		System.out.println("Id:" + (jEachDetails.get("id")));
		System.out.println("Email:" + (jEachDetails.get("email")));
		System.out.println("Firstname:" + (jEachDetails.get("first_name")));
		System.out.println("Lastname:" + (jEachDetails.get("last_name")));
		System.out.println("Avatar:" + (jEachDetails.get("avatar")));
		System.out.println("------------------------------------------------------------------------");	
		}
	}
}
