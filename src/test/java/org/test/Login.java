package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends LibGlobal{
	public Login() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id="username")
		private WebElement txtEmail;
		
		
		@FindBy(id="password")
		private WebElement txtPassword;
		@FindBy(name="login")
		private WebElement btnLogin;
		@FindBy(id="location")
		private WebElement selectLocation;
		@FindBy(id="hotels")
		private WebElement hotelName;
		@FindBy(id="room_type")
		private WebElement roomType;		
		@FindBy(id="room_nos")
		private WebElement roomNum;
		@FindBy(id="adult_room")
		private WebElement adultRoomNum;
		@FindBy(id="child_room")
		private WebElement childRoomNum;
		@FindBy(xpath="//input[@value='Search']")
		private WebElement btnSearch;
		@FindBy(xpath="//input[@name='radiobutton_0']")
		private WebElement btnRadioButton;
		@FindBy(xpath="//input[@name='continue']")
		private WebElement btnContinue;
		@FindBy(name="first_name")
		private WebElement firstName;
		@FindBy(name="last_name")
		private WebElement lastName;
		@FindBy(name="address")
		private WebElement address;
		@FindBy(name="cc_num")
		private WebElement ccNum;
		@FindBy(name="cc_type")
		private WebElement ccType;
		@FindBy(name="cc_exp_month")
		private WebElement ccExpMonth;
		@FindBy(name="cc_exp_year")
		private WebElement ccExpYear;
		@FindBy(name="cc_cvv")
		private WebElement ccCVV;
		@FindBy(name="book_now")
		private WebElement btnbook;
		public WebElement getTxtEmail() {
			return txtEmail;
		}
		public WebElement getTxtPassword() {
			return txtPassword;
		}
		public WebElement getBtnLogin() {
			return btnLogin;
		}
		public WebElement getSelectLocation() {
			return selectLocation;
		}
		public WebElement getHotels() {
			return hotelName;
		}
		public WebElement getRoomType() {
			return roomType;
		}
		public WebElement getRoomNum() {
			return roomNum;
		}
		public WebElement getAdultRoomNum() {
			return adultRoomNum;
		}
		public WebElement getChildRoomNum() {
			return childRoomNum;
		}
		public WebElement getBtnSearch() {
			return btnSearch;
		}
		public WebElement getBtnRadioButton() {
			return btnRadioButton;
		}
		public WebElement getBtnContinue() {
			return btnContinue;
		}
		public WebElement getFirstName() {
			return firstName;
		}
		public WebElement getLastName() {
			return lastName;
		}
		public WebElement getAddress() {
			return address;
		}
		public WebElement getCcNum() {
			return ccNum;
		}
		public WebElement getCcType() {
			return ccType;
		}
		public WebElement getCcExpMonth() {
			return ccExpMonth;
		}
		public WebElement getCcExpYear() {
			return ccExpYear;
		}
		public WebElement getCcCVV() {
			return ccCVV;
		}
		public WebElement getBtnbook() {
			return btnbook;
		}
		
		
		
}
