package com.xlilium.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitialize extends Base {
    public void InitializeBrowser(BrowserType browserType) {
        switch (browserType) {
            case Chrome:
                DriverContext.Driver = new ChromeDriver();
                break;
            case Firefox:
                System.setProperty("webdriver.gecko.driver","C:\\tools\\selenium\\webdrivers\\geckodriver-v0.14.0.exe");
                DriverContext.Driver = new FirefoxDriver();
                break;
        }
    }
}
