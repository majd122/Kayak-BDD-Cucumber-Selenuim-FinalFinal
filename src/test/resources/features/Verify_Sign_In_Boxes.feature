
Feature: Sign in to Kayak
  The User should be able to see the sign in boxes displayed
  Scenario: Verify Sign in boxes is Displayed
    Given The user to navigated successfully to Kayak Main page
    When The user click on Sign in section in the Main page
    Then The user should be able to verify sign boxes displayed
      | Continue with email |
      | Google              |
      | Apple               |