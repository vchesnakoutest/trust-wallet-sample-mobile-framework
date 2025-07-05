package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CreatePasscodePage extends BasePage {

	private static final int MIN_KEYBOARD_DIGIT = 0;
	private static final int MAX_KEYBOARD_DIGIT = 9;
	private static final int MAX_PASSCODE_DIGITS = 6;
	private static final String KEYBOARD_DIGIT_BUTTON = "//android.widget.TextView[@text='%s']";

	@FindBy(xpath = "//android.widget.TextView[@text='Those passwords didn’t match!']")
	private WebElement passcodeMismatchError;

	public void clickDigitButton(int digit) {
		if (digit < MIN_KEYBOARD_DIGIT || digit > MAX_KEYBOARD_DIGIT) {
			throw new IllegalArgumentException("Digit must be between 0 and 9.");
		}
		String xpath = String.format(KEYBOARD_DIGIT_BUTTON, digit);
		WebElement digitButton = driver.findElement(By.xpath(xpath));
		log.info("Clicking digit button: {}", digit);
		digitButton.click();
	}

	@Step("Entering passcode digit: {digit}")
	public void enterFullPasscode(int digit) {
		enterPasscode(digit, MAX_PASSCODE_DIGITS);
	}

	public void enterPasscode(int digit, int times) {
		for (int i = 0; i < times; i++) {
			clickDigitButton(digit);
		}
	}

	public boolean isPasscodeMismatchErrorDisplayed() {
		return passcodeMismatchError.isDisplayed();
	}
}
