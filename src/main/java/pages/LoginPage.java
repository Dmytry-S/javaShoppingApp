package pages;

import common.GetPropertyValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.FileNotFoundException;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) throws FileNotFoundException {
        super(driver);
    }
    GetPropertyValue propertyValue = new GetPropertyValue();
    String userName = propertyValue.getPropertyValue("config.userName");
    String password = propertyValue.getPropertyValue("config.password");
    public void loginToShop() {
        driver.findElement(userNameField).clear();
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(userPassField).clear();
        driver.findElement(userPassField).sendKeys(password);
    }

    public void clickButtonLogin() {
        clickButton(buttonLogin);
    }
    public void isLoginCorrect() {
        Assert.assertTrue(driver.findElement(homePageLogo).isDisplayed(), "Element not found");
    }

    private final By userNameField = By.id("user-name");
    private final By userPassField = By.id("password");
    private final By buttonLogin = By.id("login-button");
    private final By homePageLogo = By.cssSelector(".app_logo");
}
