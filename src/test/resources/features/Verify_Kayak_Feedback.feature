@new
Feature: Verify Kayak Feedback
  User should be able to verify the feedback for kayak
  Scenario: User should be able to verify Powered by GetFeedBack
    Given User is navigated successfully to Kayak Main page
    When User clicks on Feedback Button
    Then User sure should be able to verify Powered by GetFeedBack is displayed