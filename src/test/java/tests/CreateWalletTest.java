package tests;

import org.testng.annotations.Test;

public class CreateWalletTest extends BaseTest {

    @Test(description = "Verify new wallet creation with valid inputs")
    public void verifyNewWalletCreationWithValidInputs() {
        welcomePage.clickCreateNewWalletButton();
        createPasscodePage.enterFullPasscode(1);
        createPasscodePage.enterFullPasscode(1);
        yourWalletIsReadyPage.clickSkipIWillDoItLaterButton();
        homePageVerificationService.verifyWalletNameIsDisplayed("Main Wallet 1");
        homePageVerificationService.verifyWalletBalance("$0.00");
    }

    @Test(description = "Verify home page layout")
    public void verifyHomeScreenLayout() {
        welcomePage.clickCreateNewWalletButton();
        createPasscodePage.enterFullPasscode(1);
        createPasscodePage.enterFullPasscode(1);
        yourWalletIsReadyPage.clickSkipIWillDoItLaterButton();
        homePageVerificationService.verifyWalletHomepageLayout();
    }
}