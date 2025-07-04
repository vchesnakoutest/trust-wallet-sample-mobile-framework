package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtils {

    private static AppiumDriver driver;

    /**
     * Initializes the Appium driver with the desired capabilities.
     * This method should be called before using the driver.
     * Capability "disableIdLocatorAutocompletion" is set to true to prevent Appium from automatically completing ID locators.
     */
    public static void initializeDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", System.getProperty("user.dir") + "/src/apps/android/latest.apk");
        capabilities.setCapability("appium:platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:appPackage", "com.wallet.crypto.trustapp");
        capabilities.setCapability("appium:appActivity", "com.wallet.crypto.trustapp.ui.app.AppActivity");
        capabilities.setCapability("appium:disableIdLocatorAutocompletion", true);

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Appium server URL is invalid", e);
        }
    }

    /**
     * Returns the initialized Appium driver.
     * @return AppiumDriver instance
     * @throws IllegalStateException if the driver is not initialized
     */
    public static AppiumDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver not initialized. Please call initializeDriver first.");
        }
        return driver;
    }

    /**
     * Quits the Appium driver and sets it to null.
     * This method should be called after tests are completed to clean up resources.
     */
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
