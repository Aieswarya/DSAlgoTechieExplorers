# Author: your.email@your.domain.com
# Keywords Summary:
# Feature: List of scenarios.
# Scenario: Business rule through list of steps with arguments.
# Given: Some precondition step
# When: Some key actions
# Then: To observe outcomes or validation
# And, But: To enumerate more Given, When, Then steps
# Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
# Examples: Container for a table
# Background: List of steps run before each of the scenarios
# """ (Doc Strings)
# | (Data Tables)
# @ (Tags/Labels): To group Scenarios
# <> (placeholder)
# "" (Comments)
# Sample Feature Definition Template


Feature: Array Data Structure
  
  Background: Login to the page
  	Given the user is logged in
    
  Scenario: Checking "Array" page loads from "Home"
    When the "Array" link is clicked on "Home"
    Then the expected "Array" page should load
    
  Scenario: Checking "Arrays in Python" page loads from "Array"
    When the "Arrays in Python" link is clicked on "Array"
    Then the expected "Arrays in Python" page should load
    
  Scenario: Checking "Arrays using List" page loads from "Array"
    When the "Arrays using List" link is clicked on "Array"
    Then the expected "Arrays using List" page should load
    
  Scenario: Checking "Basic Operations in Lists" page loads from "Array"
    When the "Basic Operations in Lists" link is clicked on "Array"
    Then the expected "Basic Operations in Lists" page should load
    
  Scenario: Checking "Applications of Array" page loads from "Array"
    When the "Applications of Array" link is clicked on "Array"
    Then the expected "Applications of Array" page should load
    
  Scenario: Checking "Arrays in Python" page loads from "Arrays in Python"
    When the "Arrays in Python" link is clicked on "Arrays in Python"
    Then the expected "Arrays in Python" page should load
    
  Scenario: Checking "Arrays using List" page loads from "Arrays in Python"
    When the "Arrays using List" link is clicked on "Arrays in Python"
    Then the expected "Arrays using List" page should load
    
  Scenario: Checking "Basic Operations in Lists" page loads from "Arrays in Python"
    When the "Basic Operations in Lists" link is clicked on "Arrays in Python"
    Then the expected "Basic Operations in Lists" page should load
    
  Scenario: Checking "Applications of Array" page loads from "Arrays in Python"
    When the "Applications of Array" link is clicked on "Arrays in Python"
    Then the expected "Applications of Array" page should load
    
  Scenario: Checking "Editor" page loads from "Arrays in Python"
    When the "Editor" link is clicked on "Arrays in Python"
    Then the expected "Editor" page should load
  	
  Scenario: Testing the Text Editor with valid code from "Arrays in Python"
    When the "Arrays in Python" link is clicked on "Array"
    When the "Editor" link is clicked on "Arrays in Python"
    When The user writes the Valid python code in Editor and Clicks Run button
    Then The User should be able to see the output in the console
    
  Scenario: Testing the Text Editor with InValid code from "Arrays in Python"
    When the "Arrays in Python" link is clicked on "Array"
    When the "Editor" link is clicked on "Arrays in Python"
    When The user writes the invalid python code in Editor and Clicks Run button
    Then The User should should be in the same page with an alert window
    
  Scenario: Testing the Text Editor with no code from "Arrays in Python"
    When the "Arrays in Python" link is clicked on "Array"
    When the "Editor" link is clicked on "Arrays in Python"
    When The user  Clicks Run button
    Then The User should should be in the same page with an alert window
    
  Scenario: Checking "Practice" page loads from "Arrays in Python"
    When the "Practice" link is clicked on "Arrays in Python"
    Then the expected "Practice" page should load
    
  Scenario: Checking "Arrays in Python" page loads from "Arrays using List"
    When the "Arrays in Python" link is clicked on "Arrays using List"
    Then the expected "Arrays in Python" page should load
    
  Scenario: Checking "Arrays using List" page loads from "Arrays using List"
    When the "Arrays using List" link is clicked on "Arrays using List"
    Then the expected "Arrays using List" page should load
    
  Scenario: Checking "Basic Operations in Lists" page loads from "Arrays using List"
    When the "Basic Operations in Lists" link is clicked on "Arrays using List"
    Then the expected "Basic Operations in Lists" page should load
    
  Scenario: Checking "Applications of Array" page loads from "Arrays using List"
    When the "Applications of Array" link is clicked on "Arrays using List"
    Then the expected "Applications of Array" page should load
    
  Scenario: Checking "Editor" page loads from "Arrays using List"
    When the "Editor" link is clicked on "Arrays using List"
    Then the expected "Editor" page should load
  	
  Scenario: Testing the Text Editor with valid code from "Arrays using List"
    When the "Arrays using List" link is clicked on "Array"
    When the "Editor" link is clicked on "Arrays using List"
    When The user writes the Valid python code in Editor and Clicks Run button
    Then The User should be able to see the output in the console
    
  Scenario: Testing the Text Editor with InValid code from "Arrays using List"
    When the "Arrays using List" link is clicked on "Array"
    When the "Editor" link is clicked on "Arrays using List"
    When The user writes the invalid python code in Editor and Clicks Run button
    Then The User should should be in the same page with an alert window
    
  Scenario: Testing the Text Editor with no code from "Arrays using List"
    When the "Arrays using List" link is clicked on "Array"
    When the "Editor" link is clicked on "Arrays using List"
    When The user  Clicks Run button
    Then The User should should be in the same page with an alert window
    
  Scenario: Checking "Practice" page loads from "Arrays using List"
    When the "Practice" link is clicked on "Arrays using List"
    Then the expected "Practice" page should load
    
  Scenario: Checking "Arrays in Python" page loads from "Basic Operations in Lists"
    When the "Arrays in Python" link is clicked on "Basic Operations in Lists"
    Then the expected "Arrays in Python" page should load
    
  Scenario: Checking "Arrays using List" page loads from "Basic Operations in Lists"
    When the "Arrays using List" link is clicked on "Basic Operations in Lists"
    Then the expected "Arrays using List" page should load
    
  Scenario: Checking "Basic Operations in Lists" page loads from "Basic Operations in Lists"
    When the "Basic Operations in Lists" link is clicked on "Basic Operations in Lists"
    Then the expected "Basic Operations in Lists" page should load
    
  Scenario: Checking "Applications of Array" page loads from "Basic Operations in Lists"
    When the "Applications of Array" link is clicked on "Basic Operations in Lists"
    Then the expected "Applications of Array" page should load
    
  Scenario: Checking "Editor" page loads from "Basic Operations in Lists"
    When the "Editor" link is clicked on "Basic Operations in Lists"
    Then the expected "Editor" page should load
  	
  Scenario: Testing the Text Editor with valid code from "Basic Operations in Lists"
    When the "Basic Operations in Lists" link is clicked on "Array"
    When the "Editor" link is clicked on "Basic Operations in Lists"
    When The user writes the Valid python code in Editor and Clicks Run button
    Then The User should be able to see the output in the console
    
  Scenario: Testing the Text Editor with InValid code from "Basic Operations in Lists"
    When the "Basic Operations in Lists" link is clicked on "Array"
    When the "Editor" link is clicked on "Basic Operations in Lists"
    When The user writes the invalid python code in Editor and Clicks Run button
    Then The User should should be in the same page with an alert window
    
  Scenario: Testing the Text Editor with no code from "Basic Operations in Lists"
    When the "Basic Operations in Lists" link is clicked on "Array"
    When the "Editor" link is clicked on "Basic Operations in Lists"
    When The user  Clicks Run button
    Then The User should should be in the same page with an alert window
    
  Scenario: Checking "Practice" page loads from "Basic Operations in Lists"
    When the "Practice" link is clicked on "Basic Operations in Lists"
    Then the expected "Practice" page should load
    
  Scenario: Checking "Arrays in Python" page loads from "Applications of Array"
    When the "Arrays in Python" link is clicked on "Applications of Array"
    Then the expected "Arrays in Python" page should load
    
  Scenario: Checking "Arrays using List" page loads from "Applications of Array"
    When the "Arrays using List" link is clicked on "Applications of Array"
    Then the expected "Arrays using List" page should load
    
  Scenario: Checking "Basic Operations in Lists" page loads from "Applications of Array"
    When the "Basic Operations in Lists" link is clicked on "Applications of Array"
    Then the expected "Basic Operations in Lists" page should load
    
  Scenario: Checking "Applications of Array" page loads from "Applications of Array"
    When the "Applications of Array" link is clicked on "Applications of Array"
    Then the expected "Applications of Array" page should load
    
  Scenario: Checking "Editor" page loads from "Applications of Array"
    When the "Editor" link is clicked on "Applications of Array"
    Then the expected "Editor" page should load
  	
  Scenario: Testing the Text Editor with valid code from "Applications of Array"
    When the "Applications of Array" link is clicked on "Array"
    When the "Editor" link is clicked on "Applications of Array"
    When The user writes the Valid python code in Editor and Clicks Run button
    Then The User should be able to see the output in the console
    
  Scenario: Testing the Text Editor with InValid code from "Applications of Array"
    When the "Applications of Array" link is clicked on "Array"
    When the "Editor" link is clicked on "Applications of Array"
    When The user writes the invalid python code in Editor and Clicks Run button
    Then The User should should be in the same page with an alert window
    
  Scenario: Testing the Text Editor with no code from "Applications of Array"
    When the "Applications of Array" link is clicked on "Array"
    When the "Editor" link is clicked on "Applications of Array"
    When The user  Clicks Run button
    Then The User should should be in the same page with an alert window
    
  Scenario: Checking "Practice" page loads from "Applications of Array"
    When the "Practice" link is clicked on "Applications of Array"
    Then the expected "Practice" page should load
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

