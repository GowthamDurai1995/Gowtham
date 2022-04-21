package org.test;

import java.io.IOException;

public class Adactin extends LibGlobal{
	public static void main(String[] args) throws IOException {
		Adactin ad = new Adactin();
		ad.browserConfigChrome();
		ad.openUrl("https://adactinhotelapp.com/");
		ad.maximizeWindow();
		ad.implicitWait();
		
		
	}
}
