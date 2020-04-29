Feature: FreeCRM Company Feature 


Scenario Outline: FreeCRM add new Company 

	Given User is already on login page 
	When Title of login page is <"Cogmento CRM"> 
	Then User login into application 
	And Verify login successful 
	Then Navigate to Companies page 
	Then Click on add new Company 
	And Enter "<companyname>" , "<companyurl>" , "<description>" and save 
	And Logout 
	
	Examples: 
		|companyname	|companyurl				  |description			|
		|CitiusTech		|www.citiustech.com		  |CitiusTech is a specialist provider of healthcare technology services and solutions, with strong presence across the globe	    |
	#	|Accenture		|www.accenture.com/in-en  |Accenture Development Partnerships brings the best of Accenture to address social, economic and environmental issues.    |

	 
Scenario Outline: FreeCRM delete Company

	Given User is already on login page 
	When Title of login page is <"Cogmento CRM"> 
	Then User login into application 
	And Verify login successful 
	Then Navigate to Companies page 
	Then Identify the Company with "<companyname>" and delete the record 
	And Logout 
	
	Examples: 
		|companyname	|
		|CitiusTech		|
	#	|Accenture  	|