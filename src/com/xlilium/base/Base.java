package com.xlilium.base;

import org.openqa.selenium.support.PageFactory;

public class Base {

    public static BasePage CurrentPage;

    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page) {

        Object obj = PageFactory.initElements(DriverContext.driver, page);

        return page.cast(obj);
    }

    public <TPage extends BasePage> TPage As(Class<TPage> pageInstance) {
        try {
            return (TPage)this;
        }
        catch (Exception ex) {
            ex.getStackTrace();
        }

        return null;
    }
}
