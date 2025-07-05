package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static utils.WaiterUtils.waitForElementToBeVisible;

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

	@FindBy(id = "invalidElement")
	private WebElement invalidElement;

	public String getTopBarWalletName() {
		return topBarWalletName.getText();
	}

	public String getMainBalance() {
		return mainBalance.getText();
	}

	public void waitForWalletHomePageDisplayed() {
		waitForElementToBeVisible(topBarWalletName);
		waitForElementToBeVisible(mainBalance);
	}

	public boolean isEmptyWalletTextDisplayed() {
		return emptyWalletText.isDisplayed();
	}

	public boolean isBuyCryptoButtonDisplayed() {
		return buyCryptoButton.isDisplayed();
	}

	public boolean isDepositCryptoButtonDisplayed() {
		return depositCryptoButton.isDisplayed();
	}

	public boolean isManageCryptoButtonDisplayed() {
		return manageCryptoButton.isDisplayed();
	}

	public boolean isCryptoTabButtonDisplayed() {
		return cryptoTabButton.isDisplayed();
	}

	public boolean isNftsTabButtonDisplayed() {
		return nftsTabButton.isDisplayed();
	}

	public boolean isAssetsLayoutSettingsIconDisplayed() {
		return assetsLayoutSettingsIcon.isDisplayed();
	}

	public boolean isHomeSendButtonDisplayed() {
		return homeSendButton.isDisplayed();
	}

	public boolean isHomeReceiveButtonDisplayed() {
		return homeReceiveButton.isDisplayed();
	}

	public boolean isHomeBuyButtonDisplayed() {
		return homeBuyButton.isDisplayed();
	}

	public boolean isHomeSellButtonDisplayed() {
		return homeSellButton.isDisplayed();
	}

	public boolean isMainBalanceChange24hTitleDisplayed() {
		return mainBalanceChange24hTitle.isDisplayed();
	}

	public boolean isTopBarHistoryIconDisplayed() {
		return topBarHistoryIcon.isDisplayed();
	}

	public boolean isTopBarQrIconDisplayed() {
		return topBarQrIcon.isDisplayed();
	}

	public boolean isTopBarSearchIconDisplayed() {
		return topBarSearchIcon.isDisplayed();
	}

	public void clickInvalidElement() {
			invalidElement.click();
	}
}
