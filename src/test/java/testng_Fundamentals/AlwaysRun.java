package testng_Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlwaysRun {

	@Test
	public void begin() {
		System.out.println("This is the begining part of it");
	}
	
	@Test(dependsOnMethods = "begin")
	public void mid() {
		System.out.println("This is the middle part of it ");
	}
	
	//enabled method is more powerful than alwaysRun method
	//if enabled = false means code will not be execute even though alwysRun is equal to true 
	
	
	
	@Test(enabled =true, dependsOnMethods= {"begin","mid"}, alwaysRun = true)
	public void end () {
		System.out.println("This is the end of it");
	}
	
}