#  Scenario: "Array" page navigation test
#    When the user clicks a button the page should load
  
 # Scenario: Validate the "Try Editor" with correct code in Arrays in Python
 #  Given The user is on the "Arrays in Python" page after logging in
 #  When The user clicks on the "Try Here" button on the Arrays in Python page
 #   Then The user should be redirected to a page with a "Try Editor" and a "Run" button to test arrays
 #   When The user enters the following correct code into the "Try Editor"
  #   """python
   #   print([1, 2, 3, 4])
  #  """
  # And The user clicks on the "Run" button
  # Then The user should see the output "1, 2, 3, 4"

#  Scenario: Validate the "Try Editor" with incorrect code in Arrays in Python
#    Given The user is on the "Arrays in Python" page after logging in
#    When The user clicks on the "Try Here" button on the Arrays in Python page
#    Then The user should be redirected to a page with a "Try Editor" and a "Run" button to test arrays
#    When The user enters the following incorrect code into the "Try Editor"
#      """python
#      print([1, 2, 3, 4
#      """
#    And The user clicks on the "Run" button
#    Then The user should see an error message

#  Scenario: Validate the "Try Editor" with correct code in Arrays using List
#    Given The user is on the "Arrays using List" page after logging in
#    When The user clicks on the "Try Here" button in the Arrays using List page
#    Then The user should be redirected to a page with a "Try Editor" and a "Run" button to test arrays
#    When The user enters the following correct code into the "Try Editor"
#      """python
#      my_list = [10, 20, 30]
#      print(my_list)
#      """
#    And The user clicks on the "Run" button
#    Then The user should see the output "10, 20, 30"

