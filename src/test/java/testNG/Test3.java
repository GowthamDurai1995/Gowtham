package testNG;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups="smoke")
	public void tc1() {
		System.out.println("1");
	}
	@Test(groups="Rerun")
	public void tc2() {
		System.out.println("2");
	}
	@Test(groups="Regression")
	public void tc3() {
		System.out.println("3");
	}
}
