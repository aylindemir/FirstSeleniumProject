package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/aylin/Documents/Selenium Dependencies/drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.cybertekschool.com");

	
	}
}

