package com.kayak.stepdefinitions;

import com.kayak.pages.BusinessPage;
import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;

public class VerifyContactButtonBusinessStepDef {
    MainPage mainPage = new MainPage();
    BusinessPage businessPage = new BusinessPage();
    @When("User clicks on Kayak for Business")
    public void user_clicks_on_kayak_for_business() {
mainPage.clickOnKayakBusinessButton();
    }

    @Then("The user should be able to verify Contact us is Enabled")
    public void the_user_should_be_able_to_verify_contact_us_is_enabled(){
Assert.assertTrue(businessPage.isContactUsButtonIsEnabled());
    }
}
