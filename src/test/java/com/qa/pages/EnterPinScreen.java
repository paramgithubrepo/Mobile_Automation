package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EnterPinScreen extends BasePage {


    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[3]")
    private MobileElement numOne;

    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[4]")
    private MobileElement numTwo;

    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[5]")
    private MobileElement numThree;

    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[6]")
    private MobileElement numFour;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'button2')]")
    private MobileElement cancelBiomet;

    public EnterPinScreen() {
    }

    /*
    Methods to set and re-enter the pin
     */
    public EnterPinScreen setPin() {
        click(numOne, "press pin 1");
        click(numFour, "press pin 4");
        click(numTwo, "press pin 2");
        click(numThree, "press pin 3");
        return this;
    }

    /*
    Methods to cancel biometric popup
     */
      public CreatingWallets cancelBio() {
        click(cancelBiomet, "cancel Bio-metric");
        return new CreatingWallets();
    }
}
