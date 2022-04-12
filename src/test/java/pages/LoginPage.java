package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public static final By USER_INFO_INPUT = By.id("username");
    public static final By PASSWORD_INFO_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(LOGIN_BUTTON);
    }

    public LoginPage open() {
        driver.get("https://itechart-d.my.salesforce.com/");
        return this;
    }

    public void login(String user, String password) {
        driver.findElement(USER_INFO_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INFO_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }
}