package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class BackupRecoveryPhrase extends BasePage {
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[4]")
    private MobileElement confirm;
    @AndroidFindBy(xpath = "(//*[contains(@class,'TextView')])[27]")
    private MobileElement copy;

    //Method to click confirm button
    public BackupRecoveryPhrase tapConfirm() {
        click(confirm, "press confirm option");
        return this;
    }
    /*
    Method to copy the recovery phrase
     */
    public BackupRecoveryPhrase tapCopy() {
        click(confirm, "press copy option");
        return this;
    }

    public void printCopiedText() {
        try {
            String data = (String) Toolkit.getDefaultToolkit()
                    .getSystemClipboard().getData(DataFlavor.stringFlavor);
            utils.log().info(data);
            System.out.println(data);
        } catch (UnsupportedFlavorException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
