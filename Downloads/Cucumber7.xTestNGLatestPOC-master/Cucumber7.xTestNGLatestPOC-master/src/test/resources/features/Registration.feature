#Feature: Registration Functionality for OpenCart E-commerce Website

  As a user of the OpenCart website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on the OpenCart Registration page

  Scenario Outline: Unsuccessful Registration with invalid or empty credentials
    Given I have entered invalid "<First_Name>" and "<Last_Name>" and "<E_Mail>" and "<Telephone>" and "<Password>" and "<Password Confirm>"
    When I click on the Continue button
    Then I should see an error message indicating "<error_message>"

    Examples:
      | First_Name        | Last_Name       |E_mail|  Telephone | Password | Password Confirm| error_message                                  |
      | gh                | ss              | abcd@gmail.com    | 12345    | 12345           | Warning: You must agree to the Privacy Policy! |                    
      
