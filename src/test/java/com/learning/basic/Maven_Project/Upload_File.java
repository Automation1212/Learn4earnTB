package com.learning.basic.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {
	public static WebDriver driver;
	public static ChromeOptions options = new ChromeOptions();
	public static Select select;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  
		  options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		  options.addArguments( "--start-fullscreen");
		  options.addArguments("--incognito");
		  driver= new ChromeDriver(options);
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).click();
		//sendKeys("/Users/gurjeetsandhu/Documents/Test_Test");
		
		
		
		
		
		
	}

}
