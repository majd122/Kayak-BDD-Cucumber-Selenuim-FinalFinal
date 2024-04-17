package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyCarsPageStepDef {
    MainPage mainPage =new MainPage();
    @When("The user click on Cars section")
    public void the_user_click_on_cars_section() {
   mainPage.clickOnCarsButton();
    }

    @Then("The user should be able to verify Cars Page text is Displayed")
    public void the_user_should_be_able_to_verify_cars_page_text_is_displayed() {
        Assert.assertTrue(mainPage.isCarsTextDisplayed());
    }
}
