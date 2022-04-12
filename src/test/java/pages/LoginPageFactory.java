package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageFactory extends BasePage {

    @FindBy(id = "username")
    WebElement useInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "Login")
    WebElement loginButton;

    public LoginPageFactory(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(By.id("Login"));
    }

    public void open() {
        driver.get("https://itechart-d.my.salesforce.com/");
        PageFactory.initElements(driver, this);
    }

    public void login(String user, String password) {
        useInput.sendKeys(user);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}