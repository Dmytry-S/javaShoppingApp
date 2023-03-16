package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.io.*;

public class CommonActions {
    private static WebDriver driver;
    public static String browserName = "config.browser";
    private static WebDriver createDriver() throws FileNotFoundException {
        GetPropertyValue propertyValue = new GetPropertyValue();
        String browserType = System.getProperty(browserName);
        if(browserType == null){
            browserType = propertyValue.getPropertyValue(browserName);}
        switch (browserType) {
            case "firefox":
                System.setProperty("webdriver.firefox.driver", "drivers/macos/geckodriver");
                driver = new FirefoxDriver();
                break;
            default: System.setProperty("webdriver.chrome.driver", "drivers/macos/chromedriver");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        return driver;
    }
    public static WebDriver getNewDriver() throws FileNotFoundException {
        if(driver==null) {
            driver = createDriver();
        }
        return driver;
    }
}

