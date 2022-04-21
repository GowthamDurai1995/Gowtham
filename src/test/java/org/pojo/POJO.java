package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJO extends LibGlobal{

	public POJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	@FindBy(id = "password")
	private WebElement txtPassword;

	public WebElement getPassword() {
		return txtPassword;
	}

	@FindBy(name = "login")
	private WebElement btnlogin;

	public WebElement getLogin() {
		return btnlogin;
	}

	@FindBy(name = "location")
	private WebElement selectLocation;

	public WebElement getLocation() {
		return selectLocation;
	}

	@FindBy(name = "hotels")
	private WebElement hotelName;

	public WebElement getHotels() {
		return hotelName;
	}

	@FindBy(name = "room_type")
	private WebElement roomType;

	public WebElement getRoomType() {
		return roomType;
	}

	@FindBy(name = "room_nos")
	private WebElement roomNum;

	public WebElement getRoomNum() {
		return roomNum;
	}

	@FindBy(name = "adult_room")
	private WebElement adultRoomNum;

	public WebElement getAdultRoom() {
		return adultRoomNum;
	}

	@FindBy(name = "child_room")
	private WebElement childRoomNum;

	public WebElement getChildRoomNum() {
		return childRoomNum;
	}

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement btnSearch;

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement btnRadioButton;

	public WebElement getBtnRadio() {
		return btnRadioButton;
	}

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement btnContinue;

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	@FindBy(name = "first_name")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(name = "last_name")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(name = "address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(name = "cc_num")
	private WebElement ccNum;

	public WebElement getCCNum() {
		return ccNum;
	}

	@FindBy(name = "cc_type")
	private WebElement ccType;

	public WebElement getCCType() {
		return ccType;
	}

	@FindBy(name = "cc_exp_month")
	private WebElement ccExpMonth;

	public WebElement getCCExpMonth() {
		return ccExpMonth;
	}

	@FindBy(name = "cc_exp_year")
	private WebElement ccExpYear;

	public WebElement getCCExpYear() {
		return ccExpYear;
	}

	@FindBy(name = "cc_cvv")
	private WebElement ccCVV;

	public WebElement getCVV() {
		return ccCVV;
	}

	@FindBy(name = "book_now")
	private WebElement btnBook;

	public WebElement getBtnBookNow() {
		return btnBook;
	}

}
