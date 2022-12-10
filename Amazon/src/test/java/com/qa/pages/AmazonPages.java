package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
	
	WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;
	public WebElement SearchBox() {
		return searchBox;
	}
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement mgnbtn;
	public WebElement MgnBtn() {
		return mgnbtn;
	}
	
	public AmazonPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
