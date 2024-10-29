Feature: Graph

  Background: The user is signed in
    Given The user is on DS Home Page with logged in
    #When The user logs in the DS Home Page

  Scenario: The user navigates to Graph page from graph home page
    Given The user is on the Graph home page
    When The user clicks "Graph" graph link
    Then The user should be redirected to Graph page.

  Scenario: The user navigates to Graph Editor page
    Given The user is on the Graph page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  Scenario: The user tries to run python graph editor without code
    Given The user is on the  Graph editor page
    When The user clicks the "Run" Button without entring the code in the Editor
    Then The user should see an error message displayed

  Scenario: The user tries to run python graph editor with valid python code
    Given The user is on the  Graph editor page
    When The user writes the valid python code
    And The user click Run Button
    Then The user is able to see the output inside the console.

  Scenario: The user tries to run python graph editor with invalid python code
    Given The user is on the  Graph editor page
    When The user writes the invalid python code
    And The user click Run Button
    Then The user should see an error message in alert window

  Scenario: The user navigates to Graph representation page from graph page
    Given The user is on the Graph home page
    When The user clicks "Graph Representations" GR link
    Then The user should be redirected to Graph Representations page.

  Scenario: The user navigates to Graph Representation Editor page
    Given The user is on the Graph Representations page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  Scenario: The user tries to run Graph Representation editor without code
    Given The user is on the Graph RepresentationPython Editor
    When The user click Run Button
    Then The user should see an error message displayed

  Scenario: The user tries to run Graph Representation editor with valid code
    Given The user is on the Graph RepresentationPython Editor
    When The user writes the valid python code
    And The user click Run Button
    Then The user is able to see the output inside the console.

  Scenario: The user tries to run Graph Representation editor with invalid code
    Given The user is on the Graph RepresentationPython Editor
    When The user writes the invalid python code
    And The user click Run Button
    Then The user see error msg in alert window

  Scenario: The user handles the alert window in graph editor page
    Given The user is on any graph editor page with Alert  error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

  Scenario: The user navigates to practise questions page
    Given The user is on the Graph home page
    When The user clicks "Practice Questions" link in home page
    Then The user should see content in Practise Questions page
