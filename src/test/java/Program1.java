import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1{
	public static WebDriver driver;
@BeforeMethod
public static void begin() {
			WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	     driver.manage().window().maximize();
	   driver.get("https://www.rediff.com/");
		
		}

	@Test(priority=1)
	public static void signinClick () {
	 WebElement signinlink = driver.findElement(By.className("signin"));
		
		if (signinlink.isEnabled()==true ) {
			signinlink.click();
		}else {
			System.out.println("This link is not working");
		}
		
	}

	@Test(priority=2)
	public void loginPage() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.id("login1")).sendKeys("ifwijbvebg");
	}

	@AfterMethod
	public static void tearDown() {
		//driver.quit();
	}
		
		 
	
	
	
	
	
	
	
	
	
	
	
}