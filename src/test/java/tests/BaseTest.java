package tests;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.qameta.allure.Allure;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;
import services.CreatePasscodeVerificationService;
import services.HomePageVerificationService;
import utils.AppiumServerUtils;
import utils.DriverUtils;
import utils.TestListenerUtils;

import java.io.ByteArrayInputStream;

import static utils.AllureReportUtils.takeScreenshot;

@Listeners(TestListenerUtils.class)
public class BaseTest {
    private AppiumDriverLocalService appiumService;
    protected WelcomePage welcomePage;
    protected CreatePasscodePage createPasscodePage;
    protected WalletHomePage walletHomePage;
    protected YourWalletIsReadyPage yourWalletIsReadyPage;
    protected BuyCryptoPage buyCryptoPage;
    protected HomePageVerificationService homePageVerificationService;
    protected DepositCryptoPage depositCryptoPage;
    protected CreatePasscodeVerificationService createPasscodeVerificationService;

    @BeforeMethod
    public void setUp() {
        appiumService = AppiumServerUtils.startServer();
        DriverUtils.initializeDriver();
        initializePages();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            Allure.addAttachment("Screenshot on test failure", new ByteArrayInputStream(takeScreenshot()));
        }
        DriverUtils.quitDriver();
        appiumService.stop();
    }

    /**
     * Initializes the page objects used in the tests.
     */
    private void initializePages() {
        welcomePage = new WelcomePage();
        createPasscodePage = new CreatePasscodePage();
        walletHomePage = new WalletHomePage();
        yourWalletIsReadyPage = new YourWalletIsReadyPage();
        buyCryptoPage = new BuyCryptoPage();
        depositCryptoPage = new DepositCryptoPage();
        homePageVerificationService = new HomePageVerificationService();
        createPasscodeVerificationService = new CreatePasscodeVerificationService();
    }
}
