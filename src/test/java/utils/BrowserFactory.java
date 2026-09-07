package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver launchBrowser(String browserChoice, String url) {
        if (driver != null) {
            return driver;
        }

        if (browserChoice.equalsIgnoreCase("ChroMe")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless=new");
            driver = new ChromeDriver(chromeOptions);
        } else if (browserChoice.equalsIgnoreCase("edge")) {
//            EdgeOptions edgeOptions = new EdgeOptions();
//            edgeOptions.addArguments("--headless=new");
//            driver = new EdgeDriver(edgeOptions);
            driver = new EdgeDriver();
            driver.manage().window().setSize(new Dimension(1920, 1080));
        } else {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
        //driver.manage().window().setSize(new Dimension(1920,1080));
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver has not been initialised. Call launchBrowser() first.");
        }
        return driver;
    }

    public static void quitBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
