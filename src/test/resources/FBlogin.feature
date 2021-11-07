Feature: Validation of Facebook using different Credentials
Scenario Outline: Validation of Facebook login module

Given User should login to facebook 
When User should enter the "<username>"and "<password>"
And User clicks on the login button
And User clicks location "<Location>"
Then User Verifies the login page

Examples:
|username|password|Location|
|ramsss|3456789|Melbourne|





