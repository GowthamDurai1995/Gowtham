package org.json;

import org.pojo.LibGlobal;

public class Task1 extends LibGlobal{

	public static void main(String[] args) throws Exception {

		Task1 task1 = new Task1();

		String[] mainKey = { "data", "support" };
		String[] key1 = { "id", "email", "first_name", "last_name", "avatar" };
		String[] key2 = { "url", "text" };
		String readerFilePath = "C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\src\\test\\resources\\JSONFiles\\Sample.json";

		task1.getValuesfromJSONObject(mainKey[0], key1, readerFilePath);
		task1.getValuesfromJSONObject(mainKey[1], key2, readerFilePath);

	}
}