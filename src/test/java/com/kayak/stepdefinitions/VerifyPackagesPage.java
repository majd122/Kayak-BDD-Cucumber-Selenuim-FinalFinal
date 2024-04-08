package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyPackagesPage {
    MainPage mainPage = new MainPage();
    @When("The user click on Packages s in the section")
    public void the_user_click_on_packages_s_in_the_section() {
mainPage.clickOnPackagesButton();
    }

    @Then("The user should be able to verify Packages Page text is Displayed")
    public void the_user_should_be_able_to_verify_packages_page_text_is_displayed() {
        mainPage.isPackagesTextDisplayed();

    }

}
