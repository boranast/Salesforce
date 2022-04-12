package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AccountList extends BasePage {

    public static final By TITLE = By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Accounts']");

    public AccountList(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public AccountList open() {
        driver.get("https://itechart-f.my.salesforce.com");
        isPageOpened();
        return this;
    }

    public NewAccountModal clickNew() {
        driver.findElement(By.cssSelector("a[title = new]")).click();
        return new NewAccountModal(driver);
    }
}
