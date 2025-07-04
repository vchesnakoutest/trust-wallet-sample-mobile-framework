package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class WalletHomePage extends BasePage {

	@FindBy(id = "topBarWalletName")
	private WebElement topBarWalletName;

	@FindBy(id = "mainBalance")
	private WebElement mainBalance;

	@FindBy(id = "topBarHistoryIcon")
	private WebElement topBarHistoryIcon;

	@FindBy(id = "topBarQrIcon")
	private WebElement topBarQrIcon;

	@FindBy(id = "topBarSearchIcon")
	private WebElement topBarSearchIcon;

	@FindBy(id = "mainBalanceChange24h")
	private WebElement mainBalanceChange24hTitle;

	@FindBy(id = "HomeSendButton")
	private WebElement homeSendButton;

	@FindBy(id = "HomeReceiveButton")
	private WebElement homeReceiveButton;

	@FindBy(id = "HomeBuyButton")
	private WebElement homeBuyButton;

	@FindBy(id = "HomeSellButton")
	private WebElement homeSellButton;

	@FindBy(id = "Crypto")
	private WebElement cryptoTabButton;

	@FindBy(id = "NFTs")
	private WebElement nftsTabButton;

	@FindBy(id = "assetsLayoutSettingsIcon")
	private WebElement assetsLayoutSettingsIcon;

	@FindBy(xpath = "//android.widget.TextView[@text='Your wallet is empty.']")
	private WebElement emptyWalletText;

	@FindBy(xpath = "//android.widget.TextView[@text='Buy Crypto']")
	private WebElement buyCryptoButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Deposit Crypto']")
	private WebElement depositCryptoButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Manage crypto']")
	private WebElement manageCryptoButton;

	/**
	 * Retrieves the name of the wallet displayed in the top bar.
	 * @return The name of the wallet as a String.
	 */
	public String getTopBarWalletName() {
		return topBarWalletName.getText();
	}

	/**
	 * Retrieves the main balance displayed on the wallet home page.
	 * @return The main balance as a String.
	 */
	public String getMainBalance() {
		return mainBalance.getText();
	}

	/**
	 * Waits if the wallet home page is displayed by verifying the presence of the top bar wallet name.
	 */
	public void waitForWalletHomePageDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(webDriver -> topBarWalletName.isDisplayed() && mainBalance.isDisplayed());
	}

	/**
	 * Checks if the empty wallet text is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isEmptyWalletTextDisplayed() {
		log.info("Checking if empty wallet text is displayed.");
		return emptyWalletText.isDisplayed();
	}

	/**
	 * Checks if the "Buy Crypto" button is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isBuyCryptoButtonDisplayed() {
		return buyCryptoButton.isDisplayed();
	}

	/**
	 * Checks if the "Deposit Crypto" button is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isDepositCryptoButtonDisplayed() {
		return depositCryptoButton.isDisplayed();
	}

	/**
	 * Checks if the "Manage Crypto" button is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isManageCryptoButtonDisplayed() {
		return manageCryptoButton.isDisplayed();
	}

	/**
	 * Checks if the crypto tab button is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isCryptoTabButtonDisplayed() {
		return cryptoTabButton.isDisplayed();
	}

	/**
	 * Checks if the NFTs tab button is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isNftsTabButtonDisplayed() {
		return nftsTabButton.isDisplayed();
	}

	/**
	 * Checks if the assets layout settings icon is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isAssetsLayoutSettingsIconDisplayed() {
		return assetsLayoutSettingsIcon.isDisplayed();
	}

	/**
	 * Checks if the home send button is displayed on the wallet home page.
	 * @return
	 */
	public boolean isHomeSendButtonDisplayed() {
		return homeSendButton.isDisplayed();
	}

	/**
	 * Checks if the home receive button is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isHomeReceiveButtonDisplayed() {
		return homeReceiveButton.isDisplayed();
	}

	/**
	 * Checks if the home buy button is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isHomeBuyButtonDisplayed() {
		return homeBuyButton.isDisplayed();
	}

	/**
	 * Checks if the home sell button is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isHomeSellButtonDisplayed() {
		return homeSellButton.isDisplayed();
	}

	/**
	 * Checks if the main balance change in the last 24 hours title is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isMainBalanceChange24hTitleDisplayed() {
		return mainBalanceChange24hTitle.isDisplayed();
	}

	/**
	 * Checks if the top bar history icon is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isTopBarHistoryIconDisplayed() {
		return topBarHistoryIcon.isDisplayed();
	}

	/**
	 * Checks if the top bar QR icon is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isTopBarQrIconDisplayed() {
		return topBarQrIcon.isDisplayed();
	}

	/**
	 * Checks if the top bar search icon is displayed on the wallet home page.
	 * @return boolean
	 */
	public boolean isTopBarSearchIconDisplayed() {
		return topBarSearchIcon.isDisplayed();
	}
}
