package com.learning.basic.Maven_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Alerts {
	public static WebDriver driver;
	public static ChromeOptions options = new ChromeOptions();
	public static Select select;
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  
		  options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		  options.addArguments( "--start-fullscreen");
		  options.addArguments("--incognito");
		  driver= new ChromeDriver(options);
		
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//alert.dismiss();      to cancel the alert 
		
		
		
		
		
	}

}
