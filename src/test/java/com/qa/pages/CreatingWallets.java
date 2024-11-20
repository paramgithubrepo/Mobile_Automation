package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreatingWallets extends BasePage {
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[1]")
    private MobileElement createWalletMsg;

    /*
    To get the Wallet message for assertion
     */
    public String getCreateWalMsg() {
        String wlcTxt = getText(createWalletMsg, "Home Screen text is - ");
        return wlcTxt;
    }
}
