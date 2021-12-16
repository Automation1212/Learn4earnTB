package com.learning.basic.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Introduction {
public static WebDriver driver;

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.rediff.com/");
driver.findElement(By.linkText("Sign in")).click();
//driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[1]")).click();
driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
driver.findElement(By.xpath("//input[@name = 'proceed' and @class='signinbtn']")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("//b[text()='Rediff Home']")).click();
driver.findElement(By.xpath("//a[contains(@class, 'signin')]")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
