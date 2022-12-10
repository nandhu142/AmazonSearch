package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_automation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dharun R\\Downloads\\VIRTUSA\\Browser driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get("http://www.flipkart.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		
		WebElement logintxtbox = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
		logintxtbox.click();
		logintxtbox.sendKeys("9655322612");
		
		WebElement password = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]"));
		password.click();
		password.sendKeys("Rdharun@2001");
		
		WebElement loginbtn = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]/span[1]"));
		loginbtn.click();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		searchbox.sendKeys("Realme 9 5g SE");
		searchbox.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(8000);
		
		WebElement product = driver.findElement(By.cssSelector("div._36fx1h._6t1WkM._3HqJxg div._1YokD2._2GoDe3 div._1YokD2._3Mn1Gg:nth-child(2) div._1AtVbE.col-12-12:nth-child(4) div._13oc-S div._2kHMtA a._1fQZEK div.MIXNux div._2QcLo- div:nth-child(1) div.CXW8mj > img._396cs4._3exPp9"));
		product.click();
		
		
		Thread.sleep(8000);
		
		String product_title = driver.getTitle();       
//		System.out.println(product_title);
		
		if(product_title.contains("Realme 9 5g SE")) {
			System.out.println("Passed Tittle Test Case");
		}
		else
			System.out.println("Title Test Case failed");
		
//		WebElement EMIDetails = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[9]/div[2]/div[1]/div[2]/div[1]"));
//		EMIDetails.click();
		
		WebElement wishlist = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		wishlist.click();
//		
		Thread.sleep(8000);
			
		WebElement addtocart = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[10]/div[3]/div[1]/div[2]/div[2]/div[2]/button[1]"));
		addtocart.click();
		
//		driver.navigate().back();
		
		
		
	}

}
