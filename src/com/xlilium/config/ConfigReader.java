package com.xlilium.config;

import com.xlilium.base.BrowserType;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    private void ReadProperty() throws IOException {
        Properties p = new Properties();
        p.load(getClass().getResourceAsStream("GlobalConfig.properties"));

        Settings.excelPath = p.getProperty("ExcelDataPath");
        Settings.logPath = p.getProperty("LogPath");
        Settings.webDriverPath = p.getProperty("WebDriverPath");
        Settings.browserType = BrowserType.valueOf(p.getProperty("BrowserType"));
    }
}
