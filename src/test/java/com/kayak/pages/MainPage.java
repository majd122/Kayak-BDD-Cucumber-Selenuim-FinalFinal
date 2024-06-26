package com.kayak.pages;

import com.kayak.utilities.Driver;
import com.kayak.utilities.SeleniumUtils;
import io.cucumber.java.eo.Se;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

   // @FindBy(xpath = "//div[@class='FyHn-inner-wrapper']")
   // WebElement logosField;

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
    @FindBy(xpath = "//span[@class='J-sA-label']")
    WebElement signInSection;

    @FindBy(xpath = "//div[@class='common-authentication-react-AuthenticationDialog authentication--dialog unified-login unified-login']")
    WebElement getSignInBox;
    @FindBy(xpath = "//div[@class='Iqt3-button-content' and .='Continue with email']")
    WebElement continueWithEmailButton;
    @FindBy(xpath = "//div[@class='social-button-short-text' and .='Google']")
    WebElement googleButton;

    @FindBy(xpath = "//div[@class='social-button-short-text' and .='Apple']")
    WebElement appleButton;
    @FindBy(xpath = "//div[@class='dJtn-menu-item-title' and .='Stays']")
    WebElement staysField;
    @FindBy(xpath = "//div[@class='P4Ui-header']")
    WebElement staysPageText;
    @FindBy(xpath = "//div[@class='dJtn-menu-item-title' and .='Packages']")
    WebElement packagesField;
    @FindBy(xpath = "//div[@class='P4Ui-text-content kml-layout snap edges']")
    WebElement packagesPageText;
    @FindBy(xpath = "//div[@class='dJtn-menu-item-title' and .='Cars']")
    WebElement carsField;
    @FindBy(xpath = "//div[@class='P4Ui-header']")
    WebElement carsTextPage;
    @FindBy(xpath = "//div[@class='dJtn-menu-item-title' and .='Flights']")
    WebElement flightsFiled;

    @FindBy(xpath = "//div[@class='P4Ui-title-wrapper']")
    WebElement flightsTextPage;


    @FindBy(xpath = "//div[@class='dJtn-menu-item-title' and .='KAYAK for Business']")
    WebElement kayakForBusinessField;
    @FindBy(xpath = "//div[@class='RrEN ncEv dJtn-menu-item-icon']")
    WebElement askKayakField;


    @FindBy(xpath = "//div[@class='dJtn-menu-item-title' and .='Flight Tracker']")
    WebElement flightTrackerField;

    @FindBy(xpath = "//div[@class='dJtn-menu-item-title' and .='Feedback']")
    WebElement feedbackButtonField;
    @FindBy(xpath = "//a[@class='powered-by']")
    WebElement getFeedBackLogoField;




    //================================== > Methods < ===========================


    /**
     *
     * click on FeedBack button on main page
     */
    public void clickOnFeedbackButton(){
    feedbackButtonField.click();
}

    /** this method check if the logo is present on the ui
     * needs to handle iframe in this method using selenium Utils
     * @return true false
     */
    public boolean isPoweredByGetFeedbackDisplayed(){
logger.info("is this element displayed checking for Feedback  Powered By : feedback");
SeleniumUtils.waitForVisibilityOfElement(getFeedBackLogoField);
        return getFeedBackLogoField.isDisplayed();
}

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
        JavascriptExecutor jse6 = (JavascriptExecutor) Driver.getDriver();
        jse6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        SeleniumUtils.waitForVisibilityOfElement(pricelineEle);
