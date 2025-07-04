package tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CreatePasscodePage;
import pages.WalletHomePage;
import pages.WelcomePage;
import pages.YourWalletIsReadyPage;
import services.HomePageVerificationService;
import utils.DriverUtils;

public class BaseTest {

    protected WelcomePage welcomePage;
    protected CreatePasscodePage createPasscodePage;
    protected WalletHomePage walletHomePage;
    protected YourWalletIsReadyPage yourWalletIsReadyPage;
    protected HomePageVerificationService homePageVerificationService;

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
        initializePages();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

    /**
     * Initializes the page objects used in the tests.
     */
    private void initializePages() {
        welcomePage = new WelcomePage();
        createPasscodePage = new CreatePasscodePage();
        walletHomePage = new WalletHomePage();
        yourWalletIsReadyPage = new YourWalletIsReadyPage();
        homePageVerificationService = new HomePageVerificationService();
    }
}
