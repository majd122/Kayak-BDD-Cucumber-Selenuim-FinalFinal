package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import com.kayak.pages.PackagesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyNorthAmericaContactStepDef {
    MainPage mainPage= new MainPage();
    PackagesPage packagesPage = new PackagesPage();
    @When("User clicks on packages button")
    public void user_clicks_on_packages_button() {
mainPage.clickOnPackagesButton();
    }

    @When("User click on press link in contact list")
    public void user_click_on_press_link_in_contact_list() {
       packagesPage.clickOnPressLink();
    }

    @Then("User is should be enabled to check the press@kayak.com")
    public void user_is_should_be_enabled_to_check_the_press_kayak_com() {
        Assert.assertTrue(packagesPage.isNorthAmericaEmailEnabled());
    }
}
