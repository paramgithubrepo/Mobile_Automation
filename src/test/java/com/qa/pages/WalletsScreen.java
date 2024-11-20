package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WalletsScreen extends BasePage{
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[2]")
    private MobileElement receive;
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[3]")
    private MobileElement send;
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[4]")
    private MobileElement exchange;
    @AndroidFindBy(xpath = " (//*[contains(@class,'TextView')])[5]")
    private MobileElement buySell;
    @AndroidFindBy(xpath = " (//android.view.View)[3]")
    private MobileElement settings;
    /*
    To get the Text of buttons like receive, send, exchange, buySell
     */
    public String receiveOption() {
        waitForSecs(30);
        String reciveOptionTxt = getText(receive, "Receive option is-");
        return reciveOptionTxt;
    }
    public String sendOption() {
        String sendOptionTxt = getText(send, "Send option is-");
        return sendOptionTxt;
    }
    public String exchangeOption() {
        String exchangeOptionTxt = getText(exchange, "Exchange option is-");
        return exchangeOptionTxt;
    }
    public String buySell() {
        String buySellOptionTxt = getText(buySell, "BuySell option is-");
        return buySellOptionTxt;
    }
    public SettingsScreen tapSettings() {
        click(settings, "press settings");
        return new SettingsScreen();
    }

}
