package com.kayak.pages;

import com.kayak.utilities.Driver;
import com.kayak.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AskKayakPage {
    private static final Logger logger = LogManager.getLogger(AskKayakPage.class);
    public AskKayakPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



@FindBy(xpath = "//div[@class='awr5-textarea-ellipsis awr5-mod-placeholder']")
    WebElement kayakSearchField;

    @FindBy(xpath = "//div[@class='Iqt3-button-content']")
    WebElement kayakClickButtonField ;
@FindBy(xpath = "//h2[@class='c9sKo-title']")
    WebElement hotelsLogoFiled;



//---------------------------------------------------------
    /**
     * This method will enter an input into the search bar field
     * @param input the username we are trying to enter
     */
    public void addTextToTheSearchBar(String input){
      logger.info("Entering input"+input+" into the search bar field");
      SeleniumUtils.highlightElement(kayakSearchField);
    //  SeleniumUtils.clickElementWithJavaScriptExecutor(kayakSearchField);
      kayakSearchField.sendKeys();
    }
    /**
     * This method will perform a click on the submit button
     */
    public void clickOnSubmitButton(){
        logger.info("Clicking on submit button");
       kayakClickButtonField.click();
    }
public boolean isHotelsRecommendationDisplayed(){

        return hotelsLogoFiled.isDisplayed();
}

}
