package testng_Fundamentals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	//Assertions are check points
	@Test
	public void parameterA() {
		String exOutput = "Hello";
		String actOutput = "Hello";
		
		Assert.assertEquals(exOutput, actOutput);
		//Assert.assertEquals(2>1, false);
		Assert.assertNotEquals(exOutput, actOutput);
		
		
	} 
	

	 
	

}
