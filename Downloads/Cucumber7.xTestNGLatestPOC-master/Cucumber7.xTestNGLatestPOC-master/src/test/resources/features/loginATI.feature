Feature: Test the Login Functionality
Scenario: Test the valid login
Given user is on login page
When user entering username and passord
And click on login button
Then user should be on homepage
