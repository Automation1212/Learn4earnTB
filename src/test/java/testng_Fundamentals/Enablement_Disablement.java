package testng_Fundamentals;

import org.testng.annotations.Test;

public class Enablement_Disablement {
//By using the enable method we can decide to which program will execute 
//enabled = true means program will execute and enabled = false means program will not execute 
	
	
	
	@Test(enabled=true)
	public void login() {
		
	}
	
	
	@Test(enabled=true, dependsOnMethods ="login")
	public void logic () {
		
	}
	
	@Test(enabled=false, dependsOnMethods= {"login", "logic"})
    public void logout() {
    	
    }
}
