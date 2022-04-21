package org.testNG;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority = -3)
	public void tc1() {
		System.out.println("TC1...");
	}
	@Test(priority=1)
	public void tc2() {
		System.out.println("TC2....");
	}
	@Test(priority=-2)
	public void tc3() {
		System.out.println("TC3...");
	}
	@Test(priority=4)
	public void tc4() {
		System.out.println("TC4...");
	}
	@Test(priority=2)
	public void tc5() {
		System.out.println("TC5...");
	}
}
