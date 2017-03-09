package com.xlilium.base;

import org.openqa.selenium.WebDriver;

public class Browser {
    private WebDriver _driver;
    public BrowserType type;

    public void GoToUrl(String url) {
        _driver.get(url);
    }

    public void Maximise() {
        _driver.manage().window().maximize();
    }
}

enum BrowserType {
    Firefox,
    Chrome
}
