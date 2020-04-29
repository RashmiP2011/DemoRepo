package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	
	//Home Page Object Repository
	
	@FindBy(className= "user-display")
	WebElement user;
	
	@FindBy(linkText= "Contacts")
	WebElement contacts;
	
	@FindBy(linkText= "Companies")
	WebElement companies;
	
	@FindBy(linkText= "Deals")
	WebElement deals;
	
	@FindBy(xpath= "//i[@class='settings icon']")
	WebElement settingIcon;
	
	@FindBy(linkText= "Log Out")
	WebElement logOutLink;

	// Page Factory Initialization 
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUser(String user){
		
	  Assert.assertEquals(user, this.user.getText().toString());
	
	}
	
	public void selectMenu(String menuItem) {
		
		switch(menuItem){
		
		case "Contacts" :
			contacts.click();	
			break;
		
		case "Companies" :
			companies.click();	
			break;
			
		case "Deals" :
			deals.click();	
			break;	
			
		
		}		
	}
	
	public void verifyMenuOption(String menuOption) {
		
		Assert.assertTrue(driver.findElement(By.linkText(menuOption)).isEnabled());
	}
	
		
	public void logoutUser() throws Throwable{
		settingIcon.click();
		Thread.sleep(1000);
		logOutLink.click();
		driver.close();
		driver.quit();
	}
	
	
}
