package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import com.kayak.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;

public class Sign_InOptions {
    MainPage mainPage = new MainPage();


    @Given("The user to navigated successfully to Kayak Main page")
    public void the_user_to_navigated_successfully_to_kayak_main_page() {

        Driver.getDriver().get("https://www.kayak.com/");

    }

    @When("The user click on Sign in section in the Main page")
    public void the_user_click_on_sign_in_section_in_the_main_page() {


    }

    @Then("The user should be able to verify sign in option displayed")
    public void the_user_should_be_able_to_verify_sign_in_option_displayed(DataTable dataTable) {

    }
}
