package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import com.kayak.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;

public class MainPageVerifyBookingHoldingStepDef {
    MainPage mainPage = new MainPage();
    @Given("User is navigated successfully to Kayak Main page")
    public void user_is_navigated_successfully_to_kayak_main_page() {
        Driver.getDriver().get("https://www.kayak.com/");
    }

    @When("User scroll down to the bottom of the page")
    public void user_scroll_down_to_the_bottom_of_the_page() {
        mainPage.scrollToBookingElement();

    }

    @Then("User is able to verify the labels is displayed")
    public void user_is_able_to_verify_the_labels_is_displayed(DataTable dataTable) {


    }

}
