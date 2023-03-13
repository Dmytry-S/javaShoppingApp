package selenium.tests.productsTests;

import org.testng.annotations.Test;
import selenium.tests.BaseTest;

import java.io.FileNotFoundException;

public class AppProductTest extends BaseTest {
    public AppProductTest() throws FileNotFoundException {
    }
    @Test
    public void buyProductTest() {
        loginPage.loginToShop();
        loginPage.clickButtonLogin();
        loginPage.isLoginCorrect();
        productPage.openProductPage();
        productPage.addToBucket();
        productPage.isProductInBucket();
        productPage.goToBucket();
        bucketPage.isProductCorrect();
        bucketPage.goToCheckout();
        checkoutPage.checkOut();
        checkoutPage.clickContinue();
        overviewPage.checkProductName();
        overviewPage.goToCompletePage();
        completePage.isCompletePage();
    }
    @Test
    public void checkProductNumberTest() {
        loginPage.loginToShop();
        loginPage.clickButtonLogin();
        loginPage.isLoginCorrect();
        productPage.isProductNumberCorrect();
    }
}

