package test.com.xlilium.test.pages;

import com.xlilium.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPage extends BasePage {
    public EmployeeListPage() {
    }

    @FindBy(how = How.CSS, using=".btn.btn-primary")
    public WebElement btnCreate;
}
