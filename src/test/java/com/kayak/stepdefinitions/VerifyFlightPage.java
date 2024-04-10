package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import io.cucumber.gherkin.Main;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;

public class VerifyFlightPage {
    MainPage mainPage = new MainPage();
    @When("The user click on Flights section")
    public void the_user_click_on_flights_section() {
        mainPage.clickOnFlightsButton();
//
    }

    @Then("The user should be able to verify Flights Page text is Displayed")
    public void the_user_should_be_able_to_verify_flights_page_text_is_displayed() {
        Assert.assertTrue(mainPage.isFlightsTextDisplayed());

    }

}
