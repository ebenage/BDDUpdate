 @Login
Feature: Validate Login Page functionality 

Background: 
	Given User is on the TechFios Login Page     
	
@Scenario1
Scenario: User should be able to login with valid credentials(Making Variables work as Placeholders)
	When User enters username as "demo@techfios.com" 
	And User enter password as "abc123" 
	And User clicks on Signin Button   
	Then User should land on Dashboard Page 
	
@Scenario2
Scenario: User should be able to login with valid credentials(Making Variables work as Placeholders)
	When User enters username as "demo@techfios.com" 
	And User enter password as "abc124" 
	And User clicks on Signin Button  
	Then User should land on Dashboard Page 
	
@Scenario3
Scenario Outline: User should be able to login with valid credentials(Making Variables work as Placeholders)
	When User enters the "<userName>" and "<password>"
	And User clicks on Signin Button  
	Then User should land on Dashboard Page 
	
	Examples:
	|userName|password|
	|demo@techfios.com|abc123|
	|demo@techfios.com|abc124|
	|demo@techFios.com|abc123|
	|demo@techFios.com|abc124|
	