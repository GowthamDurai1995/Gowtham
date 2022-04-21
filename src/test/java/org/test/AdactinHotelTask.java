package org.test;


import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinHotelTask extends LibGlobal{
	public static void main(String[] args) throws InterruptedException, IOException {

		AdactinHotelTask a = new AdactinHotelTask();

		a.browserConfigChrome();
		a.openUrl("http://www.adactin.com/HotelApp/");
		a.maximizeWindow();
		a.implicitWait();

		WebElement txtUsername = a.locateByName("username");
		a.inputText(txtUsername, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 0));

		WebElement txtPassword = a.locateByName("password");
		a.inputText(txtPassword, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 1));

		WebElement btnLogin = a.locateByName("login");
		a.click(btnLogin);

		WebElement selectLocation = a.locateByName("location");
		a.selectOptionbyValue(selectLocation, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 2));

		WebElement hotelName = a.locateByName("hotels");
		a.selectOptionbyValue(hotelName, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 3));

		WebElement roomType = a.locateByName("room_type");
		a.selectOptionbyValue(roomType, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 4));

		WebElement roomNum = a.locateByName("room_nos");
		a.selectOptionbyText(roomNum, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 5));

		WebElement adultRoomNum = a.locateByName("adult_room");
		a.selectOptionbyText(adultRoomNum, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 6));

		WebElement childRoomNum = a.locateByName("child_room");
		a.selectOptionbyText(childRoomNum, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 7));

		WebElement btnSearch = a.locateByXpath("//input[@value='Search']");
		a.click(btnSearch);

		WebElement btnRadioButton = a.locateByXpath("//input[@name='radiobutton_0']");
		a.click(btnRadioButton);

		WebElement btnContinue = a.locateByXpath("//input[@name='continue']");
		a.click(btnContinue);

		WebElement firstName = a.locateByName("first_name");
		a.inputText(firstName, a.excelRead("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 8));

		WebElement lastName = a.locateByName("last_name");
		a.inputText(lastName, a.excelRead("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx",
				"Task", 1, 9));

		WebElement address = a.locateByName("address");
		a.inputText(address, a.excelRead("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx",
				"Task", 1, 10));

		WebElement ccNum = a.locateByName("cc_num");
		a.inputText(ccNum, a.excelRead("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx",
				"Task", 1, 11));

		WebElement ccType = a.locateByName("cc_type");
		a.selectOptionbyText(ccType, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 12));

		WebElement ccExpMonth = a.locateByName("cc_exp_month");
		a.selectOptionbyText(ccExpMonth, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 1, 13));

		WebElement ccExpYear = a.locateByName("cc_exp_year");
		a.selectOptionbyValue(ccExpYear, a.excelRead(
				"C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "Task", 12, 14));

		WebElement ccCVV = a.locateByName("cc_cvv");
		a.inputText(ccCVV, a.excelRead("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx",
				"Task", 1, 15));

		WebElement btnBook = a.locateByName("book_now");
		a.click(btnBook);
		
	}

}
