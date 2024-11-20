package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.qa.utils.Constants.*;


public class LyowalletSteps {

    WelcomeScreen welcomeScreen = new WelcomeScreen();
    TermsConsent termsConsent = new TermsConsent();
    EnterPinScreen enterPinScreen = new EnterPinScreen();
    CreatingWallets creatingWallets = new CreatingWallets();
    WalletsScreen walletsScreen = new WalletsScreen();
    SettingsScreen settingsScreen = new SettingsScreen();
    BackupRecoveryPhrase backupRecoveryPhrase = new BackupRecoveryPhrase();


    @Given("Lyo Wallet application is launched in Mobile Device")
    public void lyo_wallet_application_is_launched_in_mobile_device() {
        Assert.assertEquals("Welcome Text is NOT equal to " + WELCOME_MESSAGE, welcomeScreen.getWelcomeTxt(), WELCOME_MESSAGE);
    }

    @Then("Welcome Manage messages are shown to me successfully")
    public void welcome_message_manage_messages_are_shown_to_me_successfully() {
        Assert.assertEquals("Manage Text is NOT equal to " + MANAGE_MESSAGE, welcomeScreen.getManageTxt(), MANAGE_MESSAGE);

    }

    @When("I accept the Terms & conditions")
    public void i_accept_the_terms_conditions() {
        welcomeScreen.tapCreateWallet();
        termsConsent.tapLetsStart();
    }

    @When("I should be able to setup pin")
    public void i_should_be_able_to_setup_pin() {
        enterPinScreen.setPin();
        enterPinScreen.setPin(); // to re-enter same pin again
    }

    @Then("Creating wallets message shown successfully")
    public void creating_wallets_message_shown_successfully(){
        enterPinScreen.cancelBio();
    }

    @Then("I should be able to view buttons like “Receive, Send, Exchange and Buy-Sell”")
    public void i_should_be_able_to_view_buttons_like_receive_send_exchange_and_buy_sell() {
        Assert.assertEquals("Receive option is NOT available" + RECEIVE_OPTION, walletsScreen.receiveOption(), RECEIVE_OPTION);
        Assert.assertEquals("Send option is NOT available" + SEND_OPTION, walletsScreen.sendOption(), SEND_OPTION);
        Assert.assertEquals("Exchange option is NOT available" + EXCHANGE_OPTION, walletsScreen.exchangeOption(), EXCHANGE_OPTION);
        Assert.assertEquals("Buy/Sell option is NOT available" + BUY_SELL_OPTION, walletsScreen.buySell(), BUY_SELL_OPTION);
    }

    @When("I click Settings and  Backup Recovery Phrase link and confirm back up your wallet")
    public void i_click_settings_and_backup_recovery_phrase_link_and_confirm_back_up_your_wallet() {
        walletsScreen.tapSettings();
        settingsScreen.tapBackupRecPhr();
    }

    @Then("I should be able to copy the recovery phrase and log")
    public void i_should_be_able_to_copy_the_recovery_phrase() {
        backupRecoveryPhrase.tapConfirm();
        backupRecoveryPhrase.tapCopy();
        backupRecoveryPhrase.printCopiedText();
    }


}
