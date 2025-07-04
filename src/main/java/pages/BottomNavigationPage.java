package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class BottomNavigationPage extends BasePage {

	@FindBy(id = "HomeNavigationButton")
	private WebElement homeNavigationButton;

	@FindBy(id = "TrendingTokenNavigationButton")
	private WebElement trendingTokenNavigationButton;

	@FindBy(id = "SwapNavigationButton")
	private WebElement swapNavigationButton;

	public boolean isHomeNavigationButtonDisplayed() {
		log.info("Checking if Home Navigation Button is displayed");
		return homeNavigationButton.isDisplayed();
	}

	public boolean isTrendingTokenNavigationButtonDisplayed() {
		log.info("Checking if Trending Token Navigation Button is displayed");
		return trendingTokenNavigationButton.isDisplayed();
	}

	public boolean isSwapNavigationButtonDisplayed() {
		log.info("Checking if Swap Navigation Button is displayed");
		return swapNavigationButton.isDisplayed();
	}
}
