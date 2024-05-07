package com.kayak.stepdefinitions;

import com.kayak.pages.BusinessPage;
import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyBizPlusStepDef {
    MainPage mainPage= new MainPage();
    BusinessPage businessPage= new BusinessPage();
    @Then("User should be able to verify Biz+ coming soon is Displayed")
    public void user_should_be_able_to_verify_biz_coming_soon_is_displayed() {
Assert.assertTrue(businessPage.isBuzPlusIsDisplayed());
    }

}
