Feature: Verify car rating in cars page
Scenario: Verify Best score Rating in the cars page
  Given User is navigated successfully to Kayak Main page
  When User clicks on cars section
  And User clicks on See all
 And User clicks on Sort by
  And User select score rating
  Then The user should be able to verify rating is 4.8

