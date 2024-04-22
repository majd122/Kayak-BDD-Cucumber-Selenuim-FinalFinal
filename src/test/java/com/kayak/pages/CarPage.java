package com.kayak.pages;

import com.kayak.utilities.SeleniumUtils;
import io.cucumber.java.eo.Se;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarPage {

private static final Logger logger = LogManager.getLogger(CarPage.class);
    @FindBy(xpath = "//input[@class='NhpT NhpT-mod-radius-base NhpT-mod-corner-radius-all NhpT-mod-size-large NhpT-mod-state-default NhpT-mod-text-overflow-ellipsis NhpT-mod-theme-search NhpT-mod-validation-state-neutral NhpT-mod-validation-style-border NhpT-mod-reset-default-width']")
    WebElement locationField;
    @FindBy(xpath = "//div[@class='J_T2-field-group J_T2-mod-collapse-l J_T2-mod-spacing-y-xxsmall J_T2-mod-spacing-x-xxsmall J_T2-mod-grow']")
    WebElement dateField;
    @FindBy(xpath = "//div[@class='a7Uc-infix']")
    WebElement searchButtonField;

    @FindBy(xpath = "//a[@class='Iqt3 Iqt3-mod-bold Button-No-Standard-Style Iqt3-mod-variant-outline Iqt3-mod-theme-base Iqt3-mod-shape-rounded-small Iqt3-mod-shape-mod-default Iqt3-mod-spacing-default Iqt3-mod-size-small']")
    WebElement seeAllButton;

@FindBy(xpath = "//div[@class='c15uy c15uy-pres-simple c15uy-mod-variant-default']")
    WebElement sortByDropBox;
    @FindBy(xpath = "//li[@id='score_b']")
    WebElement bestScoreBox;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[5]/div[3]/div[1]/div/div[4]/div/div[2]/div[18]/div[3]/div[1]/div/div[2]/div[1]/div[1]/div[1]/div[3]/div/div[3]/div/div[2]/div[1]")
    WebElement rateFiled;





//------------------------------------methods--------------------


    /**
     * here we had click on the button see all
     */

    public void clickOnSeeAllButton(){
    logger.info("Click on See all button");

        SeleniumUtils.waitForElementToBeSelected(seeAllButton);
        seeAllButton.click();
}
    /**
     * here we had click on sort by our recommendation in the UI
     * here we will see a popup box
     */
    public void clickOnSortByButton(){
        logger.info("Click on the Sort by");
     sortByDropBox.click();

    }
    /**
     * this will method will click on Sore by and hover to the element and click
     */
    public void clickOnBestScoreSortBy(){
        logger.info("hover the web element and click on it ");
       SeleniumUtils.hoverWebelement(bestScoreBox);
       bestScoreBox.click();

    }

    /**
     * this method will return the rate displayed or not
     * @return boolean value true or false
     */
    public boolean isRateIsDisplayed(){
        logger.info("is actual result displayed in the UI");
       return rateFiled.isDisplayed();

    }


}
