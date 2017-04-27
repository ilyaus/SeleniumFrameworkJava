package test.com.xlilium.test.features.steps;

import com.xlilium.base.BrowserType;
import com.xlilium.base.DriverContext;
import com.xlilium.base.FrameworkInitialize;
import com.xlilium.config.ConfigReader;
import com.xlilium.config.Settings;
import com.xlilium.utilities.ExcelUtil;
import com.xlilium.utilities.LogUtil;
import cucumber.api.java.Before;

import java.io.IOException;

public class TestInitialize extends FrameworkInitialize {
    @Before
    public void Initialize() {

        try {
            ConfigReader.PopulateSettings();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Settings.logUtil = new LogUtil();
        Settings.logUtil.CreateLogFile();
        Settings.logUtil.Write("Initializing framework");

        try {
            ExcelUtil excelUtil = new ExcelUtil(Settings.excelPath);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        InitializeBrowser(BrowserType.Firefox);
        DriverContext.browser.GoToUrl("http://localhost:64429/");
    }
}
