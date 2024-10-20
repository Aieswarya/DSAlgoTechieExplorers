Feature: SignIn

Scenario: The user signs in
Given The user is on sign in page
When The user passes credentials to username and password fields
Then The user is on DS Home Page with sign in
