package test.com.xlilium.test.features.steps;

import com.xlilium.base.Base;
import com.xlilium.utilities.CucumberUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import test.com.xlilium.test.pages.HomePage;
import test.com.xlilium.test.pages.LoginPage;


public class LoginSteps extends Base{

    @Given("^I see application opened$")
    public void iSeeApplicationOpened() throws Throwable {
        currentPage = GetInstance(HomePage.class);
        Assert.assertTrue("Login page is not found", currentPage.As(HomePage.class).IsLogin());
    }

    @Then("^I click login link$")
    public void iClickLoginLink() throws Throwable {
        currentPage = currentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(2000);
    }

    @When("^I enter UserName and Password$")
    public void iEnterUserNameAndPassword(DataTable data) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(data);

        currentPage.As(LoginPage.class).EnterLogin(CucumberUtil.GetCellValue("UserName"), CucumberUtil.GetCellValue("Password"));
        //currentPage.As(LoginPage.class).EnterLogin(table.get(1).get(0), table.get(1).get(1));
    }

    @Then("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        currentPage = currentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(2000);
    }

    @Then("^I should see the username with hello$")
    public void iShouldSeeTheUsernameWithHello() throws Throwable {
        Assert.assertEquals(currentPage.As(HomePage.class).GetLoggedInUser(), "Hello admin!");
    }
}
