package tests;

import org.testng.annotations.Test;

public class CreateWalletTests extends BaseTest {

    @Test(description = "Verify new wallet creation with valid inputs")
    public void verifyNewWalletCreationWithValidInputs() {
        welcomePage.clickCreateNewWalletButton();
        createPasscodePage.enterFullPasscode(1);
        createPasscodePage.enterFullPasscode(1);
        yourWalletIsReadyPage.clickSkipIWillDoItLaterButton();
        homePageVerificationService.verifyWalletCreatedSuccessfully();
    }

    @Test(description = "Verify home page layout")
    public void verifyHomeScreenLayout() {
        welcomePage.clickCreateNewWalletButton();
        createPasscodePage.enterFullPasscode(1);
        createPasscodePage.enterFullPasscode(1);
        yourWalletIsReadyPage.clickSkipIWillDoItLaterButton();
        homePageVerificationService.verifyWalletHomepageLayout();
    }

    @Test(description = "Verify navigation to the home page through ‘Buy Crypto’ button from ‘Your wallet is ready’ page")
    public void verifyNavigationToHomePageThroughBuyCryptoButton() {
        welcomePage.clickCreateNewWalletButton();
        createPasscodePage.enterFullPasscode(1);
        createPasscodePage.enterFullPasscode(1);
        yourWalletIsReadyPage.clickBuyCryptoButton();
        buyCryptoPage.clickBackButton();
        homePageVerificationService.verifyWalletCreatedSuccessfully();
    }

    @Test(description = "Verify navigation to the home page through ‘Deposit Crypto’ button from ‘Your wallet is ready’ page")
    public void verifyNavigationToHomePageThroughDepositCryptoButton() {
        welcomePage.clickCreateNewWalletButton();
        createPasscodePage.enterFullPasscode(1);
        createPasscodePage.enterFullPasscode(1);
        yourWalletIsReadyPage.clickDepositCryptoButton();
        depositCryptoPage.clickBackButton();
        homePageVerificationService.verifyWalletCreatedSuccessfully();
    }

    @Test(description = "Verify error message is displayed after re-entering invalid passphrase during wallet creation")
    public void verifyErrorMessageAfterReEnterInvalidPassphrase() {
        welcomePage.clickCreateNewWalletButton();
        createPasscodePage.enterFullPasscode(1);
        createPasscodePage.enterFullPasscode(2);
        createPasscodeVerificationService.verifyPasscodeMismatchError();
    }
}