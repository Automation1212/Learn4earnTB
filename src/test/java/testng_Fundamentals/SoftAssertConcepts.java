package testng_Fundamentals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertConcepts {
public static WebDriver driver;
static SoftAssert softassert = new SoftAssert();

@BeforeTest
public static void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	System.out.println(driver.getTitle());
	
}

	


	
	
	
	
	
	
	
	
	
	
}
