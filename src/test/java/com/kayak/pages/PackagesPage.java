package com.kayak.pages;

import com.kayak.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PackagesPage {
    private static final Logger logger = LogManager.getLogger(BusinessPage.class);
    public PackagesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@role='link' and .='press@kayak.com']")
    WebElement northAmericaAddressField;

    @FindBy(xpath = "//a[@role='link' and .='Press']")
    WebElement pressLinkFiled;

    @FindBy(xpath = "//a[@role='link' and .='latam@kayak.com']")
    WebElement centralAndSouthAmericaField;


    @FindBy(xpath="//a[@role='link' and .='apacpr@kayak.com']")
    WebElement asiaAndPacificRegionFiled;

    @FindBy(xpath="//a[@role='link' and .='emea_pr@kayak.com']")
    WebElement europeAndAfricaField;


    //-----------------------------------Method/functions-----------

    /***
     * click on press link present on the package page
     */

    public void clickOnPressLink(){
        pressLinkFiled.click();
    }

    /**
     *checking if this element is enabled or disabled for north america email
     * @return true or false
     */
   public boolean isNorthAmericaEmailEnabled(){
        return northAmericaAddressField.isEnabled();
   }

    /**
     *checking if the element is enabled or disabled for south america and central too
     * @return true or false
     */
    public boolean isTheSouthAmericaEmailIsEnabled(){
        return centralAndSouthAmericaField.isEnabled();
    }
    /**
     *checking if the element is enabled or disabled for Asia and Pacific is enabled
     * @return true or false
     */
    public boolean isAsiaAndPacificLinkEnabled(){
        return asiaAndPacificRegionFiled.isEnabled();
    }
    /**
     *checking if the element is enabled or disabled for Europe and Africa is enabled
     * @return true or false
     */
    public boolean isEuropeAndAfricaLinkEnabled(){
        return asiaAndPacificRegionFiled.isEnabled();
    }


}
