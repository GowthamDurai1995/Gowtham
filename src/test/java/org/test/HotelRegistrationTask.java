package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelRegistrationTask {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("AdactinTestID");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Test@01");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		WebElement ddnLocation = driver.findElement(By.id("location"));
		Select s = new Select(ddnLocation);
		s.selectByVisibleText("Paris");
		WebElement ddnHotels = driver.findElement(By.id("hotels"));
		Select h= new Select(ddnHotels);
		h.selectByVisibleText("Hotel Sunshine");
		WebElement ddnRoomType = driver.findElement(By.id("room_type"));
		Select r= new Select(ddnRoomType);
		r.selectByVisibleText("Super Deluxe");
		WebElement ddnNumberOfRooms = driver.findElement(By.id("room_nos"));
		Select n= new Select(ddnNumberOfRooms);
		n.selectByVisibleText("1 - One");
		WebElement indate = driver.findElement(By.id("datepick_in"));
		indate.sendKeys("31/03/2022");
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		outdate.sendKeys("01/04/2022");
		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
		Select a= new Select(adultsPerRoom);
		a.selectByVisibleText("2 - Two");
		WebElement childsPerRoom = driver.findElement(By.id("child_room"));
		Select c= new Select(childsPerRoom);
		c.selectByVisibleText("0 - None");
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys("Gowtham");
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys("Durai");
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("N0:30, ABC street, ABC.");
		WebElement creditcardNo = driver.findElement(By.id("cc_num"));
		creditcardNo.sendKeys("1234567890123456");
		WebElement creditcardType = driver.findElement(By.id("cc_type"));
		Select d= new Select(creditcardType);
		d.selectByVisibleText("Master Card");
		WebElement expDate = driver.findElement(By.id("cc_exp_month"));
		Select x= new Select(expDate);
		x.selectByVisibleText("January");
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select e= new Select(expYear);
		e.selectByVisibleText("2022");
		WebElement ccvNumber = driver.findElement(By.id("cc_cvv"));
		ccvNumber.sendKeys("123");
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();
			}
}
