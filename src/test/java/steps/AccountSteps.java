package steps;

import dto.Account;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.AccountList;
import pages.NewAccountModal;

import static org.testng.Assert.assertTrue;

@Log4j2
public class AccountSteps {

    AccountList accountList;
    NewAccountModal newAccountModal;

    public AccountSteps(WebDriver driver) {
        accountList = new AccountList(driver);
        newAccountModal = new NewAccountModal(driver);
    }

    @Step("Creation of account: '{account.accountName}'")
    public void create(Account account) {
        log.info("Creation of account: '{account.accountName}'");
        accountList.open();
        accountList.clickNew();
        assertTrue(newAccountModal.isPageOpened(), "Модалка создания аккаунта не открылась");
        newAccountModal.create(account);
        newAccountModal.save();
        //TODO implement Account Details page
        //assertTrue(accountDetails.isPageOpened(), "Страница аккаунта не открылась");
    }
}