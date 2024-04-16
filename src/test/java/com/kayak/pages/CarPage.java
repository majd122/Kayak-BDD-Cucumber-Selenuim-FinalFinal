package com.kayak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarPage {


    @FindBy(xpath = "//input[@class='NhpT NhpT-mod-radius-base NhpT-mod-corner-radius-all NhpT-mod-size-large NhpT-mod-state-default NhpT-mod-text-overflow-ellipsis NhpT-mod-theme-search NhpT-mod-validation-state-neutral NhpT-mod-validation-style-border NhpT-mod-reset-default-width']")
    WebElement locationField;
    @FindBy(xpath = "//div[@class='J_T2-field-group J_T2-mod-collapse-l J_T2-mod-spacing-y-xxsmall J_T2-mod-spacing-x-xxsmall J_T2-mod-grow']")
    WebElement dateField;
    @FindBy(xpath = "//div[@class='a7Uc-infix']")
    WebElement searchButtonField;


//------------------------------------methods--------------------





}
