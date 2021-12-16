package testng_Fundamentals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependent_TestCases {

//By using dependsOnMethods we can depent other method on each other
// Example in this case is login test case get pass than only logic testcase will executed  and same for logout if login and logic test case get pass than only logout case will be executed 	
	
	@Test
	public void login() {
		
	}
	
	
	@Test(dependsOnMethods ="login")
	public void logic () {
	}
	
	@Test(dependsOnMethods= {"login", "logic"})
    public void logout() {
    	
    }
	
	
	
}
