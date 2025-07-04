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

	/**
	 * Verifies that the wallet home page is displayed with the expected wallet name.
	 * @param expectedWalletName The expected name of the wallet.
	 */
	public void verifyWalletNameIsDisplayed(String expectedWalletName) {
		log.info("Verifying wallet name is displayed: {}", expectedWalletName);
		Assert.assertEquals(getTopBarWalletName(), expectedWalletName, "Wallet home page is not displayed.");
	}

	/**
	 * Verifies that the wallet home page displays the expected main balance.
	 * @param expectedWalletBalance The expected main balance of the wallet.
	 */
	public void verifyWalletBalance(String expectedWalletBalance) {
		log.info("Verifying wallet balance is displayed: {}", expectedWalletBalance);
		Assert.assertEquals(getMainBalance(), expectedWalletBalance, "Main balance does not match expected value.");
	}

	/**
	 * Verifies the layout of the wallet home page.
	 * This includes checking the visibility of various elements such as buttons and icons.
	 */
	public void verifyWalletHomepageLayout() {
		log.info("Verifying wallet home page layout.");
		waitForWalletHomePageDisplayed();
		Assert.assertTrue(isEmptyWalletTextDisplayed(), "Empty wallet text is not displayed.");
		Assert.assertTrue(isBuyCryptoButtonDisplayed(), "'Buy Crypto' button is not displayed.");
		Assert.assertTrue(isDepositCryptoButtonDisplayed(), "'Deposit Crypto' button is not displayed.");
		Assert.assertTrue(isManageCryptoButtonDisplayed(), "'Manage Crypto' button is not displayed.");
		Assert.assertTrue(isCryptoTabButtonDisplayed(), "Crypto tab button is not displayed.");
		Assert.assertTrue(isNftsTabButtonDisplayed(), "NFTs tab button is not displayed.");
		Assert.assertTrue(isAssetsLayoutSettingsIconDisplayed(), "Assets layout settings icon is not displayed.");
		Assert.assertTrue(isHomeSendButtonDisplayed(), "Home send button is not displayed.");
		Assert.assertTrue(isHomeReceiveButtonDisplayed(), "Home receive button is not displayed.");
		Assert.assertTrue(isHomeBuyButtonDisplayed(), "Home buy button is not displayed.");
		Assert.assertTrue(isHomeSellButtonDisplayed(), "Home sell button is not displayed.");
		Assert.assertTrue(isMainBalanceChange24hTitleDisplayed(), "Main balance change 24h title is not displayed.");
		Assert.assertTrue(isTopBarHistoryIconDisplayed(), "Top bar history icon is not displayed.");
		Assert.assertTrue(isTopBarQrIconDisplayed(), "Top bar QR icon is not displayed.");
		Assert.assertTrue(isTopBarSearchIconDisplayed(), "Top bar search icon is not displayed.");
	}
}