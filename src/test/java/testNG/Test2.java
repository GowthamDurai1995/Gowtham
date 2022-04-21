package testNG;

import org.apache.poi.hpsf.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test2 {
@BeforeClass
public void beforeClass() {
System.out.println("Browser lanuch");
}
@BeforeMethod
public void beforemethod() {
	Date d = new Date();
System.out.println("Start time:"  + d);
}
@AfterMethod
public void aftermethod() {
Date d = new Date();
System.out.println("End time:" + d);
}
@AfterClass
public void afterclass() {
System.out.println("Cloase browser");
}
@Test
@Ignore
public void test1() {
System.out.println("TC1");
}
@Test(enabled=false)
public void test3() {
System.out.println("TC2");
}
@Test(invocationCount= 3)
public void test4() {
System.out.println("TC3");
}
}
