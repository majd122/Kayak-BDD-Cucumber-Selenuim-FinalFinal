package com.kayak.stepdefinitions;

import com.kayak.pages.CarPage;
import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyRatingCarsStepDef {
    MainPage mainPage= new MainPage();
    CarPage carPage = new CarPage();
    @When("User clicks on cars section")
    public void user_clicks_on_cars_section() {
mainPage.clickOnCarsButton();
    }

    @When("User clicks on See all")
    public void user_clicks_on_see_all() {
carPage.clickOnSeeAllButton();
    }

    @When("User clicks on Sort by")
    public void user_clicks_on_sort_by() {
carPage.clickOnSortByButton();
    }

    @When("User select score rating")
    public void user_select_score_rating() {
carPage.clickOnBestScoreSortBy();
    }

    @Then("The user should be able to verify rating is {double}")
    public void the_user_should_be_able_to_verify_rating_is(Double actualResult) {
        Assert.assertEquals(carPage.isRateIsDisplayed(),actualResult);

    }

}
