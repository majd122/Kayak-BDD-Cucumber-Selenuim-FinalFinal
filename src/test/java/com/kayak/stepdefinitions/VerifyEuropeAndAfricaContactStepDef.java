package com.kayak.stepdefinitions;

import com.kayak.pages.PackagesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyEuropeAndAfricaContactStepDef {
    PackagesPage packagesPage = new PackagesPage();

    @Then("User is should be enabled to check the emea_pr@kayak.com")
    public void user_is_should_be_enabled_to_check_the_emea_pr_kayak_com() {
        Assert.assertTrue(packagesPage.isEuropeAndAfricaLinkEnabled());
    }
}
