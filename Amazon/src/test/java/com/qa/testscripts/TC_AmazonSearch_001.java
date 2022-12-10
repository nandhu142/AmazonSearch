package com.qa.testscripts;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_AmazonSearch_001 extends TestBase {
	
	
		
		AmazonPages pages;
		
		@Test
		public void search() throws InterruptedException{
			pages=new AmazonPages(driver);
			/*
			 * Thread.sleep(5000); pages.SearchBox().sendKeys("Redmi note 11");
			 * Thread.sleep(5000); pages.MgnBtn().click(); Thread.sleep(5000);
			 */
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(5000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,15000)","" );
			Thread.sleep(6000);
			js.executeScript("window.scrollBy(0,-10000)","" );
			
		}
}


