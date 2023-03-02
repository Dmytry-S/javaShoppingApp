package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void openProductPage() {
        clickButton(productItem);
    }
    public void addToBucket() {
        clickButton(buttonAdd);
    }
    public void isProductInBucket() {
        Assert.assertTrue(driver.findElement(shopBadge).isDisplayed(), "Element not found");
    }
    public void goToBucket() {
        clickButton(buttonBucket);
    }
    private final By productItem = By.cssSelector(".inventory_list .inventory_item:nth-child(3)");
    private final By buttonAdd = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By shopBadge = By.cssSelector(".shopping_cart_badge");
    private final By buttonBucket = By.cssSelector(".shopping_cart_link");
}
