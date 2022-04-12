package pages;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;

@Log4j2

public class NewAccountModal extends BasePage {

    public static final By SAVE = By.cssSelector("[title=Save]");


    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(SAVE);
    }

    public NewAccountModal create(Account account) {
        log.info("Creation acoount");
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebsite());
        new DropDown(driver, "Type").select(account.getType());
        return this;
    }

    public void save() {
        driver.findElement(SAVE).click();
    }
}
