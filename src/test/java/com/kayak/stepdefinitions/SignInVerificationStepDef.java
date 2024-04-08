package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import com.kayak.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SignInVerificationStepDef {

    MainPage mainPage = new MainPage();

    @Given("The user to navigated successfully to Kayak Main page")
    public void the_user_to_navigated_successfully_to_kayak_main_page() {
        Driver.getDriver().get("https://www.kayak.com/");
    }

    @When("The user click on Sign in section in the Main page")
    public void the_user_click_on_sign_in_section_in_the_main_page() {

        mainPage.clickToSignInFromTheSection();
    }

    @Then("The user should be able to verify sign boxes displayed")
    public void the_user_should_be_able_to_verify_sign_boxes_displayed(DataTable dataTable) {
        List<String> expectedBoxes = dataTable.asList();
        List<String> actualBoxes = new ArrayList<>();
        actualBoxes.add(mainPage.getContinueWithEmailSignIn());
        actualBoxes.add(mainPage.getGoogleSignIn());
        actualBoxes.add(mainPage.getAppleSignIn());
        Assert.assertEquals(expectedBoxes,actualBoxes);

            }
}