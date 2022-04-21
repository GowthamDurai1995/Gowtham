package org.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore1 {
	@Test(priority = -3)
	public void tc1() {
		System.out.println("TC1...");
	}
	@Test(priority=1)
	public void tc2() {
		System.out.println("TC2....");
	}
	//InvocationCount
	@Test(priority=-2, invocationCount = 5)
	public void tc3() {
		System.out.println("TC3...");
	}
	//Alternative method for Ignore
	@Test(priority=4, enabled=false)
	public void tc4() {
		System.out.println("TC4...");
	}
	//Ignore
	@Ignore
	@Test(priority=2)
	public void tc5() {
		System.out.println("TC5...");
	}

}
