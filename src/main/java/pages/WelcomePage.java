package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class WelcomePage extends BasePage {

	@FindBy(id = "CreateNewWalletButton")
	private WebElement createNewWalletButton;

	/**
	 * Clicks the "Create New Wallet" button on the welcome page.
	 */
	@Step("Clicking on 'Create New Wallet' button")
	public void clickCreateNewWalletButton() {
		log.info("Clicking on 'Create New Wallet' button");
		createNewWalletButton.click();
	}

}
