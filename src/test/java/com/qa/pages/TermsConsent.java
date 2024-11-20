package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TermsConsent extends BasePage {
    //Locator for Lets Start
    @AndroidFindBy(xpath = ("(//*[contains(@class,'TextView')])[5]"))
    private MobileElement letsStart;


    //Method to click create new wallet
    public EnterPinScreen tapLetsStart() {
        click(letsStart, "press lets start");
        waitForSecs(2);
        return new EnterPinScreen();
    }
}
