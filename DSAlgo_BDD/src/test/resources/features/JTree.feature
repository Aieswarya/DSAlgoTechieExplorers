Feature: Tree

  Background: The user is signed in
    Given The user is on DS Home Page with logged in

  #######Overview of Trees
  Scenario: The user navigates to Overview of Trees page
    Given The user is on the Tree home page
    When The user clicks Overview of Trees
    Then The user should be redirected to Overview of Trees page.

  Scenario: The user navigates to Overview of Trees Editor page
    Given The user is on the Overview of Trees page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #####Types of Trees
  Scenario: The user navigates to Types of Trees page
    Given The user is on the Tree home page
    When The user clicks Types of Trees link
    Then The user should be redirected to Types of Trees page.

  Scenario: The user navigates to Types of Trees  Editor page
    Given The user is on the Types of Trees page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ############Terminologies
  Scenario: The user navigates to Terminologies page
    Given The user is on the Tree home page
    When The user clicks Terminologies link
    Then The user should be redirected to Terminologies page.

  Scenario: The user navigates to Terminologies Editor page
    Given The user is on the Terminologies page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ###########Tree Traversal
  Scenario: The user navigates to Tree Traversal page
    Given The user is on the Tree home page
    When The user clicks on the Tree Traversal link
    Then The user should be redirected to Tree Traversal page.

  Scenario: The user navigates to Tree Traversal Editor page
    Given The user is on the Tree Traversal Python page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ## Traversal Illustration
  Scenario: The user navigates to Traversal Illustration page
    Given The user is on the Tree home page
    When The user clicks Traversal Illustration link
    Then The user should be redirected to Traversal Illustration page.

  Scenario: The user navigates to Traversal Illustration Editor page
    Given The user is on the Traversal Illustration page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #########Binary Tree
  Scenario: The user navigates to Binary Tree page
    Given The user is on the Tree home page
    When The user clicks Binary Tree link
    Then The user should be redirected to Binary Tree page.

  Scenario: The user navigates to Binary Tree Editor page
    Given The user is on the Binary Tree page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ####Types of Binary Tree
  Scenario: The user navigates to Types of Binary Tree page
    Given The user is on the Tree home page
    When The user clicks Types of Binary Tree link
    Then The user should be redirected to Types of Binary Tree page.

  Scenario: The user navigates to Types of Binary Tree Editor page
    Given The user is on the Types of Binary Tree page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #######Implementation of Binary Tree
  Scenario: The user navigates to Implementation of Binary Tree page
    Given The user is on the Tree home page
    When The user clicks Types of Implementation of Binary Tree link
    Then The user should be redirected to Implementation of Binary Tree page.

  Scenario: The user navigates to Implementation of Binary Tree Editor page
    Given The user is on the Types of Implementation of Binary Tree page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  ####Application of Binary Tree
  Scenario: The user navigates to Application of Binary Tree page
    Given The user is on the Tree home page
    When The user clicks Types of Application of Binary Tree link
    Then The user should be redirected to Application of Binary Treepage.

  Scenario: The user navigates to  Application of Binary Tree Editor page
    Given The user is on the Types of Application of Binary Tree page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #####Binary Search Tree
  Scenario: The user navigates to Binary Search Tree page
    Given The user is on the Tree home page
    When The user clicks Types of Binary Search Tree link
    Then The user should be redirected to Binary Search Tree page.

  Scenario: The user navigates to Binary Search Tree Editor page
    Given The user is on the Binary Search Tree page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #####Implementation of BST
  Scenario: The user navigates to Implementation of BST page
    Given The user is on the Tree home page
    When The user clicks Types of Implementation of BST link
    Then The user should be redirected to Implementation of BST page.

  Scenario: The user navigates to Implementation of BST Editor page
    Given The user is on the Implementation of BST page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  #######Python Editor Scenarios
  Scenario Outline: The user tries to run any Tree editor without code
    Given The user is on any Tree "<type>" Python Editor
    When The user click Run Button
    Then The user should see an error message displayed

    Examples: 
      | type                           |
      | Overview of Trees              |
      | Terminologies                  |
      | Types of Trees                 |
      | Tree Traversals                |
      | Traversals-Illustration        |
      | Binary Trees                   |
      | Types of Binary Trees          |
      | Implementation in Python       |
      | Binary Tree Traversals         |
      | Implementation of Binary Trees |
      | Application of Binary Trees    |
      | Binary Search Tree             |
      | Implementation of BST          |

  Scenario Outline: The user tries to run any Tree editor with valid code
    Given The user is on any Tree "<type>" Python Editor
    When The user writes the valid python code
    And The user click Run Button
    Then The user is able to see the output inside the console.

    Examples: 
      | type                           |
      | Overview of Trees              |
      | Terminologies                  |
      | Types of Trees                 |
      | Tree Traversals                |
      | Traversals-Illustration        |
      | Binary Trees                   |
      | Types of Binary Trees          |
      | Implementation in Python       |
      | Binary Tree Traversals         |
      | Implementation of Binary Trees |
      | Application of Binary Trees    |
      | Binary Search Tree             |
      | Implementation of BST          |

  Scenario Outline: The user tries to run any Tree editor with invalid code
    Given The user is on any Tree "<type>" Python Editor
    When The user writes the invalid python code
    And The user click Run Button
    Then The user see error msg in alert window

    Examples: 
      | type                           |
      | Overview of Trees              |
      | Terminologies                  |
      | Types of Trees                 |
      | Tree Traversals                |
      | Traversals-Illustration        |
      | Binary Trees                   |
      | Types of Binary Trees          |
      | Implementation in Python       |
      | Binary Tree Traversals         |
      | Implementation of Binary Trees |
      | Application of Binary Trees    |
      | Binary Search Tree             |
      | Implementation of BST          |

  #####Alert Handling Scenarios
  Scenario Outline: The user handles the alert window in Tree editor page
    Given The user is on any Tree "<type>" Python Editor page with Alert  error message
    When The user click the ok button in the alert window
    Then The user is on the same page having Editor and Run button

    Examples: 
      | type                           |
      | Overview of Trees              |
      | Terminologies                  |
      | Types of Trees                 |
      | Tree Traversals                |
      | Traversals-Illustration        |
      | Binary Trees                   |
      | Types of Binary Trees          |
      | Implementation in Python       |
      | Binary Tree Traversals         |
      | Implementation of Binary Trees |
      | Application of Binary Trees    |
      | Binary Search Tree             |
      | Implementation of BST          |

  Scenario: The user navigates to practise questions page
    Given The user is on the Tree home page
    When The user clicks Practice Questions link in any Tree page
    Then The user should see content in Practise Questions page
