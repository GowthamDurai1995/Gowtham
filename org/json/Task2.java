package org.json;

import org.json.simple.JSONObject;
import org.pojo.LibGlobal;

public class Task2 extends LibGlobal{

	public static void main(String[] args) throws Exception {

		Task2 task2 = new Task2();
		
		String readerFilePath = "C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\src\\test\\resources\\JSONFiles\\TaskApr13.json";
		
		JSONObject jsonObject = task2.jsonReader(readerFilePath);
		
		System.out.println(jsonObject.get("page"));
		System.out.println(jsonObject.get("per_page"));
		System.out.println(jsonObject.get("total"));
		System.out.println(jsonObject.get("total_pages"));
		
		String[] mainKey = { "data", "support" };
		String[] key1 = { "id", "email", "first_name", "last_name", "avatar" };
		String[] key2 = { "url", "text" };

		task2.getValuesfromJSONArrayJSONObject(mainKey[0], key1, readerFilePath);
		task2.getValuesfromJSONObject(mainKey[1], key2, readerFilePath);

	}
}
