package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	@Parameters({ "email", "pass" })
	@Test
	public void tc1(@Optional("abc@gmail.com") String email, @Optional("123") String pass) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys(email);

		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}
}
