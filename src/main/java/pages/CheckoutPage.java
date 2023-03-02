package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public CheckoutPage checkOut() {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(zipField).sendKeys(zip);
        return  this;
    }
    public BasePage clickContinue() {
        return clickButton(buttonContinue);
    }
    private final By firstNameField = By.cssSelector("#first-name");
    private final String firstName = "Dm";
    private final By lastNameField = By.cssSelector("#last-name");
    private final String lastName = "Sv";
    private final By zipField = By.cssSelector("#postal-code");
    private final String zip = "123";
    private final By buttonContinue = By.id("continue");
}

