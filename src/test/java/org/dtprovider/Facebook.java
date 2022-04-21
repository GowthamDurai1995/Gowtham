package org.dtprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	WebDriver driver;

	@BeforeMethod
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test(dataProvider = "sampleData")
	public void tc2(String email, String pass) {
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys(email);

		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys(pass);
	}

	@DataProvider(name = "sampleData")
	public Object [][]data() {
		return new Object[][] {
			{"user1", "test123"},
			{"user2", "test456"},
			{"user3", "test789"},
			{"user4", "test012"}
		};
}
	@AfterMethod
	public void tc3() {
		driver.close();
	}
}




