package org.testNG;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Browser launch");
	}
	@BeforeMethod
	public void beforeEachMethod() {
		Date d = new Date();
		System.out.println("Start time:" + d);
	}
	@AfterMethod
	public void afterEachMethod() {
		Date d = new Date();
		System.out.println("End time:"+d);
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Close browser");
	}
	@Test
	public void pu() {
		System.out.println("Test case");
	}
}
