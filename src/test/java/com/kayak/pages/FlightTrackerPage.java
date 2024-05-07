package com.kayak.pages;

import com.kayak.utilities.Driver;
import com.kayak.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightTrackerPage {
    private static final Logger logger = LogManager.getLogger(BusinessPage.class);
    public FlightTrackerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//input[@id='S3tz-flightNumberTrackForm-airline']")
    WebElement airlineField;
    @FindBy(xpath = "//input[@id='c1I5c-flightNumberTrackForm-flight-number']")
    WebElement flightNumberField;
    @FindBy(xpath = "//button[@id='c1I5c-flightNumberTrackForm-submit']")
    WebElement trackFlightButton;

    @FindBy(xpath = "//div[@class='col unknownFLight']")
    WebElement flightMessageField;

    //---------------------------------------------------

    /**
     * adding input to the airline box
     */
    public void addAirline(String input){
        logger.info("add string to file up the airline box"+input);
        airlineField.sendKeys(input);
    }
    /**
     * adding input to the flight  number  box
     */
    public void addFlightNumber(String input ){
        logger.info("add string to file up the flight number box"+input);

        flightNumberField.sendKeys(input);
    }
    /**
     * click on flight tracker button
     */
    public void clickOnFlightTrackerButton(){
        logger.info("add string to file up the flight number box");
        trackFlightButton.click();
    }
 public boolean isFlightMessageDisplayed(){
        return flightMessageField.isDisplayed();
 }

}
