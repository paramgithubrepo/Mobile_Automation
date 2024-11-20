package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsScreen extends BasePage {
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[1]")
    private MobileElement backupRecPhr;

    //Method to click on backup recovery phrase
    public BackupRecoveryPhrase tapBackupRecPhr() {
        click(backupRecPhr, "press backup recovery phrase");
        return new BackupRecoveryPhrase();
    }


}
