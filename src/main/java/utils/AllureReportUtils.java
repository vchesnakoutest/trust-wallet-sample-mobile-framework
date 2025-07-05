package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;

import static utils.DriverUtils.getDriver;

/**
 * AllureReportUtils is a utility class for taking screenshots and attaching them to Allure reports.
 */
public class AllureReportUtils {

	@Attachment(type = "image/png")
	public static byte[] takeScreenshot() {
		return getDriver().getScreenshotAs(OutputType.BYTES);
	}

}
