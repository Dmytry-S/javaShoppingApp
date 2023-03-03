package selenium.tests;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

@Test
public class BuyProductTest extends BaseTest{
    public BuyProductTest() throws FileNotFoundException {
    }
    @Test(priority = 1)
    public void loginToApp() throws InterruptedException, FileNotFoundException {
        basePage.openPage();
        loginPage.loginToShop();
        loginPage.clickButtonLogin();
        loginPage.isLoginCorrect();
    }
    @Test(priority = 2)
    public void goToProduct() throws InterruptedException {
        productPage.openProductPage();
        productPage.addToBucket();
        productPage.isProductInBucket();
        productPage.goToBucket();
    }
    @Test(priority = 3)
    public void inBucket() throws InterruptedException {
        bucketPage.isProductCorrect();
        bucketPage.goToCheckout();
        TimeUnit.SECONDS.sleep(2);
    }
    @Test(priority = 4)
    public void checkout() throws InterruptedException {
        checkoutPage.checkOut();
        checkoutPage.clickContinue();
    }
    @Test(priority = 5)
    public void overview() throws InterruptedException {
        overviewPage.checkProductName();
        overviewPage.goToCompletePage();
    }
    @Test(priority = 6)
    public void complete() throws InterruptedException {
        completePage.isCompletePage();
    }
}
