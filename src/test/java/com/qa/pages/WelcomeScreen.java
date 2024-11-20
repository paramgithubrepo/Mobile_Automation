package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomeScreen extends BasePage{
    //Locator for Wlcome! message
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[1]")
    private MobileElement welMsg;

    //Locator for message
    @AndroidFindBy (xpath = "(//*[contains(@class,'TextView')])[2]")
    private MobileElement msgManage;

    //Locator for Create new wallet
    @AndroidFindBy (xpath = "(//*[contains(@class,'ViewGroup')]/*[contains(@class,'TextView')])[3]")
    private MobileElement createNewWallet;

    //Locator for Iv'e got a recovery Phrase
    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    private MobileElement errTxt2;

        //Method to get welcome Text
    public String getWelcomeTxt() {
        String wlcTxt = getText(welMsg, "Home Screen text is - ");
        return wlcTxt;
    }
    //Method to get Manage your money
    public String getManageTxt() {
        String wlcTxt1 = getText(msgManage, "Home Screen text is below welcome - ");
        return wlcTxt1;
    }

    //Method to click create new wallet
    public TermsConsent tapCreateWallet() {
        click(createNewWallet, "press create new wallet");
        return new TermsConsent();
    }

    }
