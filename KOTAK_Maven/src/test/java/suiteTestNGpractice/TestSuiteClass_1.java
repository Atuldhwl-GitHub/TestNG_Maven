package suiteTestNGpractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuiteClass_1 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite - Test Suite 1");
	}

	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test - Test Suite 1");
	}

	@BeforeClass 
	public void beforeclass() {
		System.out.println("Before Class - Test Suite 1");
	}
	
	@BeforeMethod 
	public void beforemethod() {
		System.out.println("Before Method - Test Suite 1");
	}
	
	@Test (priority = 1 )
	public void test1() {
		System.out.println("Test Case 1 - Test Suite 1");
//		Assert.fail(); // it is used to fail a test menthod
	}
	
	@Test (priority = 2 )//, enabled = false)
	public void test2() {
		System.out.println("Test Case 2 - Test Suite 1");
	}
	
	@Test (invocationCount = 1 , timeOut = 2000)
	public void test3() throws InterruptedException {
		System.out.println("Test Case 3 - Test Suite 1");
//		Thread.sleep(2500);
	}
	
	@Test //(dependsOnMethods = {"test1"})
	public void test4() {
		System.out.println("Test Case 4 - Test Suite 1");
	}
	
	@AfterMethod 
	public void aftermethod() {
		System.out.println("After Method - Test Suite 1");
	}
	
	@AfterClass 
	public void afterclass() {
		System.out.println("After Class - Test Suite 1");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After Test - Test Suite 1");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite - Test Suite 1");
	}

}
