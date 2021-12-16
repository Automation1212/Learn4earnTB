package com.learning.basic.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Test_Print {
	private static final String ActualTittle = null;
	public static WebDriver driver;

	public static void main(String[] args) {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.rediff.com/");
  System.out.println(driver.getCurrentUrl());
  System.out.println(driver.getTitle()); 
		String ActualUrl = "https://www.rediff.com/";
		String  ExpectedUrl = driver.getCurrentUrl();
		String ActualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping\n";
		String ExcpectedTittle = driver.getTitle();
		
		if (ActualUrl.equals(ExpectedUrl)) {
			System.out.println("this is correct URL");}
			else {
				System.out.println("this is spam URL");
			}
		
		
		if (ActualUrl.equals(ExpectedUrl) && ActualTitle.equals(ExcpectedTittle)) {
			System.out.println("this is real website");
		} else 
		{
			System.out.println("This is fake website");
		}
		

WebElement signinlink = driver.findElement(By.xpath("//a[@class='signin']"));
 
System.out.println(signinlink.isDisplayed());
System.out.println(signinlink.isEnabled());
System.out.println(signinlink.isSelected());

boolean b1 = signinlink.isDisplayed();
boolean b2 = signinlink.isEnabled();

if (b1==true && b2==true) {
	driver.findElement(By.xpath("//a[@class='signin']")).click();
} else {
	System.out.println("this link doesnt work");
}
		
WebElement KeepMeSignIn = driver.findElement(By.id("remember"));
boolean b3 = KeepMeSignIn.isSelected();

if (b3 ==true) {
	System.out.println("Is Checked");
}else {
	System.out.println("unchecked");
}
		
		
		
		
		
		
	}

}
