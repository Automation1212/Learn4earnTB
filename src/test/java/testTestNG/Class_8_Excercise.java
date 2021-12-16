package testTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_8_Excercise {
public	static WebDriver driver;
 public static SoftAssert softassert = new SoftAssert();
 public static ChromeOptions options = new ChromeOptions();
  @BeforeTest(alwaysRun=true)
  public static void lauchBrowser() {
	  WebDriverManager.chromedriver().setup();

	 options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
options.addArguments("--start-maximized");

options.addArguments("--incognito");
driver =new ChromeDriver(options);
  }
	  
@Test(priority=0, alwaysRun=true)
public static void getUrl() {
	  driver.get("https://www.rediff.com/");
System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  String ActualTittle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	  String ExpectedTittle = driver.getTitle();
	  String ActualUrl = "https://www.rediff.com/";
	  String ExpectedUrl = driver.getCurrentUrl();
	  
	  if (ActualTittle.equals(ExpectedTittle)) {
		  System.out.println("This is the correct Tittle");
	  }else {System.out.println("This is worng Tittle");}

	  softassert.assertEquals(ActualUrl, ExpectedUrl);
}

@Test(priority=1, alwaysRun=true)
public static void signinlink() {
	WebElement siginlink = driver.findElement(By.className("signin"));
		if (siginlink.isEnabled() && siginlink.isDisplayed()==true) {
	siginlink.click();
}else	{
 System.out.println("This link is not working");
}	
	
}

@Test(priority=2, alwaysRun=true)
public static void  userName() {
	Boolean username = driver.findElement(By.xpath("//input[@id='login1']")).isDisplayed();
Boolean tt=true;
	softassert.assertEquals(username , tt);
		
	driver.findElement(By.xpath("//input[@id='login1']")).click();

	softassert.assertAll();
}

@Test(priority=3,alwaysRun=true)
public static void quit() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Thread.sleep(1000);
	driver.quit();
}
}