//        }else {
//            jse6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//            SeleniumUtils.waitForVisibilityOfElement(pricelineEle);
//        }


    }

    /**
     * this is for booking if is displayed or not
     *
     * @return true or false
     */
    public String getBookingLogo() {
        logger.info("Checking the booking logo is Displayed");
        return bookingEle.getText();

    }

    /**
     * this is for kayak  element(not the main logo) is displayed or not
     *
     * @return String
     */
    public String getKayakLogo() {
        logger.info("Checking the kayak logo is Displayed");
        return kayakEle.getText();
    }

    /**
     * this is for table element is displayed or not
     *
     * @return String
     */
    public String getOpenTableLogo() {
        logger.info("Checking the openTable logo is Displayed");
        return openTableEle.getText();
    }

    /**
     * price line is displayed or not
     *
     * @return String
     */
    public String getPricelineLogo() {
        logger.info("Checking the priceline logo is Displayed");
        return pricelineEle.getText();
    }

    /**
     * this is for Agoda logo if is displayed on the web,
     *
     * @return String
     */
    public String getAgodaLogo() {
        logger.info("Checking the Agoda logo is Displayed");
        return agodaEle.getText();
    }

    /**
     *
     * checking the elements from the ui
     * not sure, may not use it but there in case
     * @param elementSection takes String Value
     * @return true or false
     */
    public boolean checkTheElements(String elementSection) {
        logger.info("Checking the elements at the bottom in the main page");
        Select select = new Select(listOfElements);
        List<WebElement> filerOfList = select.getOptions();
        for (WebElement v : filerOfList) {
            if (v.getText().equals(elementSection) && v.isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    /**
     * click to sign in box
     */

    public void clickTOSignIn() {
        logger.info("click on sign in box ");
        signInSection.click();
    }

    /**
     *
     */

    public void clickToSignInFromTheSection() {
logger.info("click on sigh in from the section ");
        signInSection.click();

    }


    /** checking if we continue with email box is displayed
     *
     * @return boolean true or false
     */
    public boolean isContinueWithEmailSignInDisplayed() {
        logger.info("getting the text for Continue with email  ");
        return continueWithEmailButton.isDisplayed();

    }
    /** checking if we continue with Google box is displayed
     *
     * @return boolean true or false
     */
    public boolean isGoogleSignInDisplayed() {
        logger.info("Getting the text for Google");
        return googleButton.isDisplayed();
    }
    /** checking if we continue with apple box is displayed
     *
     * @return boolean true or false
     */
    public boolean isAppleSignInDisplayed() {
        logger.info("getting the text for apple ");
        return appleButton.isDisplayed();
    }
    /** click on stay button

     */
    public void clickOnStaysButton() {
        logger.info("click on Stays Section");
        staysField.click();
    }
    /** checking if stays is displayed or not on the ui
     *
     * @return boolean true or false
     */

    public boolean isStaysTextDisplayed() {
        logger.info("get the text inside the Stays Page");
        return staysPageText.isDisplayed();
    }

    /**click on package button on the section
     */
    public void clickOnPackagesButton() {
        logger.info("click on Packages button Section");
        packagesField.click();
    }
    /** checking  package text on the ui
     * @return boolean true or false
     */

    public boolean isPackagesTextDisplayed() {
        logger.info("get the text inside the Packages Page");
        return packagesPageText.isDisplayed();
    }

    /**
     *
     * click on the cars button inside the section
     */

    public void clickOnCarsButton() {
        logger.info("click on Packages button Section");
  carsField.click();
    }

    /** checking the cqrs text from the ui if is displayed or not
     *
     * @return boolean true or false
     */

    public boolean isCarsTextDisplayed() {
        logger.info("get the text inside the Packages Page");
        return carsTextPage.isDisplayed();
    }

    /**
     * click on flight button present on the section side
     */

    public void clickOnFlightsButton() {
        logger.info("click on Flights button Section");
        flightsFiled.click();
    }
    /** checking if flight text displayed omn the flight page
     *
     * @return boolean true or false
     */

    public boolean isFlightsTextDisplayed() {
        logger.info("get the text inside the Flights Page");
        return flightsTextPage.isDisplayed();
    }

    /**
     *
     * click button kayak business it is available on the main page inside the section side
     */
    public void clickOnKayakBusinessButton(){

        logger.info("click on kayak for business ");
        kayakForBusinessField.click();
    }
/**
 * clicking on Ask Kayak section on the lift side of the UI
 * it will take you to ask kayak page
 */
public void clickOnAskKayakMainPage(){
    logger.info("Click on ask Kayak ");

    askKayakField.click();
}
}

