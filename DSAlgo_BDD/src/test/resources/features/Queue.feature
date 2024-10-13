Feature: Queue Functionality


Background: Login to the page
	Given the user has logged in
	
	
	Scenario: Checking "Queue" page loads from "Home"
     When the "Queue" link is pressed on "Home"
     Then the expected "Queue" page should open
     
  Scenario: Checking "Implementation of Queue in Python" page loads from "Queue"
    When the "Implementation of Queue in Python" link is pressed on "Queue"
    Then the expected "Implementation of Queue in Python" page should open

  Scenario: Checking "Editor" page loads from "Implementation of Queue in Python"
    When the "Editor" link is pressed on "Implementation of Queue in Python"
    Then the expected "Editor" page should open
    
   # Scenario: Testing the Text Editor  in Implementation of Queue in Python with valid code
   # When The user writes the Valid python code in Editor and Clicks Run button
   # Then The User should be able to see the output in the console
    
  #Scenario: Testing the Text Editor in Implementation of Queue in Python with InValid code
   # When The user writes the invalid python code in Editor and Clicks Run button
   # Then The User should should be in the same page with No error message
    
    
    
  Scenario: Checking "Implementation using collections.deque" page loads from "Queue"
    When the "Implementation using collections.deque" link is pressed on "Queue"
    Then the expected "Implementation using collections.deque" page should open
 

  Scenario: Checking "Editor" page loads from "Implementation using collections.deque"
    When the "Editor" link is pressed on "Implementation using collections.deque"
    Then the expected "Editor" page should open
    
    
   # Scenario: Testing the Text Editor in Implementation using collections.deque with valid code
   # When The user writes the Valid python code in Editor and Clicks Run button
   # Then The User should be able to see the output in the console
    
  #Scenario: Testing the Text Editor in Implementation using collections.deque with InValid code
   # When The user writes the invalid python code in Editor and Clicks Run button
    #Then The User should should be in the same page with No error message
    
    
    
    
    
    
  Scenario: Checking "Implementation using array" page loads from "Queue"
    When the "Implementation using array" link is pressed on "Queue"
    Then the expected "Implementation using array" page should open
 

  Scenario: Checking "Editor" page loads from "Implementation using array"
    When the "Editor" link is pressed on "Implementation using array"
    Then the expected "Editor" page should open
    
   # Scenario: Testing the Text Editor in Implementation using array with valid code
   # When The user writes the Valid python code in Editor and Clicks Run button
    #Then The User should be able to see the output in the console
    
  #Scenario: Testing the Text Editor in Implementation using array with InValid code
   # When The user writes the invalid python code in Editor and Clicks Run button
    #Then The User should should be in the same page with No error message
    
    
    
    
    
  Scenario: Checking "Queue Operations" page loads from "Queue"
    When the "Queue Operations" link is pressed on "Queue"
    Then the expected "Queue Operations" page should open
    
   
  Scenario: Checking "Editor" page loads from "Queue Operations"
    When the "Editor" link is pressed on "Queue Operations"
    Then the expected "Editor" page should open
     
   # Scenario: Testing the Text Editor in Queue Operations with valid code
   # When The user writes the Valid python code in Editor and Clicks Run button
   # Then The User should be able to see the output in the console
    
 # Scenario: Testing the Text Editor in Queue Operations with InValid code
  #  When The user writes the invalid python code in Editor and Clicks Run button
   # Then The User should should be in the same page with No error message
    
    
    
 