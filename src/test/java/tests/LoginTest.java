package tests;

import dto.Account;

import org.testng.annotations.Test;


public class LoginTest extends BaseTest {


    @Test
    public void test() {
        //TODO create LoginSteps
        //loginSteps.login("asdasd", "asdasd");
        Account account = new Account("Test", "", "Analyst");
        accountSteps.create(account);
        //TODO implement validation mechanism
        //accountSteps.validate(account);
    }
}