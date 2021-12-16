package com.learning.basic.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link_Partiallink_Text {
public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.rediff.com/");
		//driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.partialLinkText("Create Ac")).click();
		
	   
	   
	   
	   
		
		
	}
	
	

}
