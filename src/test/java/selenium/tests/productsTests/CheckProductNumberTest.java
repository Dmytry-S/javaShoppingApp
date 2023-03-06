package selenium.tests.productsTests;

import org.testng.annotations.Test;
import selenium.tests.BaseTest;

import java.io.FileNotFoundException;

@Test
public class CheckProductNumberTest extends BaseTest {
    public CheckProductNumberTest() throws FileNotFoundException {
    }
    @Test(priority = 1)
    public void loginToApp() throws FileNotFoundException {
        basePage.openPage();
        loginPage.loginToShop();
        loginPage.clickButtonLogin();
        loginPage.isLoginCorrect();
    }
    @Test(priority = 2)
    public void isNumberCorrect() {
        productPage.isProductNumberCorrect();
    }
}
