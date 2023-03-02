package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OverviewPage extends BasePage{
    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    public void checkProductName() {
        Assert.assertEquals(driver.findElement(productName).getText(), productTitle, "Title is incorrect");
    }
    public void goToCompletePage() {
        clickButton(buttonFinish);
    }
    private final By productName = By.cssSelector(".inventory_item_name");
    private final String productTitle = "Sauce Labs Bolt T-Shirt";
    private final By buttonFinish = By.id("finish");
}
