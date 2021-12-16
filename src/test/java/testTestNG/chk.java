package testTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chk {

	public static WebDriver driver;
	//static chk softassert = new chk();
	static SoftAssert softassert = new SoftAssert();

	@Test
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		
		System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		softassert.assertEquals(actualTitle, expectedTitle);
		softassert.assertAll();
		
	}
	
	
	
}
