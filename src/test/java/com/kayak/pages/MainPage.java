package com.kayak.pages;

import com.kayak.utilities.Driver;
import com.kayak.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MainPage {
    private static final Logger logger = LogManager.getLogger(MainPage.class);


    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='logo-image']")
    WebElement kayakLogo;
    @FindBy(xpath = "//li[@class='FyHn-item FyHn-booking']")
    WebElement bookingEle;

    @FindBy(xpath = "//li[@class='FyHn-item FyHn-kayak']")
    WebElement kayakEle;

    @FindBy(xpath = "//li[@class='FyHn-item FyHn-opentable']")
    WebElement openTableEle;

    @FindBy(xpath = "//li[@class='FyHn-item FyHn-priceline']")
    WebElement pricelineEle;
    @FindBy(xpath = "//li[@class='FyHn-item FyHn-agoda']")
    WebElement agodaEle;

    @FindBy(xpath = "//li[@class='FyHn-item FyHn-agoda']")
    WebElement listOfElements;


    @FindBy(xpath = "//div[@class='Iqt3-button-content' and .='Sign in']")
    WebElement signInBox;
    @FindBy(xpath = "//div[@class='dJtn dJtn-expanded dJtn-mod-variant-accordion'and .='Sign in']")
    WebElement signInSection;



    @FindBy(xpath = "//div[@class='Iqt3-button-content' and .='Continue with email']")
    WebElement continueWithEmailButton;
    @FindBy(xpath = "//div[@class='social-button-short-text' and .='Google']")
    WebElement googleButton;

@FindBy(xpath = "//div[@class='social-button-short-text' and .='Apple']")
WebElement appleButton;

    //================================== > Methods < ===========================


    /**
     * so this one to return if the logo is displayed
     *
     * @return true or false
     */
    public boolean isMainLogoDisplayed() {
        logger.info("Checking if the Main Logo Label is displayed or not");
        return kayakLogo.isDisplayed();
    }

    /**
     * scroll down create it here for the desire of the test case
     * just scroll down to see the rest of the elements at the bottom of the page
     */
    public void scrollToBookingElement() {
        logger.info("scroll down to the end of the web page ");
        SeleniumUtils.scrollToElementUsingJavaScriptExecutor(bookingEle);

    }
    /**
     * this is for booking if is displayed or not
     * @return true or false
     */
    public boolean isBookingDisplayed() {
        logger.info("Checking the booking logo is Displayed");
        return bookingEle.isDisplayed();

    }
    /**
     * this is for kayak  element(not the main logo) is displayed or not
     * @return true or false
     */
    public boolean isKayakDisplayed() {
        logger.info("Checking the kayak logo is Displayed");
        return kayakEle.isDisplayed();
    }
    /**
     * this is for table element is displayed or not
     * @return true or false
     */
    public boolean isOpenTableEleDisplayed() {
        logger.info("Checking the openTable logo is Displayed");
        return openTableEle.isDisplayed();
    }

    /**
     * price line is displayed or not
     * @return true or false
     */
    public boolean isPricelineEleDisplayed() {
        logger.info("Checking the priceline logo is Displayed");
        return pricelineEle.isDisplayed();
    }

    /**
     * this is for Agoda logo if is displayed on the web,
     * @return true or false
     */
    public boolean isAgodaDisplayed() {
        logger.info("Checking the Agoda logo is Displayed");
        return  agodaEle.isDisplayed();
    }

    public boolean checkTheElements(String elementSection){
        logger.info("Checking the elements at the bottom in the main page");
        Select select = new Select(listOfElements);
        List<WebElement> filerOfList= select.getOptions();
        for (WebElement v : filerOfList){
            if (v.getText().equals(elementSection) && v.isDisplayed()){
                return true;
            }
        }
        return false;
    }
    public void clickTOSignIn() {
        signInBox.click();
        SeleniumUtils.waitForElementToBeSelected(continueWithEmailButton);
    }
    public void clickToSignInFromTheSection(){
            signInSection.click();
            SeleniumUtils.switchToNewWindow();
        }

    public String getContinueWithEmailSignIn(){
        logger.info("getting the text for Continue with email  ");
       return continueWithEmailButton.getText();

    }
    public String getGoogleSignIn() {
        logger.info("Getting the text for Google");
        return googleButton.getText();
    }
    public String getAppleSignIn() {
        logger.info("getting the text for apple ");
        return appleButton.getText();
    }

}