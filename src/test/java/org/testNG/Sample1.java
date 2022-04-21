package org.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample1 {
	@Test
	public void tc1() {
		System.out.println(1);
	}
	@Test
	public void tc2() {
		System.out.println(2);
		SoftAssert s = new SoftAssert();
		s.assertAll();
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
