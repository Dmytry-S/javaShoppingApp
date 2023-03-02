package selenium.tests;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

import java.io.FileNotFoundException;

public class BaseTest {
    protected WebDriver driver = CommonActions.getNewDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected OverviewPage overviewPage = new OverviewPage(driver);
    protected ProductPage productPage = new ProductPage(driver);
    protected BucketPage bucketPage = new BucketPage(driver);
    protected CheckoutPage checkoutPage = new CheckoutPage(driver);
    protected CompletePage completePage = new CompletePage(driver);
    public BaseTest() throws FileNotFoundException {
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() throws FileNotFoundException {
        basePage.openPage();
    }
    @AfterTest(alwaysRun = true)
    public void afterTest() {
        driver.quit();
    }
}
