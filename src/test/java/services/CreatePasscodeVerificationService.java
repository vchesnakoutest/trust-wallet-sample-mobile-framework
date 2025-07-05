package services;

import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import pages.CreatePasscodePage;

/**
 * This service is responsible for creating a passcode verification.
 * It can be used to handle the logic related to passcode verification creation.
 */
@Log4j2
public class CreatePasscodeVerificationService extends CreatePasscodePage {

	public void verifyPasscodeMismatchError() {
		log.info("Verifying if passcode mismatch error is displayed");
		Assert.assertTrue(isPasscodeMismatchErrorDisplayed(), "Passcode mismatch error is not displayed.");
	}
}
