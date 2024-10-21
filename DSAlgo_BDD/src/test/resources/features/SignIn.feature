Feature: SignIn functionality for DSAlgo Portal

  Background: 
    Given the user clicks GetStarted button in the home page

  Scenario: Successful SignIn with valid credentials to check 'you are logged in' message at home page
    Given The user is in SignIn page
    When The user passes the valid credentials
    And Click on Login button
    Then You are logged in message should be displayed

  Scenario: Successful signin with valid credentials to check display of username at home page
    Given The user is in SignIn page
    When The user passes the valid credentials
    And Click on Login button
    Then Username should be displayed as a link

  Scenario Outline: Unsuccessful SignIn with invalid or empty credentials from Excel "<Sheetname>" and
    <RowNumber>

    Given The user is in SignIn page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    And Click on Login button
    Then User should see an error message displayed for incorrect credentials <RowNumber>

    Examples: 
      | Sheetname     | RowNumber |
      | INVALID_LOGIN |         1 |
      | INVALID_LOGIN |         2 |
      | INVALID_LOGIN |         3 |
