Feature: Sign in to Kayak

  Scenario: Verify Sign in options is Displayed
    Given The user to navigated successfully to Kayak Main page
    When The user click on Sign in section in the Main page
    Then The user should be able to verify sign in option displayed
      | Continue with email |
      | Google              |
      | Apple               |