package com.kayak.stepdefinitions;

import com.kayak.pages.FlightTrackerPage;
import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyFlightTrackerStepDef {
    MainPage mainPage = new MainPage();
    FlightTrackerPage flightTrackerPage = new FlightTrackerPage();
    @When("User clicks on Flight Tracker")
    public void user_clicks_on_flight_tracker() {
  mainPage.clickOnFlightTracker();
    }

    @When("User add the airline and flight number")
    public void user_add_the_airline_and_flight_number() {
       flightTrackerPage.addAirline("Detroit");
       flightTrackerPage.addFlightNumber("09680");
    }

    @When("User Click on Track Flight button")
    public void user_click_on_track_flight_button() {
        flightTrackerPage.clickOnFlightTrackerButton();

    }

    @Then("The user should be able to verify Unknown Flight. Sorry, we could not find this flight in our system. is displayed")
    public void the_user_should_be_able_to_verify_unknown_flight_sorry_we_could_not_find_this_flight_in_our_system_is_displayed() {
        Assert.assertTrue(flightTrackerPage.isFlightMessageDisplayed());
    }

}
