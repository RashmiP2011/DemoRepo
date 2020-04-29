package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class CompaniesPage extends TestBase{
	
	//Contacts Page Object Repository
		
		@FindBy(linkText= "New")
		WebElement newCompanyBtn;
		
		@FindBy(xpath= "//button[text()='Save']")
		WebElement saveCompanyBtn;

		
		@FindBy(xpath= "//button[text()='Delete']")
		WebElement confirmDeleteBtn;
		
		@FindBy(name= "name")
		WebElement companyName;
		
		
		@FindBy(name= "url")
		WebElement website;
		
		@FindBy(name= "description")
		WebElement description;
		
		
		@FindBy(tagName = "tbody")
		WebElement companiesTable;
		
		@FindBy(xpath= "//button[text()='Fetch']")
		WebElement urlFetchBtn;
		
		
		
		// Page Factor Initialization 
		
		public CompaniesPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public void clickNewCompany(){
			  
			newCompanyBtn.click();
			
		}
		
		public void enterNewCompanyDetails(String companyName, String website, String description) {
		
			this.companyName.sendKeys(companyName);
			this.website.sendKeys(website);
			urlFetchBtn.click();	
			this.description.sendKeys(description);
			saveCompanyBtn.click();
			
	    }
		
		public void deleteCompaany(String companyName) throws Throwable
		{		
		WebElement deleteBtn = companiesTable.findElement(By.xpath("//td[text()='" + companyName +"']/parent::tr/td/div/button/i[@class='trash icon']"));
			
		deleteBtn.click();
		
		Thread.sleep(1000);
		
		confirmDeleteBtn.click();
		
		}
		

}
