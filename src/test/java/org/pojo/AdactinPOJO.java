package org.pojo;

import java.io.IOException;

public class AdactinPOJO extends LibGlobal {

	public static void main(String[] args) throws IOException {

		AdactinPOJO a = new AdactinPOJO();
		a.browserConfigChrome();
		a.openUrl("http://adactinhotelapp.com/");
		a.maximizeWindow();
		a.implicitWait();
		int randomRowNum = a.randomNumGenerator("C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1");
		POJO p = new POJO();
		
		a.inputText(p.getTxtUserName(), "WelcomeJava");

		a.inputText(p.getPassword(), "tigertiger");

		a.click(p.getLogin());

		a.selectOptionbyValue(p.getLocation(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 0));

		a.selectOptionbyValue(p.getHotels(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 1));

		a.selectOptionbyValue(p.getRoomType(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 2));

		a.selectOptionbyText(p.getRoomNum(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 3));

		a.selectOptionbyText(p.getAdultRoom(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 6));

		a.selectOptionbyText(p.getChildRoomNum(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 7));

		a.click(p.getBtnSearch());

		a.click(p.getBtnRadio());

		a.click(p.getBtnContinue());

		a.inputText(p.getFirstName(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 8));

		a.inputText(p.getLastName(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 9));

		a.inputText(p.getAddress(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 10));

		a.inputText(p.getCCNum(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 11));

		a.selectOptionbyText(p.getCCType(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 12));

		a.selectOptionbyText(p.getCCExpMonth(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 13));

		a.selectOptionbyText(p.getCCExpYear(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 14));

		a.inputText(p.getCVV(), a.excelRead(
				"C:\\Users\\gopir\\eclipse-workspace\\SeleniumMaven\\Datas\\question10.xlsx", "Sheet1", randomRowNum, 15));

		a.click(p.getBtnBookNow());
	}
}
