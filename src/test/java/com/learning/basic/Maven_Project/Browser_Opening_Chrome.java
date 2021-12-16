package com.learning.basic.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Opening_Chrome {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://www.rediff.com/");
/*driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.className("signin")).click();
driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
driver.findElement(By.id("password")).sendKeys("Selenium@123");
driver.findElement(By.name("proceed")).click();
*/

WebElement siginlink = driver.findElement(By.className("signin"));
if (siginlink.isEnabled() && siginlink.isDisplayed()==true) {
siginlink.click();
}else	{
System.out.println("This link is not working");
}	






		
		 
	}

}
