package test.com.xlilium.test.seleniumtest;

import com.xlilium.utilities.ExcelUtil;
import org.junit.Test;
import test.com.xlilium.test.pages.HomePage;
import test.com.xlilium.test.pages.LoginPage;
import test.com.xlilium.test.features.steps.TestInitialize;


public class LoginTest extends TestInitialize {

    @Test
    public void Login() throws InterruptedException {

        currentPage = GetInstance(HomePage.class);
        currentPage = currentPage.As(HomePage.class).ClickLogin();

        Thread.sleep(2000);

        //CurrentPage.As(LoginPage.class).Login("admin", "password");
        currentPage.As(LoginPage.class).EnterLogin(ExcelUtil.ReadCell(0, 1), ExcelUtil.ReadCell(1,1));
    }
}