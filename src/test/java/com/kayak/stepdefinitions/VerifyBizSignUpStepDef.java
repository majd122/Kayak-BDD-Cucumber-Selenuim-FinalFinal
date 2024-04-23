package com.kayak.stepdefinitions;

import com.kayak.pages.BusinessPage;
import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyBizSignUpStepDef {

    MainPage mainPage= new MainPage();
    BusinessPage businessPage= new BusinessPage();


    @Then("User should be able to verify Biz Free Sign up now is displayed")
    public void user_should_be_able_to_verify_biz_free_sign_up_now_is_displayed() {
      Assert.assertTrue(businessPage.isBizFreeSignUpIsDisplayed());
    }

}
