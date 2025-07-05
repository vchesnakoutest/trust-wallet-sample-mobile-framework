package services;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import pages.WalletHomePage;

/**
 * Service class for verifying the wallet home page.
 * This class contains methods to verify various aspects of the wallet home page.
 */
@Log4j2
public class HomePageVerificationService extends WalletHomePage {

	public void verifyWalletNameIsDisplayed(String expectedWalletName) {
		log.info("Verifying wallet name is displayed: {}", expectedWalletName);
		Assert.assertEquals(getTopBarWalletName(), expectedWalletName, "Wallet home page is not displayed.");
	}

	public void verifyWalletCreatedSuccessfully() {
		log.info("Verifying wallet creation was successful.");
		verifyWalletNameIsDisplayed("Main Wallet 1");
		verifyWalletBalance("$0.00");
	}

	public void verifyWalletBalance(String expectedWalletBalance) {
		log.info("Verifying wallet balance is displayed: {}", expectedWalletBalance);
		Assert.assertEquals(getMainBalance(), expectedWalletBalance, "Main balance does not match expected value.");
	}

	public void verifyWalletHomepageLayout() {
		waitForWalletHomePageDisplayed();
		log.info("Verifying wallet home page layout:");
		log.info("Checking if empty wallet text is displayed.");
		Assert.assertTrue(isEmptyWalletTextDisplayed(), "Empty wallet text is not displayed.");
		log.info("Checking if 'Buy Crypto' button is displayed.");
		Assert.assertTrue(isBuyCryptoButtonDisplayed(), "'Buy Crypto' button is not displayed.");
		log.info("Checking if 'Deposit Crypto' button is displayed.");
		Assert.assertTrue(isDepositCryptoButtonDisplayed(), "'Deposit Crypto' button is not displayed.");
		log.info("Checking if 'Manage Crypto' button is displayed.");
		Assert.assertTrue(isManageCryptoButtonDisplayed(), "'Manage Crypto' button is not displayed.");
		log.info("Checking if 'Crypto' tab button is displayed.");
		Assert.assertTrue(isCryptoTabButtonDisplayed(), "Crypto tab button is not displayed.");
		log.info("Checking if 'NFTs' tab button is displayed.");
		Assert.assertTrue(isNftsTabButtonDisplayed(), "NFTs tab button is not displayed.");
		log.info("Checking if assets layout settings icon is displayed.");
		Assert.assertTrue(isAssetsLayoutSettingsIconDisplayed(), "Assets layout settings icon is not displayed.");
		log.info("Checking if home send button is displayed.");
		Assert.assertTrue(isHomeSendButtonDisplayed(), "Home send button is not displayed.");
		log.info("Checking if home receive button is displayed.");
		Assert.assertTrue(isHomeReceiveButtonDisplayed(), "Home receive button is not displayed.");
		log.info("Checking if home buy button is displayed.");
		Assert.assertTrue(isHomeBuyButtonDisplayed(), "Home buy button is not displayed.");
		log.info("Checking if home sell button is displayed.");
		Assert.assertTrue(isHomeSellButtonDisplayed(), "Home sell button is not displayed.");
		log.info("Checking if home swap button is displayed.");
		Assert.assertTrue(isMainBalanceChange24hTitleDisplayed(), "Main balance change 24h title is not displayed.");
		log.info("Checking if home swap button is displayed.");
		Assert.assertTrue(isTopBarHistoryIconDisplayed(), "Top bar history icon is not displayed.");
		log.info("Checking if top bar QR icon is displayed.");
		Assert.assertTrue(isTopBarQrIconDisplayed(), "Top bar QR icon is not displayed.");
		log.info("Checking if top bar search icon is displayed.");
		Assert.assertTrue(isTopBarSearchIconDisplayed(), "Top bar search icon is not displayed.");
	}

	public void verifyWalletHomePage() {
		log.info("Verifying wallet home page.");
		verifyWalletNameIsDisplayed("Main Wallet 1");
		verifyWalletBalance("$0.00");
		verifyWalletHomepageLayout();
		log.info("Wallet home page verification completed successfully.");
	}
}