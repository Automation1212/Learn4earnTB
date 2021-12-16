package testng_Fundamentals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Combination {

	@BeforeMethod 
	public void initialize() {
		System.out.println("This is the intialization method");
		
	}
	
	@Test 
	public void testcase1() {
		System.out.println("This is test case1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("This is test case2");
	}
	
	@Test
	public void testcase3() {
		System.out.println("This is test case3");
	}
	
	@AfterMethod 
	public void tearDown() {
		System.out.println("This is the tearDown method");
	}
	
	
	
	
	
	
	
	
	
	
	
}
