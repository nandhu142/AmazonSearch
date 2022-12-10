package com.qa.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchLink_Autmoation {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = null;
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dharun R\\Downloads\\VIRTUSA\\Browser driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
		searchbox.sendKeys("Dominar 400 2022 review");
		searchbox.sendKeys(Keys.ENTER);
		
		String title = driver.getTitle();
		if(title.contains("Dominar 400")) {
			System.out.println("Passed Title test case");
		}
		else
			System.out.println("Test Case Failed");
		
		Thread.sleep(8000);
		
//		WebElement searchLink = driver.findElement(By.cssSelector("body.srp.EIlDfe:nth-child(2) div.main:nth-child(14) div.e9EfHf div.GyAeWb:nth-child(13) div.s6JM6d div.eqAnXb:nth-child(3) div.v7W49e div.hlcw0c:nth-child(1) div.MjjYud div.g.Ww4FFb.vt6azd.tF2Cxc div.kvH3mc.BToiNc.UK95Uc div.Z26q7c.UK95Uc.jGGQ5e:nth-child(1) div.yuRUbf a:nth-child(1) > h3.LC20lb.MBeuO.DKV0Md:nth-child(2)"));
//		searchLink.click();
		
		WebElement UtubeReview = driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/video-voyager[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[3]"));
		UtubeReview.click();
		
		Thread.sleep(8000);
		driver.close();
			
	}

}
