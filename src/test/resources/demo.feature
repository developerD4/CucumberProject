Feature: OrangeHRM User Login
  @ready
  Scenario Outline: Successful login with valid credentials
    Given the user is on the OrangeHRM login page
    When the user enters a valid username "<username>" and password "<password>"
    Then the user should be redirected to the OrangeHRM dashboard with "<WelcomeMessage>"

    Examples:
      | username | password     | WelcomeMessage   |
      | Admin    | admin123     | Welcome Admin    |
