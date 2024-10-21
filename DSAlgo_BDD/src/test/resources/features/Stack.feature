Feature: Stack module

  Background: 
    Given the user clicks GetStarted button in the home page
    Given successful signin with valid credentials

  Scenario: The user tries navigates to the Stack module
    Given The user is in DS home page
    When The user clicks the Get Started button in homepage
    Then The user should be directed to Stack Page

  Scenario: The user tries to navigate to Operations in stack page
    Given The user is in the Stack page
    When The user clicks Operations in Stack button
    Then The user should be directed to Operations in Stack Page

  Scenario: The user tries to navigate to Python editor page
    Given The user is in the Operations in Stack page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button

  Scenario: The user tries to navigate to Implementation page
    Given The user is in the Stack page
    When The user clicks Implementation button
    Then The user should be directed to Implementation Page

  Scenario: The user tries to navigate to Python editor page
    Given The user is in the Implementation page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button

  Scenario: The user tries to navigate to Application page
    Given The user is in the Stack page
    When The user clicks Application button
    Then The user should be directed to Applications Page

  Scenario: The user tries to navigate to Python try editor page
    Given The user is in the Applications page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button

  Scenario Outline: The user tries to run any stack editor with valid code
    Given The user is on any stack "<type>" python Editor page
    When The User writes Valid python code
    And click Run button
    Then User is able to see the output in console

    Examples: 
      | type              |
      | Operationsinstack |
      | Implementation    |
      | Applications      |

  Scenario Outline: The user tries to run any stack editor with invalid code
    Given The user is on any stack "<type>" python Editor page
    When the user writes invalid python code
    And click Run button
    Then User is able to see the error msg in alert window

    Examples: 
      | type              |
      | Operationsinstack |
      | Implementation    |
      | Applications      |

  Scenario Outline: The user handles the alert window in any Stack editor
    Given The user is on any stack "<type>" editor page with Alert error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

    Examples: 
      | type              |
      | Operationsinstack |
      | Implementation    |
      | Applications      |

  Scenario Outline: The user tries to run any stack editor without code
    Given The user is on any stack "<type>" python Editor page
    When click Run button
    Then The user should see an error message displayed

    Examples: 
      | type              |
      | Operationsinstack |
      | Implementation    |
      | Applications      |

  Scenario: The user navigates to Practice Questions page
    Given The user is in the Operations in Stack page
    When The user clicks Practice Questions link
    Then The user should see content in Practice questions page
