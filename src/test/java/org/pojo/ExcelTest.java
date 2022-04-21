package org.pojo;

import java.io.IOException;

public class ExcelTest extends LibGlobal {

	public static void main(String[] args) throws IOException {
		
		int randomNumGenerator = new ExcelTest().randomNumGenerator("C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1");
		System.out.println(randomNumGenerator);
	}
}