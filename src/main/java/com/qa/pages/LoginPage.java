package com.qa.pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class LoginPage extends TestBase{
	
	
	//Login Page Object Repository
	
	@FindBy(name= "email")
	WebElement email;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath= "//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath= "//a[text()='Sign Up']")
	WebElement signupLink;
	
	
	// Page Factor Initialization 
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLoginTitle(String expectedTitle) {
		
		Assert.assertEquals(expectedTitle,driver.getTitle());
		
	}
	
  
 	public void login(String email, String password){
 		
 		this.email.sendKeys(email);
 		this.password.sendKeys(password);
 		
 		loginBtn.click();
 	}
  
	
}
