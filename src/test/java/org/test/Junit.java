package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
static WebDriver driver;
@Before
public void chromelaunch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
@AfterClass
public static void quit() {
	driver.quit();
}
@Before
public void date() {
	Date d = new Date();
	System.out.println("Start time" + d);
}
@After
public void date1() {
	Date d = new Date();
	System.out.println("Start time" + d);
}
@After
public void close() {
driver.close();
}

@Test
public void username() {
	WebElement txtemail = driver.findElement(By.id("email"));
	txtemail.sendKeys("abc@gmail.com");
	WebElement txtpassword = driver.findElement(By.id("pass"));
	txtpassword.sendKeys("123");
}
@Test
public void username1() {
	WebElement txtemail = driver.findElement(By.id("email"));
	txtemail.sendKeys("abcd@gmail.com");
	WebElement txtpassword = driver.findElement(By.id("pass"));
	txtpassword.sendKeys("1234");
}
}
