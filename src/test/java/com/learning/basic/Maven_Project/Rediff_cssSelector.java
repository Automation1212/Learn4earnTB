package com.learning.basic.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_cssSelector {
public static WebDriver driver;
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.rediff.com/");
driver.findElement(By.cssSelector("a[class=signin]")).click();
driver.findElement(By.cssSelector("input[id=login1][name=login]")).sendKeys("seleniumpanda@rediffmail.com");

		
	}

}
