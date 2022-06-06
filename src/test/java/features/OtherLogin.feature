@OtherLoginFeature @Regression
Feature: TechFios Billing Login Functionality validation

	Background:
	 Given User is on the TechFios login page
	 
	@OtherScnenario1 
  Scenario Outline: 1 User should not be able to login with valid credentials 
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks signin button
    Then User should land on the dashboard page
    
	Examples: 
	|username|password|
	|demo@techfios.com|abc123|
	|demo@techfios.com|abc124|
	|demo1@techfios.com|abc124|
  