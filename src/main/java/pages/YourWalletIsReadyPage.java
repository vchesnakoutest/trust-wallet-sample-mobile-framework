package pages;

import io.qameta.allure.Step;
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

	@Step("Clicking on 'Skip I will do it later' button")
	public void clickSkipIWillDoItLaterButton() {
		waitForElementToBeClickable(skipIWillDoItLaterButton);
		skipIWillDoItLaterButton.click();
	}

	@Step("Clicking on 'Buy Crypto' button")
	public void clickBuyCryptoButton() {
		waitForElementToBeClickable(buyCryptoButton);
		log.info("Clicking on 'Buy Crypto' button");
		buyCryptoButton.click();
	}

	@Step("Clicking on 'Deposit Crypto' button")
	public void clickDepositCryptoButton() {
		waitForElementToBeClickable(depositCryptoButton);
		log.info("Clicking on 'Deposit Crypto' button");
		depositCryptoButton.click();
	}
}
