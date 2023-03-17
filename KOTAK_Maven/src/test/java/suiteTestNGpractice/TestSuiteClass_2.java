package suiteTestNGpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuiteClass_2 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite - Test Suite 2");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test - Test Suite 2");
	}
	
	@BeforeClass 
	public void beforeclass() {
		System.out.println("Before Class - Test Suite 2");
	}
	
	@BeforeMethod 
	public void beforemethod() {
		System.out.println("Before Method - Test Suite 2");
	}
	
	@Test
	public void testA() {
		System.out.println("Test Case A - Test Suite 2");
	}
	
	@Test
	public void testB() {
		System.out.println("Test Case B - Test Suite 2");
	}
	
	@Test
	public void testC() {
		System.out.println("Test Case C - Test Suite 2");
	}
	
	@Test
	public void testD() {
		System.out.println("Test Case D - Test Suite 2");
	}
	
	@AfterMethod 
	public void aftermethod() {
		System.out.println("After Method - Test Suite 2");
	}
	
	@AfterClass 
	public void afterclass() {
		System.out.println("After Class - Test Suite 2");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After Test - Test Suite 2");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite - Test Suite 2");
	}

}
