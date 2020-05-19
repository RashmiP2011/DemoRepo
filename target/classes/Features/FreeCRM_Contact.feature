Feature: FreeCRM Contact Feature 

@SmokeTest
Scenario Outline: FreeCRM add new Contact 

	Given User is already on login page 
	When Title of login page is <"Cogmento CRM"> 
	Then User login into application 
	And Verify login successful 
	Then Navigate to Contacts page 
	Then Click on add new contact 
	And Enter "<firstname>" , "<lastname>" , "<email>" and save 
	And Logout 
	
	Examples: 
		|firstname	|lastname	|email				|
		|Rashmi		|Poojari	|123@gmail.com	    |
	#	|Pooja		|Verma      |123@gmail.com	    |
	#	|Preeti     |Rathod		|123@gmail.com      |
	#	|Amit	    |Joshi      |123@gmail.com      |
		
@RegressionTest		
Scenario Outline: FreeCRM delete Contact 

	Given User is already on login page 
	When Title of login page is <"Cogmento CRM"> 
	Then User login into application 
	And Verify login successful 
	Then Navigate to Contacts page 
	Then Identify the Contact with "<firstname>" , "<lastname>" and delete the record 
	And Logout 
	
	Examples: 
		|firstname	|lastname	|
	#	|Rashmi		|Poojari	|
	#	|Preeti     |Rathod		|
	#	|ABC        |XYZ|