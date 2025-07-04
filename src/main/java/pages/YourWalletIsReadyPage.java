package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class YourWalletIsReadyPage extends BasePage {

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Skip')]")
	private WebElement skipIWillDoItLaterButton;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Buy Crypto')]")
	private WebElement buyCryptoButton;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Deposit Crypto')]")
	private WebElement depositCryptoButton;

	/**
	 * Clicks the "Skip, I'll do it later" button.
	 */
	public void clickSkipIWillDoItLaterButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(skipIWillDoItLaterButton));
		skipIWillDoItLaterButton.click();
	}

	/**
	 * Clicks the "Buy Crypto" button.
	 */
	public void clickBuyCryptoButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(buyCryptoButton));
		log.info("Clicking on 'Buy Crypto' button");
		buyCryptoButton.click();
	}

	/**
	 * Clicks the "Deposit Crypto" button.
	 */
	public void clickDepositCryptoButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(depositCryptoButton));
		log.info("Clicking on 'Deposit Crypto' button");
		depositCryptoButton.click();
	}
}
