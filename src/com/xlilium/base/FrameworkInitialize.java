package com.xlilium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitialize extends Base {
    public void InitializeBrowser(BrowserType browserType) {

        WebDriver driver = null;

        switch (browserType) {
            case Chrome:
                System.setProperty("webdriver.chrome.driver", "d:\\tools\\selenium\\webdrivers\\chromedriver.exe");
                driver = new ChromeDriver();

                break;
            case Firefox:
                System.setProperty("webdriver.gecko.driver","d:\\tools\\selenium\\webdrivers\\geckodriver-v0.16.0.exe");
                driver = new FirefoxDriver();
                break;
        }

        DriverContext.setDriver(driver);
        DriverContext.browser = new Browser(driver);
    }
}