package com.xlilium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitialize extends Base {
    public void InitializeBrowser(BrowserType browserType) {

        WebDriver driver = null;

        switch (browserType) {
            case Chrome:
                System.setProperty("webdriver.chrome.driver", "D:\\tools\\webdrivers\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();

                break;
            case Firefox:
                System.setProperty("webdriver.gecko.driver","D:\\tools\\webdrivers\\geckodriver-v0.14.0.exe");
                driver = new FirefoxDriver();
                break;
        }

        DriverContext.setDriver(driver);
        DriverContext.browser = new Browser(driver);
    }
}