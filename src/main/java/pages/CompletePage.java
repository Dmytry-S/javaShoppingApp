package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CompletePage extends BasePage{
    public CompletePage(WebDriver driver) {
        super(driver);
    }
    public void isCompletePage() {
        Assert.assertEquals(driver.findElement(completePage).getText(), completePageText, "Not complete page");
    }
    private final By completePage = By.cssSelector(".complete-header");
    private final String completePageText = "Thank you for your order!";
}
