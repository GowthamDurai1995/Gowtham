package org.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void tc1() {
		System.out.println(1);
	}
	@Test
	public void tc2() {
		System.out.println(2);
		Assert.assertTrue(false);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
	}
	@Test
	public void tc3() {
		System.out.println(8);
	}

}
