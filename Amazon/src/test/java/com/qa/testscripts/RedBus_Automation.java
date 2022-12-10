package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus_Automation {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = null;
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dharun R\\Downloads\\VIRTUSA\\Browser driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(10000);
		
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.click();
		from.sendKeys("Theni");
		Thread.sleep(2000);
		
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.click();
		to.sendKeys("Chennai");
		Thread.sleep(8000);
		
		WebElement datetab = driver.findElement(By.cssSelector("#txtOnwardCalendar"));
		datetab.click();
		Thread.sleep(8000);
		
//		datetab.sendKeys("25-Nov-2022");
//		Thread.sleep(5000);
		
		WebElement monthSelection = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/img[1]"));
		monthSelection.click();
		Thread.sleep(5000);
		
		WebElement DateSelection = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[2]/li[26]/span[1]"));
		DateSelection.click();
		Thread.sleep(5000);
		
		WebElement search = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/button[1]"));
		search.click();
		
		
		driver.close();
	}
}
