@run
Feature: Verify Flights section
  The user should be able to see the Flights page when user click on Flights button
  Scenario: Verify Flights page is Displayed
    Given The user to navigated successfully to Kayak Main page
    When The user click on Flights section
    Then The user should be able to verify Flights Page text is Displayed