#  Scenario: Validate the "Try Editor" with incorrect code in Arrays using List
#    Given The user is on the "Arrays using List" page after logging in
#    When The user clicks on the "Try Here" button in the Arrays using List page
#    Then The user should be redirected to a page with a "Try Editor" and a "Run" button to test arrays
#    When The user enters the following incorrect code into the "Try Editor"
#      """python
#      my_list = [10, 20, 30
#      print(my_list)
#      """
#    And The user clicks on the "Run" button
#    Then The user should see an error message

#  Scenario: Validate the "Basic Operations in List" section
#    When The user clicks on the "Basic Operations in List" button
#    Then The user should be redirected to the "Basic Operations in List" page

#  Scenario: Validate the "Try Editor" with correct code in Basic Operations in List
#    Given The user is on the "Basic Operations in List" page after logging in
#    When The user clicks on the "Try Here" button in the Basic Operations in List page
#    Then The user should be redirected to a page with a "Try Editor" and a "Run" button to test basic operations
#    When The user enters the following correct code into the "Try Editor"
#      """python
#      my_list = [1, 2, 3, 4]
#      my_list.append(5)
#      print(my_list)
#      """
#    And The user clicks on the "Run" button
#    Then The user should see the output "1, 2, 3, 4, 5"

#  Scenario: Validate the "Try Editor" with incorrect code in Basic Operations in List
#    Given The user is on the "Basic Operations in List" page after logging in
#    When The user clicks on the "Try Here" button in the Basic Operations in List page
#    Then The user should be redirected to a page with a "Try Editor" and a "Run" button to test basic operations
#    When The user enters the following incorrect code into the "Try Editor"
#      """python
#      my_list = [1, 2, 3, 4
#      my_list.append(5)
#      print(my_list)
#      """
#    And The user clicks on the "Run" button
#    Then The user should see an error message

#  Scenario: Validate the "Applications of Array" section
#    When The user clicks on the "Applications of Array" button
#    Then The user should be redirected to the "Applications of Array" page

#  Scenario: Validate the "Try Editor" with correct code in Applications of Array
#    Given The user is on the "Applications of Array" page after logging in
#    When The user clicks on the "Try Here" button in the Applications of Array page
#    Then The user should be redirected to a page with a "Try Editor" and a "Run" button to test arrays in applications
#    When The user enters the following correct code into the "Try Editor"
#      """python
#      arr = [1, 2, 3]
#      print(arr[0] + arr[1])
#      """
#    And The user clicks on the "Run" button
#    Then The user should see the output "3"

#  Scenario: Validate the "Try Editor" with incorrect code in Applications of Array
#    Given The user is on the "Applications of Array" page after logging in
#    When The user clicks on the "Try Here" button in the Applications of Array page
#    Then The user should be redirected to a page with a "Try Editor" and a "Run" button to test arrays in applications
#    When The user enters the following incorrect code into the "Try Editor"
#      """python
#      arr = [1, 2, 3]
#      print(arr[0] + arr[1
#      """
#    And The user clicks on the "Run" button
#    Then The user should see an error message 