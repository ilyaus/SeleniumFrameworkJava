package test.com.xlilium.test.pages;

import com.xlilium.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    public HomePage() {
    }

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @FindBy(how = How.XPATH, using = ".//*[@id='logoutForm']/ul/li[1]/a")
    public WebElement txtLoggedInUser;

    public LoginPage ClickLogin() {
        lnkLogin.click();

        return GetInstance(LoginPage.class);
    }

    public boolean IsLogin() {
        return lnkLogin.isDisplayed();
    }

    public String GetLoggedInUser() {
        return txtLoggedInUser.getText();
    }
}
