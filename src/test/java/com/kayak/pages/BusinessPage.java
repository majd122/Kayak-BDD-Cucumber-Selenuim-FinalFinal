package com.kayak.pages;

import com.kayak.utilities.Driver;
import com.kayak.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessPage {
    private static final Logger logger = LogManager.getLogger(BusinessPage.class);
public BusinessPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath = "(//button[normalize-space()='Contact us'])[1]")
    WebElement contactUsButtonField ;

@FindBy(xpath = "//div[@class='c508I-tier']//div[@class='RxNS-button-content'][normalize-space()='Sign up now']")
WebElement signUpField;
@FindBy(xpath="//div[@class='c508I-tier']//div[@class='RxNS-button-content'][normalize-space()='Get early access']")
WebElement getEarlyAccessField;

@FindBy(xpath="/html/body/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/section/div[1]/div/div[2]/div/div[3]/div/div[1]")
WebElement bizPlusField;





   // -------------------Method--------------------
    public boolean isBuzPlusIsDisplayed(){
        return bizPlusField.isDisplayed();

    }

    /**checking the ui if the contact button is enabled or not
     * boolean method
     * @return true or false
     */
    public boolean isContactUsButtonIsEnabled(){
    logger.info("Check the Ui if the element is enabled");


    return contactUsButtonField.isEnabled();
}


    /**
     *
     */
public boolean isBizFreeSignUpIsDisplayed(){
    return signUpField.isDisplayed();
}
public void clickOnContactUs(){

        contactUsButtonField.click();
}

}
