package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import com.kayak.utilities.SeleniumUtils;
import io.cucumber.gherkin.Main;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyStaysPage {
    MainPage mainPage = new MainPage();
    @When("The user click on Stays in the section")
    public void the_user_click_on_stays_in_the_section() {
        mainPage.clickOnStaysButton();


    }

    @Then("The user should be able to verify Stays Page is Displayed")
    public void the_user_should_be_able_to_verify_stays_page_is_displayed() {
        Assert.assertTrue(mainPage.isStaysTextDisplayed());
    }

}
