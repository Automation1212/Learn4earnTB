package com.learning.basic.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediffmail_Excersice {
 public static WebDriver driver;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.rediff.com/");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.name("namea17f152d")).sendKeys("testtest");


		
		
		
		
	}

}
