Feature: HomePage

  Scenario: The user should see Data Structures drop down options
    Given The user is on DS HomePage
    When The user clicks the data structure"dropdown  arrow
    Then The user should able to see 6 options "Arrays,Linked List,Stack,Queue,Tree,Graph" in dropdown menu

  Scenario Outline: The user tries to access DS modules in dropdown without sign in
    Given The user is on DS HomePage
    When The user selects "<type>" data structures item from the drop down
    Then The user should able to see an warning message "You are not logged in"

    Examples: 
      | type        |
      | Array       |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  Scenario Outline: The user tries to access DS modules in DSIntroduction without sign in
    Given The user is on DS HomePage
    When The user clicks "<type>" Get Started buttons of data structures  on the DSIntroduction page
    Then The user should able to see an warning message "You are not logged in"

    Examples: 
      | type                         |
      | Array                        |
      | Linked List                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |

  Scenario Outline: The user tries to access DS modules in dropdown with sign in
    Given The user is on DSHomePage with sign in
    When The user selects "<type>" data structures item from the drop down
    Then The user is redirected to correct Data Structure "<type>" page

    Examples: 
      | type  |
      | Array |
      | Stack |
      | Queue |
      | Tree  |
      | Graph |

  Scenario Outline: The user tries to access DS modules in DSIntroduction with sign in
    Given The user is on DSHomePage with sign in
    When The user clicks "<type>" Get Started buttons of data structures  on the DSIntroduction page
    Then The user is redirected to correct Data Structure "<type>" page

    Examples: 
      | type                         |
      | Array                        |
      | Linked List                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |

  Scenario Outline: The user navigates back to get started page from any DS page
    Given The user is on DSHomePage with sign in
    When The user clicks Numpy Ninja link from any Data Structure "<type>" page
    Then The user is redirected to Get Started page
    Examples: 
      | type                         |
      | Array                        |
      | Linked List                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |