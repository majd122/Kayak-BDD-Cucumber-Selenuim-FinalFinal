package com.kayak.stepdefinitions;
import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyKayakFeedbackStepDef {
    MainPage mainPage= new MainPage();


    @When("User clicks on Feedback Button")
    public void user_clicks_on_feedback_button() {
mainPage.clickOnFeedbackButton();
    }

    @Then("User sure should be able to verify Powered by GetFeedBack is displayed")
    public void user_sure_should_be_able_to_verify_powered_by_get_feed_back_is_displayed() {
        Assert.assertTrue(mainPage.isPoweredByGetFeedbackDisplayed());
    }
}
