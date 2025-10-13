Feature: OrangeHRM User Login

  Background:
    Given a new user account is created
    And the user is on the login page

  Scenario: Successful login with valid credentials
    Given the user is on the OrangeHRM login page
      | Name | Email            | Role      |
      | John | john@example.com | Admin     |
      | Jane | jane@example.com | Editor    |
      | Bob  | bob@example.com  | Developer |
    When the user enters a valid username "<username>" and password "<password>"
    Then the user should be redirected to the OrangeHRM dashboard with "<WelcomeMessage>"
    
    Scenario: login with valid credentials
    Given the user is on valid login page
    When the user enters a valid username and password

    Scenario: login with invalid credentials
    Given the user is on invalid login page
    When the user enters a invalid username and password
