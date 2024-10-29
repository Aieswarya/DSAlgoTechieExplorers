Feature: Data Structure Introduction module

  Background: 
    Given the user clicks GetStarted button in the home page
    Given successful signin with valid credentials

  Scenario: The user navigates to the data structure introduction page
    When The user clicks on Get Started button on the home page
    Then The user should be directed to the Data structures introduction page

  Scenario: The user navigates to the Time Complextiy page
    Given The user is in the Data structures introduction page
    When The user clicks on the Time Complexity link
    Then The user should be directed to the time complexity page

  Scenario: The user navigates to the Python Try Editor page
    Given The user is in the Time complexity page
    When The user clicks on the Try here button
    Then The user should be directed to the Try Editor page with run button to test

  Scenario: The user writes valid python code in Try Editor page
    Given The user is in the Try Editor page
    When The user writes Valid Python code
    And Click run button
    Then The user is able to see the output in the console

  Scenario: The user writes invalid python code in Try Editor page
    Given The user is in the Try Editor page
    When The user writes invalid python code
    And Click run button
    Then User is able to see the error msg in alert window

  Scenario: The user clicks Alert error message
    Given The user is on the editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  Scenario: The user wont enter any python code in the Try Editor page
    Given The user is in the Try Editor page
    When The user wont enter any python code
    And Click run button
    Then The user is on the same page having Editor and Run button

  Scenario: The user tries to navigate to Practice questions page
    Given The user is in the Time complexity page
    When The user clicks on Practice questions link
    Then The user should see content on Practice questions page
