package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonPages;

import io.github.bonigarcia.wdm.WebDriverManager;  

public class TestBase {
	
	AmazonPages pages;
	WebDriver driver;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(String Browser, String Url) {
		
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		pages=new AmazonPages(driver);
		driver.manage().window().maximize();
		driver.get(Url);
		
	}
	
	/*
	 * @AfterClass public void TearDown() { driver.close(); }
	 */
	
}
