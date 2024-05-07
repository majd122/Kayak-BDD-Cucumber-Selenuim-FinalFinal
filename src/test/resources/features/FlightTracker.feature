@smoke
Feature: Verify Flight Tracker

  Scenario: Verify wrong flight tracker number
    Given User is navigated successfully to Kayak Main page
    When User clicks on Flight Tracker
    And User add the airline and flight number
    When User Click on Track Flight button
    Then The user should be able to verify Unknown Flight. Sorry, we could not find this flight in our system. is displayed
