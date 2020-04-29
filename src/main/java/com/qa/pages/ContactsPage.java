package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ContactsPage extends TestBase{
	
	//Contacts Page Object Repository
		
		@FindBy(linkText= "New")
		WebElement newContactBtn;
		
		@FindBy(xpath= "//button[text()='Save']")
		WebElement saveContactBtn;
		
		@FindBy(xpath= "//button[text()='Delete']")
		WebElement confirmDeleteBtn;
		
		@FindBy(name = "first_name")
		WebElement firstName;
		
		@FindBy(name = "last_name")
		WebElement lastName;
		
		@FindBy(name = "value")
		WebElement eMail;
		
		@FindBy(tagName = "tbody")
		WebElement contactsTable;
		
		
		
		// Page Factor Initialization 
		
		public ContactsPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public void clickNewContact(){
			  
			newContactBtn.click();
			
		}
		
		public void enterNewContactDetails(String firstName, String lastName, String eMail) {
		
			this.firstName.sendKeys(firstName);
			this.lastName.sendKeys(lastName);
			this.eMail.sendKeys(eMail);
			saveContactBtn.click();
			
	    }
		
		public void deleteContact(String firstName, String lastName)throws Throwable
		{
			
			
		WebElement deleteBtn = contactsTable.findElement(By.xpath("//td[text()='" + firstName +" " + lastName +"']/parent::tr/td/div/button/i[@class='trash icon']"));
			
		deleteBtn.click();
		
		Thread.sleep(1000);
		
		confirmDeleteBtn.click();
		
		}
		
		
		
		
		
		
		

}
