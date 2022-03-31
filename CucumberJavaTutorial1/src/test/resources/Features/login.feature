#Author
#Date
#Description

Feature: feature to test login functionality
	
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigted to the homepage
    
   @smoke
  Scenario: Check login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then error message is displayed - Invalid Credentials
    
    Examples:
    | username | password |
    | user1 | pass1 |
    | user2 | pass2 |
