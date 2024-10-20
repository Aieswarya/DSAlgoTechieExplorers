

Feature: Register 

 Scenario: Unsuccessful Register with in use credentials
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "Explorers@2024" and Password confirmation as "Explorers@2024"
    And User clicks on Register button
    Then the alert should appear

 Scenario: Unsuccessful Register with mismatch passwords
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "Explorers" and Password confirmation as "Explorers@2024"
    And User clicks on Register button
    Then the alert should appear

 Scenario: Unsuccessful Register with bad password
		Given User Launches register page
    And User enters Username as "TechieExplorers" and Password as "2024" and Password confirmation as "2024"
    And User clicks on Register button
    Then the alert should appear