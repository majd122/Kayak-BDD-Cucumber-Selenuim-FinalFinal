@run
Feature: Verify Booking Holding label on the main page
  The user I should be able to see the logo displayed in the main page


   Scenario:User is able to validate the list of labels
     Given User is navigated successfully to Kayak Main page
     When  User scroll down to the bottom of the page
     Then  User is able to verify the labels is displayed
       | Booking.com |
       | KAYAK       |
       | OpenTable   |
       | priceline   |
       | agoda       |