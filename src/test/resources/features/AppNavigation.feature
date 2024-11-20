Feature: App Navigation
  As a Wallet User
  I access the Lyowallet android mobile application
  To navigate through the welcome page, accept terms & conditions and setup pin to create wallet and then access settings tab

  @RegressionTest
  Scenario: Verify Welcome Page Terms and Conditions Pin Setup Wallet Creation and Settings Tab
    Given Lyo Wallet application is launched in Mobile Device
    Then Welcome Manage messages are shown to me successfully
    When I accept the Terms & conditions
    And I should be able to setup pin
    Then Creating wallets message shown successfully
    And  I should be able to view buttons like “Receive, Send, Exchange and Buy-Sell”
    When I click Settings and  Backup Recovery Phrase link and confirm back up your wallet
    Then I should be able to copy the recovery phrase and log


 