package com.xlilium.test.seleniumtest;

import com.xlilium.base.Base;
import com.xlilium.base.DriverContext;
import com.xlilium.test.pages.HomePage;
import com.xlilium.test.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest extends Base {

    @Before
    public void Initialize() {

        System.setProperty("webdriver.gecko.driver","C:\\tools\\selenium\\webdrivers\\geckodriver-v0.14.0.exe");

        DriverContext.Driver = new FirefoxDriver();
        DriverContext.Driver.navigate().to("http://localhost:64429/");
    }

    @Test
    public void Login() throws InterruptedException {

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();

        Thread.sleep(2000);

        CurrentPage.As(LoginPage.class).Login("admin", "password");
    }
}
