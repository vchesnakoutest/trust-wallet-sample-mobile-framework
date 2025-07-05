package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaiterUtils.waitForElementToBeClickable;

@Log4j2
public class YourWalletIsReadyPage extends BasePage {

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Skip')]")
	private WebElement skipIWillDoItLaterButton;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Buy Crypto')]")
	private WebElement buyCryptoButton;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Deposit Crypto')]")
	private WebElement depositCryptoButton;

	public void clickSkipIWillDoItLaterButton() {
		waitForElementToBeClickable(skipIWillDoItLaterButton);
		skipIWillDoItLaterButton.click();
	}

	public void clickBuyCryptoButton() {
		waitForElementToBeClickable(buyCryptoButton);
		log.info("Clicking on 'Buy Crypto' button");
		buyCryptoButton.click();
	}

	public void clickDepositCryptoButton() {
		waitForElementToBeClickable(depositCryptoButton);
		log.info("Clicking on 'Deposit Crypto' button");
		depositCryptoButton.click();
	}
}
