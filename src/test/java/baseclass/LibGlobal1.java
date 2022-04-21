package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal1 {
	static WebDriver driver;
	
	public void browserConfigChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public void openUrl(String url) {
		driver.get(url);
	}
	public void maximizeWindow() {
		
	}
}
