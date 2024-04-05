package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import com.kayak.utilities.Driver;
import com.kayak.utilities.SeleniumUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class MainPageLogosStepDef {
MainPage mainPage = new MainPage();

    @Given("User is navigated successfully to Kayak Main page")
    public void user_is_navigated_successfully_to_kayak_main_page() {
        Driver.getDriver().get("https://www.kayak.com/");
    }

    @Then("User is able to see the Kayak logo")
    public void user_is_able_to_see_the_kayak_logo() {
        Assert.assertTrue(mainPage.isMainLogoDisplayed());

    }

    @When("User scroll down to the bottom of the page")
    public void user_scroll_down_to_the_bottom_of_the_page() {
//mainPage.scrollDown();

    }

    @Then("User is able to verify the list of logos")
    public void user_is_able_to_verify_the_list_of_logos(List<Map<String,String>> listOfLabels) {
       // for ()

    }




}
