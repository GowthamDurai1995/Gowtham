package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class FbTask extends LibGlobal{
	public static void main(String[] args) throws IOException {
		FbTask f = new FbTask();
		
		f.browserConfigChrome();
		f.openUrl("https://www.facebook.com/");
		f.maximizeWindow();
		f.implicitWait();
		
		WebElement txtUserName = f.locateById("email");
		f.inputText(txtUserName, f.excelRead("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\frameworkclassone\\\\Excel\\\\AdactinTask.xlsx", "FBTask", 1, 0));
		
		WebElement txtPassword = f.locateById("pass");
		f.inputText(txtPassword, f.excelRead("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\AdactinTask.xlsx", "FBTask", 1, 1));
		
		WebElement btnLogin = f.locateByName("login");
		f.click(btnLogin);
	
	}
}
