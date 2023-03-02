package pages;

import common.GetPropertyValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;


public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void openPage() throws FileNotFoundException {
        GetPropertyValue propertyValue = new GetPropertyValue();
        String url = propertyValue.getPropertyValue("config.baseUrl");
        driver.get(url);
    }
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    public BasePage clickButton(By selector) {
        driver.findElement(selector).click();
        return this;
    }
}

