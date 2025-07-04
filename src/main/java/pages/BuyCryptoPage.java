package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class BuyCryptoPage extends BasePage {

	@FindBy(id = "toolbarButtonBack")
	private WebElement backButton;

	public void clickBackButton() {
		log.info("Clicking on the back button in Buy Crypto page");
		backButton.click();
	}
}
