package com.learning.basic.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_DropDown {
	public static WebDriver driver;
	public static ChromeOptions options = new ChromeOptions();
	public static Select select;
	

	public static void main(String[] args) throws InterruptedException {

		  WebDriverManager.chromedriver().setup();
		  
		  options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		  options.addArguments( "--start-fullscreen");
		  options.addArguments("--incognito");
		  driver= new ChromeDriver(options);
		
		  driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bye");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Hello@t4782");
		
		Thread.sleep(2000);
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Feb");
		
		
		select=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		select.selectByVisibleText("6");
		
		
		
		
		
		
		
		
	}

}


