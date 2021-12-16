package com.learning.basic.Maven_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Opening_Firefox {
public static WebDriver driver;

	public static void main(String[] args) {
		
	WebDriverManager.firefoxdriver().setup();
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.youtube.com/");
	driver.quit(); 
	
		
		
	}

}
