package com.kayak.stepdefinitions;

import com.kayak.pages.AskKayakPage;
import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyAskKayakStepDef {
    MainPage mainPage = new MainPage();
    AskKayakPage askKayakPage = new AskKayakPage();
    @When("User clicks on Ask Kayak")
    public void user_clicks_on_ask_kayak() {
    mainPage.clickOnAskKayakMainPage();
    }

    @When("User types Hotels in the search bar")
    public void user_types_hotels_in_the_search_bar() {
       askKayakPage.addTextToTheSearchBar("hotels");
    }

    @When("Clicks on search")
    public void clicks_on_search() {
  askKayakPage.clickOnSubmitButton();
    }

    @Then("User should be able to see Hotel Recommendations as result is Displayed")
    public void user_should_be_able_to_see_hotel_recommendations_as_result() {
        Assert.assertEquals("Hotel Recommendations.",askKayakPage.isHotelsRecommendationDisplayed());
    }
}
