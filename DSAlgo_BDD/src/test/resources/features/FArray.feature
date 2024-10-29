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
