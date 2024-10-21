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

  Scenario: Checking "Practice" page loads from "Implementation of Queue in Python"
    When the "Practice" link is pressed on "Implementation of Queue in Python"
    Then the expected "Practice" page should open
    
  Scenario: Testing the Text Editor  in Implementation of Queue in Python with valid code
    When the "Implementation of Queue in Python" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation of Queue in Python"
    When The user writes the valid python code in Editor and clicks Run button
    Then The user  should be able to see the output in the console
    
  Scenario: Testing the Text Editor in Implementation of Queue in Python with InValid code
    When the "Implementation of Queue in Python" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation of Queue in Python"
    When The user writes the inValid python code in Editor and Clicks Run button
    Then The User should should be in the same page with the error messages
    
  Scenario: Testing the Text Editor in Implementation of Queue in Python with no code
    When the "Implementation of Queue in Python" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation of Queue in Python"
    When The user Clicks Run button
    Then The User should should be in the same page with the error messages
    
  Scenario: Checking "Implementation using collections.deque" page loads from "Queue"
    When the "Implementation using collections.deque" link is pressed on "Queue"
    Then the expected "Implementation using collections.deque" page should open

  Scenario: Checking "Editor" page loads from "Implementation using collections.deque"
    When the "Editor" link is pressed on "Implementation using collections.deque"
    Then the expected "Editor" page should open

  Scenario: Checking "Practice" page loads from "Implementation using collections.deque"
    When the "Practice" link is pressed on "Implementation using collections.deque"
    Then the expected "Practice" page should open
    
  Scenario: Testing the Text Editor  in Implementation using collections.deque with valid code
    When the "Implementation using collections.deque" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation using collections.deque"
    When The user writes the valid python code in Editor and clicks Run button
    Then The user  should be able to see the output in the console
    
  Scenario: Testing the Text Editor in Implementation using collections.deque with InValid code
    When the "Implementation using collections.deque" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation using collections.deque"
    When The user writes the inValid python code in Editor and Clicks Run button
    Then The User should should be in the same page with the error messages
    
  Scenario: Testing the Text Editor in Implementation using collections.deque with no code
    When the "Implementation using collections.deque" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation using collections.deque"
    When The user Clicks Run button
    Then The User should should be in the same page with the error messages
    
  Scenario: Checking "Implementation using array" page loads from "Queue"
    When the "Implementation using array" link is pressed on "Queue"
    Then the expected "Implementation using array" page should open
 

  Scenario: Checking "Editor" page loads from "Implementation using array"
    When the "Editor" link is pressed on "Implementation using array"
    Then the expected "Editor" page should open
    
  Scenario: Checking "Practice" page loads from "Implementation using array"
    When the "Practice" link is pressed on "Implementation using array"
    Then the expected "Practice" page should open
    
  Scenario: Testing the Text Editor  in Implementation using array with valid code
    When the "Implementation using array" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation using array"
    When The user writes the valid python code in Editor and clicks Run button
    Then The user  should be able to see the output in the console
    
  Scenario: Testing the Text Editor in Implementation using array with InValid code
    When the "Implementation using array" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation using array"
    When The user writes the inValid python code in Editor and Clicks Run button
    Then The User should should be in the same page with the error messages
    
  Scenario: Testing the Text Editor in Implementation using array with no code
    When the "Implementation using array" link is pressed on "Queue"
    When the "Editor" link is pressed on "Implementation using array"
    When The user Clicks Run button
    Then The User should should be in the same page with the error messages
    
  Scenario: Checking "Queue Operations" page loads from "Queue"
    When the "Queue Operations" link is pressed on "Queue"
    Then the expected "Queue Operations" page should open
   
  Scenario: Checking "Editor" page loads from "Queue Operations"
    When the "Editor" link is pressed on "Queue Operations"
    Then the expected "Editor" page should open
   
  Scenario: Checking "Practice" page loads from "Queue Operations"
    When the "Practice" link is pressed on "Queue Operations"
    Then the expected "Practice" page should open
    
  Scenario: Testing the Text Editor  in Queue Operations with valid code
    When the "Queue Operations" link is pressed on "Queue"
    When the "Editor" link is pressed on "Queue Operations"
    When The user writes the valid python code in Editor and clicks Run button
    Then The user  should be able to see the output in the console
    
  Scenario: Testing the Text Editor in Queue Operations with InValid code
    When the "Queue Operations" link is pressed on "Queue"
    When the "Editor" link is pressed on "Queue Operations"
    When The user writes the inValid python code in Editor and Clicks Run button
    Then The User should should be in the same page with the error messages
    
  Scenario: Testing the Text Editor in Queue Operations with no code
    When the "Queue Operations" link is pressed on "Queue"
    When the "Editor" link is pressed on "Queue Operations"
    When The user Clicks Run button
    Then The User should should be in the same page with the error messages