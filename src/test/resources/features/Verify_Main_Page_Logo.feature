@smoke
Feature: Check Logo in the main page
   As User should be able to see the Kayak logos in the main page
Background:
  Given User is navigated successfully to Kayak Main page

  Scenario: Verify kayak logo are displayed in the main page
    Then User is able to see the Kayak logo

#    Scenario: Verify labels are displayed in the main page
#      When User scroll down to the bottom of the page
#      Then User is able to verify the list of logos is displayed
#        | Booking.com |
#        | KAYAK       |
#        | OpenTable   |
#        | priceline   |
#        | agoda       |
