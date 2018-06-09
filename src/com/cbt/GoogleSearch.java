package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/aylin/Documents/Selenium Dependencies/drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.etsy.com/search?q=wooden%20spoon");

	}

}
