package testNG;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups = "Retest")
	public void tc100() {
		System.out.println("100");
	}
	@Test(groups = "Regression")
	public void tc200() {
		System.out.println("200");
	}
	@Test(groups="Sanity")
	public void tc300() {
		System.out.println("300");
	}

}
