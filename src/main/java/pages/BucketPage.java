package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BucketPage extends BasePage{
    public BucketPage(WebDriver driver) {
        super(driver);
    }
    public void isProductCorrect() {
        Assert.assertEquals(driver.findElement(productNameField).getText(), productName, "Element is incorrect");
    }
    public void goToCheckout() {
        clickButton(buttonCheckout);
    }
    private final String productName = "Sauce Labs Bolt T-Shirt";
    private final By productNameField = By.cssSelector(".inventory_item_name");
    private final By buttonCheckout = By.id("checkout");
}

