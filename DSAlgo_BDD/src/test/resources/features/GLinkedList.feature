Feature: LinkedList

  Background: The user is signed in
    Given The user is on DS Home Page with logged in

  #######LL Intro Scenarios
  Scenario: The user navigates to LL Introduction page
    Given The user is on the Linked List home page
    When The user clicks Introduction link
    Then The user should be redirected to LL Introduction page.

  Scenario: The user navigates to LL Intro Editor page
    Given The user is on the LL Introduction page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #####Create LL Scenarios
  Scenario: The user navigates to Create LL Introduction page
    Given The user is on the Linked List home page
    When The user clicks Creating Linked List link
    Then The user should be redirected to Creating Linked List page.

  Scenario: The user navigates to Create LL  Editor page
    Given The user is on the Creating Linked LIst page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ############Types of LL Scenarios
  Scenario: The user navigates to Type of LL page
    Given The user is on the Linked List home page
    When The user clicks Types of Linked List link
    Then The user should be redirected to Types of Linked List page.

  Scenario: The user navigates to Type of LL Editor page
    Given The user is on the Types of Linked List page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ###########Implement LL Scenarios
  Scenario: The user navigates to Implement LL page
    Given The user is on the Linked List home page
    When The user clicks on the Implement Linked List in LL Home  page
    Then The user should be redirected to Implement Linked List in Python page.

  Scenario: The user navigates to Implement LL Editor page
    Given The user is on the Implement Linked List in Python page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ## Traverse LL Scenarios
  Scenario: The user navigates to Traversal LL page
    Given The user is on the Linked List home page
    When The user clicks Traversal link
    Then The user should be redirected to Traversal LL page.

  Scenario: The user navigates to Traversal LL Editor page
    Given The user is on the Traversal LL page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #########Insertion LL Scenarios
  Scenario: The user navigates to Insertion LL page
    Given The user is on the Linked List home page
    When The user clicks InsertionLL link
    Then The user should be redirected to Insertion LL page.

  Scenario: The user navigates to Insertion LL Editor page
    Given The user is on the Insertion LL page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ####Deletion LL Scenarios
  Scenario: The user navigates to Deletion LL page
    Given The user is on the Linked List home page
    When The user clicks Deletion link
    Then The user should be redirected to Deletion LL page.

  Scenario: The user navigates to Deletion LL Editor page
    Given The user is on the Deletion LL page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #######Python Editor Scenarios
  Scenario Outline: The user tries to run any Linked List editor without code
    Given The user is on any LL "<type>" Python Editor
    When The user click Run Button
    Then The user should see an error message displayed

    Examples: 
      | type                            |
      | Introduction                    |
      | Creating Linked List            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |

  Scenario Outline: The user tries to run any Linked List editor with valid code
    Given The user is on any LL "<type>" Python Editor
    When The user writes the valid python code
    And The user click Run Button
    Then The user is able to see the output inside the console.

    Examples: 
      | type                            |
      | Introduction                    |
      | Creating Linked List            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |

  Scenario Outline: The user tries to run any Linked List editor with invalid code
    Given The user is on any LL "<type>" Python Editor
    When The user writes the invalid python code
    And The user click Run Button
    Then The user see error msg in alert window

    Examples: 
      | type                            |
      | Introduction                    |
      | Creating Linked List            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |

  #####Alert Handling Scenarios
  Scenario Outline: The user handles the alert window in LL editor page
    Given The user is on any LL "<type>"editor page with Alert  error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

    Examples: 
      | type                            |
      | Introduction                    |
      | Creating Linked List            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |

  Scenario: The user navigates to practise questions page
    Given The user is on the Linked List home page
    When The user clicks Practice Questions link in LLhome page
    Then The user should see content in Practise Questions page