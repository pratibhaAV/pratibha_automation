package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import suite.SuiteManager;

public class BasePage extends SuiteManager {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="link-to-login")
    private WebElement loginButton;

    public LoginPage clickLoginButton(){
        loginButton.click();
        return new LoginPage();
    }

}
