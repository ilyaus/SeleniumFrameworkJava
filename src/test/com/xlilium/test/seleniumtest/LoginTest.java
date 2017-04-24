package test.com.xlilium.test.seleniumtest;

import com.xlilium.base.BrowserType;
import com.xlilium.base.DriverContext;
import com.xlilium.base.FrameworkInitialize;
import com.xlilium.utilities.ExcelUtil;
import com.xlilium.utilities.LogUtil;
import org.junit.Before;
import org.junit.Test;
import test.com.xlilium.test.pages.HomePage;
import test.com.xlilium.test.pages.LoginPage;

public class LoginTest extends FrameworkInitialize {

    @Before
    public void Initialize() {

        LogUtil logUtil = new LogUtil();
        logUtil.CreateLogFile();
        logUtil.Write("Initializing framework");

        try {
            ExcelUtil excelUtil = new ExcelUtil("c:\\Projects\\SeleniumFrameworkJava\\data.xls");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        InitializeBrowser(BrowserType.Firefox);
        DriverContext.browser.GoToUrl("http://localhost:64429/");
    }

    @Test
    public void Login() throws InterruptedException {

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();

        Thread.sleep(2000);

        //CurrentPage.As(LoginPage.class).Login("admin", "password");
        CurrentPage  = CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(0, 1), ExcelUtil.ReadCell(1,1));
    }
}
