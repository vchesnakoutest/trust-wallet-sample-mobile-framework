package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.DriverUtils.getDriver;

public class WaiterUtils {

	private static final int DEFAULT_WAITER_TIMEOUT = 30;

	/**
	 * Private constructor to prevent instantiation.
	 */
	private WaiterUtils() {
	}

	public static void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(DEFAULT_WAITER_TIMEOUT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitForElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(DEFAULT_WAITER_TIMEOUT));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
