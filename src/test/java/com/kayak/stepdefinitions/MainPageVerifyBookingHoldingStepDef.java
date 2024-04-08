package com.kayak.stepdefinitions;

import com.kayak.pages.MainPage;
import com.kayak.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainPageVerifyBookingHoldingStepDef {
    MainPage mainPage = new MainPage();


    @When("User scroll down to the bottom of the page")
    public void user_scroll_down_to_the_bottom_of_the_page() {
        mainPage.scrollToBookingElement();
    }

    @Then("User is able to verify the labels is displayed")
    public void user_is_able_to_verify_the_labels_is_displayed( List<String> expectedLabels) {

        List<String> actualLabels= new ArrayList<>();
        actualLabels.add(mainPage.getBookingLogo());
        actualLabels.add(mainPage.getKayakLogo());
        actualLabels.add(mainPage.getOpenTableLogo());
        actualLabels.add(mainPage.getPricelineLogo());
        actualLabels.add(mainPage.getAgodaLogo());
        Assert.assertEquals(expectedLabels,actualLabels);





    }

}
