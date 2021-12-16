package chrome_Optionsconcepts;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_O {
 public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();

 
 public static void main(String[] args) {
WebDriverManager.chromedriver().setup();

ChromeOptions options = new ChromeOptions();
// options.setPageLoadStrategy(PageLoadStrategy.EAGER);     //to control the execution speed
options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
// options.setPageLoadStrategy(PageLoadStrategy.NONE);

		options.addArguments("--starts-maximized");
		options.addArguments("--incognito");
		
driver= new ChromeDriver(options);    //have to intsert object refernce from ChromeOptions
	
driver.get("https://amazon.ca");
	System.out.println(driver.getTitle());
	
	




	}

}
