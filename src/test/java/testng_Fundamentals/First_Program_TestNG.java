package testng_Fundamentals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First_Program_TestNG {

//why TestNg act like exeuation engine ==> Because of certain annotations 	
//	@BeforeSuite > @BeforeTest > @BeforeMethod > @Test > @AfterMethod > @AfterClasss > AfterTest > @AfterSuite
	// @DataProvider
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is the before suite method");
	} 
	
	@AfterSuite
	public void afterSuite() {
	System.out.println("This is the after suite method");
	}	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is the before test method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is the after test method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is the before method");
	}
	
	@Test
	public void testcase() {
		System.out.println("This is test case");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is the after method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is the before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is the after class");
	}
	
	
	
}
