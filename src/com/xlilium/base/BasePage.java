package com.xlilium.base;

import org.openqa.selenium.support.PageFactory;

public class BasePage extends Base {
    public BasePage() {
        PageFactory.initElements(DriverContext.Driver, this);
    }
}
