package com.kayak.stepdefinitions;

import com.kayak.pages.PackagesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyAsiaAndPacificContactStepDef {
    PackagesPage packagesPage = new PackagesPage();

        @Then("User is should be enabled to check the apacpr@kayak.com")
        public void user_is_should_be_enabled_to_check_the_apacpr_kayak_com() {
            Assert.assertTrue(packagesPage.isAsiaAndPacificLinkEnabled());
        }

}
