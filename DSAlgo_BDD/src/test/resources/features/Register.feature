

Feature: Register 

 Scenario: Unsuccessful Register with in use credentials
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "Explorers@2024" and Password confirmation as "Explorers@2024"
    And User clicks on Register button
    Then the "duplicate_account:Username is already active" error should appear

 Scenario: Unsuccessful Register with mismatch passwords
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "Explorers" and Password confirmation as "Explorers@2024"
    And User clicks on Register button
    Then the "password_mismatch:The two password fields didn’t match." error should appear

 Scenario: Unsuccessful Register with numeric passwords
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "123456789" and Password confirmation as "123456789"
    And User clicks on Register button
    Then the "numeric_password:Your password can’t be entirely numeric." error should appear

 Scenario: Unsuccessful Register with common passwords
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "password" and Password confirmation as "password"
    And User clicks on Register button
    Then the "common_password:Your password can’t be a commonly used password." error should appear

 Scenario: Unsuccessful Register with similar passwords
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "TechieExplorers" and Password confirmation as "TechieExplorers"
    And User clicks on Register button
    Then the "similar_password:Your password can’t be too similar to your other personal information." error should appear

 Scenario: Unsuccessful Register with short passwords
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "t" and Password confirmation as "t"
    And User clicks on Register button
    Then the "short_password:Your password must contain at least 8 characters." error should appear