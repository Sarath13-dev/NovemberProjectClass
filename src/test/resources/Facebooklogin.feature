 Feature: Validation of Facebook Webpage
 
 Scenario Outline: Validating the facebook with correct username and correct password
 
 	Given User should open the facebook application
 
 	When User enters the "<username>" and "<password>" in the application

	And User clicks the login button
	
	Then User verifies the application moved to home page
	
	Examples:
	|username|password|
	|ramsss|12344|
	|ajay|09876|
	|murugan|4567|
	|Ravikumar|456789|
	
	
	

	