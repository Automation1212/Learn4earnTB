package testng_Fundamentals;

import org.testng.annotations.Test;

public class Setting_Proiority {

	// priority goes which integers like if number is more negative
	//get more priority.
	//example= priority =-1, priority =0,priority =1, priority =3
	//over here -1 priority has most priority after that 0, 1, 2, 3
	
	// if we didnt set priority program will assume it as a zero 
	
	
	
	@Test(priority =4)
	public void testcase1() {
		System.out.println("This is test case 1");
	}
	
	
	@Test(priority =3)
	public static void testcase2()	{
		System.out.println("This is test case 2");
	}
	

	@Test(priority =8)
	public void testcase3() {
		System.out.println("This is test case 3");
	}
	
	
	@Test(priority =1)
	public static void testcase4()	{
		System.out.println("This is test case 4");
	}
	

	@Test(priority =0)
	public void testcase5() {
		System.out.println("This is test case 5");
	}
	
	
	@Test(priority =-1)
	public static void testcase6()	{
		System.out.println("This is test case 6");
	}
	
	
	
	
	
	
	
}
